package com.mr.comment.service;

import com.mr.pojo.CommHtml;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 1115393087 on 2019/5/7.
 */
@FeignClient("PROVIDER-SHOP")
public interface ComService {

    //查询当前
    @RequestMapping("selectComment")
    List selectComment(@RequestBody Integer orId);

    //添加到评论
    @RequestMapping("comInsert1")
    void comInsert(@RequestBody CommHtml commHtml);
}
