package com.mr.pay.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.mr.pay.service.PayServiceFeign;
import com.mr.pojo.*;
import com.mr.shopcart.pojo.ResponCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by 1115393087 on 2019/4/30.
 */
@RestController
public class PayController {


    @Autowired
    private StringRedisTemplate redisTemplate;

    private final String APP_ID = "2016092700607009";
    private final String APP_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDLAPpLA7xsFULj8wAbV6freRDFv0K9BL1Z5at9NYChIsw3HD/W3rkek08WFI9OJALBG2aKibxO+gIqJTNPvcQAp5nRQLbwT+DeJpv0X+DTGnx0upIFzS5bK2fyQaPBY6ygvOS6FVipTM06O02MlvXnef/XdrWCjm7qPU1pmdgFbPeapOY27r9ktig/YH36QTFDkvUTqnjzUPIg9DOk9dzHnbye3317a3WSgnwOTdC9pjBgbUhZ1wA+f5QyNV1+uD8MIRbqEoGuzjmHC7BL9KG8XqcvsmxCu6HSBX5AT69CFfvRtsMVzexjkYEiUyjRCtslbXf9O0T1zPbJ7HtDwFJzAgMBAAECggEAFVhd+QNEjazSortLWJSn8GeDbveEYfGco1Y16O12P/szs9vBjqtOlbtxhmXVB6dbrshdyNVguoEpNxtAQPM4J8V3s/v1AGG1yEYRAeoO7sOLMI7pibigVi/DN0LVoCEF5sTV3AcgknSj46qWpeC9rIA0eYhe34JwgSq++AqYH0G80h3kGijA8mxYXOqwEJfgIra/HHMrmeVyJKAwmC0DLDz0DffK5aCIPd9M/1nwRW4tssolDMYK52YXNqF997PzVToILSOSSAWfzK05/LM1q/Enmm8sWEiuLfST6mhF+ce6Ra9n/g/UzXLz8mNobANPeownjDu1BF5Yc+em2v0uyQKBgQD3NgyC90S26B+FplJWIIeGo0qCqU403+uQe6QmST13ywHgNkI+yYwouJviiGrVd2Pnqkv9xlbsotv3ACmg4bcRIw9hWXTsywxVAxxP0KjJF2PSwr7m3bFWo1xctV0f0m9uM6RZSOULH6LxyfTq+kwUIJDl+PjOMEeu4uV0lxhbFwKBgQDSOJVVUMuv4KjPNIaYqhBr7qx2Av+5Pnz4XDn6Gd48vn1QGKxes9NEvMrRAC+/TQDlOaWDh67lv6M4RQDUYcprRoZYT/Jql05v9wZGEh4Z1j89Willikz15k06GXKQjHPqehXq14EDi1fT/EwoFyxQcRfIplXPTAbnTaszTgitBQKBgE3D6tun/S2sh337fBsr0HZCF8ZSjA+GAQxKWLDSiUuNyOFHMD+gFz8YE7GHSFQuYncV0yHZqq517MweePnrBzOU29m70lRK624ytE1HTlEz0msSaAsn4glnCj7/rnO8NuFrzV9o1uRQ52k4JptkcVpDhFFTqLDz7xjMt3GdtkOxAoGAWZmOZK+sMUljCfXMTHNnzmkLDr2We0EcCMteVrAB3gge5y2tAixJJuoE0/HtZ+8NK6ZXWmlRbVEx40Dd6qfHm9OSXT+uBip5XxV9kg4U0FRV3fN443N/++ruDY5dGykSGuVwRAkYTwdsJslJOGkwFRUu2vGyb0lrQ9kB2DsxTXUCgYAR+lJi1xnZohg3H/5xADXcPTmxP9e5jYXlHlR7KuInEEmPmsGQ4kyhQvkaX7ycV+8a6PvTBoCoMSaOXLUlQj3LkZsjqS/SvhJH54dDChXPu9ZBLZPFqfS8RZ4tvR6oMYy1YoDTOYXt4sGBQA16RWEANvXRExRoK6hge4ybUE/Muw==";
    private final String CHARSET = "UTF-8";
    private final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2WYzbGDQwG2Tu+AoeZOVVbKtMeYV8umyaWj9pnV/Cv2AGV6ZdUfdBIb8Xfc7uyzqLeK5waIrtx3ZIr0q+gmvNCNSmZss4xAkbfdUwt/EcuOkWjMvIpTxa84A1g2rEL7Be79MxunFg/aS8YkpoY5y2VaCq9MU83H1ZalPrPfxj2/a4XAZKyWjscgOBDdf0AiGjF1w6lhI7ZggD1wIVEb+xwU06HDx2Q4IFxmjrLbTToE+SsyxLPs+RGae6JRS81bHCR1x/8j9e3Zl94Vh68G2xAGJYzBLNC7vj04le54wexmjaXjTX7gK86bo/yb5AbCa5RR+UQZUSTBiNEskzQ2XmwIDAQAB";

