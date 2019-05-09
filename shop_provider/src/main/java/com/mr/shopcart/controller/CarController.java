package com.mr.shopcart.controller;

import com.mr.shopcart.pojo.ResponCar;
import com.mr.shopcart.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 1115393087 on 2019/4/30.
 */
@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @ResponseBody
    @RequestMapping(value = "shopcartMain1",produces = "application/json")
    public List shopcartMain1(@RequestBody ResponCar responCar){
        //responCar.setUserId(1);
        List<ResponCar>carList = null;
        if(responCar != null && responCar.getUserId() != null){
            //购物车中的所有数据
            carList = carService.queryListAll(responCar.getUserId());
            System.err.println(carList);
            //查询商品信息
         /*   List<Commodity> goodsList = carService.goodsListAll();
            System.err.println(goodsList);
            for (int i = 0; i < carList.size(); i++) {
                for (int j = 0; j < goodsList.size() ; j++) {
                    if(carList.get(i).getCarContent().contains(goodsList.get(j).getComId().toString())){
                        //商品名称
                        carList.get(i).setComName(goodsList.get(j).getComName());
                        //商品原价
                        carList.get(i).setComPrice(goodsList.get(j).getComPrice());
                        //商品优惠后价格
                        carList.get(i).setComMoney(goodsList.get(j).getComMoney());
                        //运费
                        carList.get(i).setComFreight(goodsList.get(j).getComFreight());
                        //类型
                        carList.get(i).setComFlavor(goodsList.get(j).getComFlavor().toString());
                        //包装
                        carList.get(i).setComPack(goodsList.get(j).getComPack().toString());
                        break;
                    }
                    break;
                }
            }*/
        }
        return carList;
    }

    @RequestMapping("insertCarShop1")
    public void insertCarShop(@RequestBody ResponCar car){
        carService.insertCarShop(car);
    }

}
