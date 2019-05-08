package com.mr.evaluate.controller;

import com.github.pagehelper.PageInfo;
import com.mr.evaluate.service.EvaluateService;
import com.mr.pojo.Commodity;
import com.mr.pojo.Evaluate;
import com.mr.utils.DataGridVo;
import com.mr.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by shun on 2019/5/8.
 */
@Controller
@RequestMapping("evaluate")
public class EvaluateController {

    @Autowired
    private EvaluateService evaluateService;

    /**
     * 查看商品评论列表信息
     * @param page
     * @return
     */
    @RequestMapping("queryEvaluateList")
    @ResponseBody
    public DataGridVo<Evaluate> queryEvaluateList(Page page){
        PageInfo<Evaluate> pageInfo = evaluateService.queryEvaluateList(page);
        DataGridVo<Evaluate> dataGridVo = new DataGridVo<Evaluate>(0,"",pageInfo.getTotal(),pageInfo.getList());
        return dataGridVo;
    }
    /**
     * 查询
     * @return
     */
    @RequestMapping("selectEva")
    @ResponseBody
    public List selectl(){
        List lll =evaluateService.selectl();
        return lll;
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("selectddd")
    public List selectddd(){
        List list = evaluateService.selectddd();
        return list;
    }

}
