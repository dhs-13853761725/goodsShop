package com.mr.member.controller;

import com.github.pagehelper.PageInfo;
import com.mr.member.service.MemberService;
import com.mr.pojo.Address;
import com.mr.utils.DataGridVo;
import com.mr.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.crypto.MacSpi;
import java.util.Map;

/**
 * Created by shun on 2019/4/29.
 */
@Controller
@RequestMapping("member")
public class MemberController {


    @Autowired
    private MemberService memberService;

    /**
     * 打开后台会员管理页面
     * @return
     */
    @RequestMapping("goMember")
    public String goMember(){
        return "member/main-member";
    }

    /**
     * 打开用户界面
     * @return
     */
    @RequestMapping("userPage")
    public String userPage(){
        return "member/user-page";
    }

    /**
     * 打开地址界面
     * @return
     */
    @RequestMapping("addressPage")
    public String addressPage(){
        return "member/address-page";
    }

    @ResponseBody
    @RequestMapping("queryAddressList")
    public DataGridVo<Address> queryAddressList(Page page){
        PageInfo<Address> pageBank = memberService.queryAddressList(page);
        DataGridVo<Address> address = new DataGridVo<Address>(0,"",pageBank.getTotal(),pageBank.getList());
        return address;
    }

    /**
     * 打开收藏界面
     * @return
     */
    @RequestMapping("collectionPage")
    public String collectionPage(){
        return "member/collection-page";
    }

    /**
     * 打开足迹界面
     * @return
     */
    @RequestMapping("footPage")
    public String footPage(){
        return "member/foot-page";
    }

    /**
     * 打开空页面
     * @return
     */
    @RequestMapping("nullPage")
    public String nullPage(){
        return "member/null-page";
    }

    /**
     * 打开订单界面
     * @return
     */
    @RequestMapping("orderPage")
    public String orderPage(){
        return "member/order-page";
    }

    /**
     * 打开商品评价页面
     * @return
     */
    @RequestMapping("evaluatePage")
    public String evaluatePage(){
        return "member/evaluate-page";
    }

    /**
     *打开商品列表页面
     * @return
     */
    @RequestMapping("goodsListPage")
    public String goodsListPage(){
        return "member/goodsList-page";
    }

    /**
     * 打开新增商品页面
     * @return
     */
    @RequestMapping("goodsAddPage")
    public String goodsAddPage(){
        return "member/goodsAdd-page";
    }

    /**
     * 打开优惠券页面
     * @return
     */
    @RequestMapping("discountPage")
    public String discountPage(){
        return "member/discount-page";
    }

}