    //这是沙箱接口路径,正式路径为https://openapi.alipay.com/gateway.do
    private final String GATEWAY_URL = "https://openapi.alipaydev.com/gateway.do";
    private final String FORMAT = "JSON";
    //签名方式
    private final String SIGN_TYPE = "RSA2";
    //支付宝异步通知路径,付款完毕后会异步调用本项目的方法,必须为公网地址
    private final String NOTIFY_URL = "http://192.168.43.113:8080/notifyUrl";
    //支付宝同步通知路径,也就是当付款完毕后跳转本项目的页面,可以不是公网地址
    private final String RETURN_URL = "http://127.0.0.1:8765/returnUrl";



    static {
        System.err.println("》》》》》》》》》》》》》》》》》》》》  支付初始化完成  《《《《《《《《《《《《《《《《《《《《");
    }


    @Autowired
    private PayServiceFeign payServiceFeign;


    @RequestMapping("payMain")
    public ModelAndView payMain1(CarComId c){
        ModelAndView mo = new ModelAndView();

        //把购买的数量添加进来
        payServiceFeign.updateCount(c);

        //查询当前用户上面绑定的所有地址
        List Addrlist  = payServiceFeign.payAddrList(c.getUserId());

        //获取购物车选中的东西
        //List paylist = payServiceFeign.qweqwecomList(userId,carId);
        List<ResponCar> paylist = payServiceFeign.qweqwecomList(c);

        //获取默认被选中的地址
        AddrUser addr = payServiceFeign.addrId(c.getUserId());

        //如果多个id 这里改成String 类型
        Integer comId = null;
        for (int i = 0; i < paylist.size(); i++) {
            comId = JSON.parseObject(JSON.toJSONString(paylist.get(i)),ResponCar.class).getComId();
        }


        //回显优惠卷
        ComUser com = new ComUser();
        com.setComId(comId);
        com.setUserId(addr.getUserId());
        List<YhVo> list = payServiceFeign.seleByYh(com);
        //从全部优惠卷中查询出 没有过期 已经生效
        List yhList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if(JSON.parseObject(JSON.toJSONString(list.get(i)),YhVo.class).getYhDateB().getTime() < new Date().getTime() && new Date().getTime() < JSON.parseObject(JSON.toJSONString(list.get(i)),YhVo.class).getYhDateE().getTime()){
                YhVo jsonObject = JSON.parseObject(JSON.toJSONString(list.get(i)),YhVo.class);
                yhList.add(jsonObject);
            }
            
        }

        //返回所有地址
        mo.addObject("addrList",Addrlist);
        mo.addObject("payList",paylist);
        mo.addObject("yhList",yhList);
        mo.addObject("o",addr);
        mo.addObject("userId",addr.getUserId());
        mo.addObject("gwId",c.getCarId());
        mo.addObject("comId",comId);
        mo.setViewName("/pay/pay");
        return mo;
    }







    @RequestMapping("alipay")
    @ResponseBody
    public void alipay(Order order, HttpServletResponse httpResponse) throws IOException {
        //实例化客户端,填入所需参数
        AlipayClient alipayClient = new DefaultAlipayClient(GATEWAY_URL, APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        //在公共参数中设置回跳和通知地址
        order.setOrDate(new Date());

        //默认为未付款
        order.setOrState(1);

        request.setReturnUrl(RETURN_URL);
        request.setNotifyUrl(NOTIFY_URL);
        //根据订单编号,查询订单相关信息
        String out_trade_no = null;
        if(order.getOrUuid1() == null){
            order.setOrUuid(UUID.randomUUID().toString());
            out_trade_no  = order.getOrUuid();
        }else{
            out_trade_no = order.getOrUuid1();
        }
        //Order order = payService.selectById(orderId);
        //商户订单号，商户网站订单系统中唯一订单号，必填

        //付款金额，必填
        String total_amount = order.getOrPrice().toString();//order.getOrderPrice().toString();
        //订单名称，必填
        String subject = "棒棒糖呀";//order.getOrderName();
        //商品描述，可空



        //如果前台没有传uuid  那么说明是普通支付   如果有么 肯定是一键支付
        if(order.getOrUuid1() == null){
            payServiceFeign.insertOrder(order);
        }
        //生成订单
        redisTemplate.opsForValue().set("q"+out_trade_no,"qwew");
        redisTemplate.expire("q"+out_trade_no,300, TimeUnit.SECONDS);

        System.err.println("已生成订单 订单号为:{"+order.getOrUuid()+"}");

        //删除购物车中的数据
        if(order.getCarId() != null){
            //payServiceFeign.deleCarShopId(order.getCarId());
            //System.err.println("以删除购物车中{"+order.getCarId()+"}的数据");
        }
        String body = "";//order.toString();//out_trade_no
        request.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        String form = "";
        try {
            form = alipayClient.pageExecute(request).getBody(); // 调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + CHARSET);
        httpResponse.getWriter().write(form);// 直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }


    @RequestMapping(value = "/returnUrl", method = RequestMethod.GET)
    public ModelAndView returnUrl(HttpServletRequest request, HttpServletResponse response)
            throws IOException, AlipayApiException {
        ModelAndView mo = new ModelAndView();
        System.out.println("=================================同步回调=====================================");

        // 获取支付宝GET过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            // 乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("utf-8"), "utf-8");
            params.put(name, valueStr);
        }

        System.out.println(params);//查看参数都有哪些
        boolean signVerified = AlipaySignature.rsaCheckV1(params, ALIPAY_PUBLIC_KEY, CHARSET, SIGN_TYPE); // 调用SDK验证签名
        //验证签名通过
        if(signVerified){
            // 商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

            // 支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

            // 付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

            //String body1 = new String(request.getParameter("body").getBytes("ISO-8859-1"), "UTF-8");



            System.err.println("商户订单号="+out_trade_no);
            System.err.println("支付宝交易号="+trade_no);
            System.err.println("付款金额="+total_amount);
            //System.err.println("购物车主键="+body1);


            //通过订单号  修改状态为支付成功
            payServiceFeign.updateState(out_trade_no);
            System.err.println("订单支付成功  订单号为:{"+out_trade_no+"}");
            //支付详情

            Order ok  = payServiceFeign.selectByPrice(out_trade_no);
            AddrUser addrUser = payServiceFeign.selectByAddrId(1);
            PayOrder po = new PayOrder();
            po.setOrId(ok.getOrId());
            po.setUserId(ok.getUserId());
            po.setPayPrice(Double.valueOf(total_amount));
            po.setPayUuid(UUID.randomUUID().toString());
            po.setPayDate(new Date());

            //生成支付详情消息
            payServiceFeign.payOrderContent(po);

            mo.addObject("o",addrUser);
            mo.addObject("price",total_amount);
            mo.addObject("userId",ok.getUserId());
            //如果支付成功   那么订单不会在过期
            Boolean delete = redisTemplate.delete("q" + ok.getOrUuid());
            System.err.println("是否删除key成功{ "+delete+" }");

            //等key过期后自动收货
            redisTemplate.opsForValue().set("a"+out_trade_no,"qwew");
            redisTemplate.expire("a"+out_trade_no,60, TimeUnit.SECONDS);

            mo.setViewName("/pay/success");
            return mo;//跳转付款成功页面
        }else{
            mo.setViewName("/pay/no");
            return mo;//跳转付款失败页面
        }

    }






    //打开个人主页
    @RequestMapping("myMain")
    public ModelAndView myMain(){
        ModelAndView mo = new ModelAndView();
        mo.setViewName("/my");
        return mo;
    }



    //打开订单管理
    @RequestMapping("orderMain")
    public ModelAndView orderMain(Integer userId){
        ModelAndView mo = new ModelAndView();

        //返回了所有的订单
        List list = payServiceFeign.selectOrder(userId);

        //返回未支付的订单
        List listUnpaidl = payServiceFeign.selectUnpaid(userId);

        //查询支付成功的订单
        List<OrderVo> successList = payServiceFeign.selectSuccess(userId);

        //未收货的集合
        List  weiAccept = new ArrayList();

        //已收货的集合
        List  yiAccept = new ArrayList();
        //分辨出已收货跟未收货的订单  1 未收货   2  已收货
        for (int i = 0; i <successList.size() ; i++) {
            //判断所有未收货的  放入到一个集合种
            OrderVo orderVo = JSON.parseObject(JSON.toJSONString(successList.get(i)),OrderVo.class);
            if(orderVo.getOrAccept() == 1){
                weiAccept.add(orderVo);
            }else if(orderVo.getOrAccept() == 2) {
                //已经收到货  并且 是没有评论过的商品
                if(orderVo.getOrIfcomment() == 1){
                    yiAccept.add(orderVo);
                }
            }
        }


        //所有订单
        mo.addObject("list",list);

        //未支付的订单
        mo.addObject("listUnpaidl",listUnpaidl);

        //已支付的订单
        mo.addObject("successList",successList);

        //未发货的订单
        mo.addObject("weiAccept",weiAccept);

        //已收货的订单
        mo.addObject("yiAccept",yiAccept);

        mo.setViewName("/order/order");
        return mo;
    }


    //删除订单
    @RequestMapping("orderDele")
    public void orderDele(Integer orId){
        payServiceFeign.orderDele(orId);
    }


    //打开物流页面
    @RequestMapping("logisticsMain")
    public ModelAndView logisticsMain(OrderVo order){
        ModelAndView mo = new ModelAndView();
        mo.setViewName("/logistics/logistics");
        return mo;
    }

    //提醒发货
    @RequestMapping("mailShipment")
    public void mailShipment(String userId,String orUuid){
        redisTemplate.opsForValue().set(userId+","+orUuid,"qwew");
        redisTemplate.expire(userId+","+orUuid,2, TimeUnit.SECONDS);
    }


}
