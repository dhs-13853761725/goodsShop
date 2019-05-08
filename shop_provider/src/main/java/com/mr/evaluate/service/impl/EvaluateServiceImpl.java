package com.mr.evaluate.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mr.evaluate.mapper.EvaluateMapper;
import com.mr.evaluate.service.EvaluateService;
import com.mr.pojo.Commodity;
import com.mr.pojo.Evaluate;
import com.mr.utils.Page;
import com.mr.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shun on 2019/5/8.
 */
@Service
public class EvaluateServiceImpl implements EvaluateService {

    @Autowired
    private EvaluateMapper evaluateMapper;

    @Override
    public PageInfo<Evaluate> queryEvaluateList(Page page) {
        if(null == page){
            page = new Page();
        }
        PageHelper.startPage(page.getPage(),page.getLimit());
        page.setSort(StringUtil.underscoreName(page.getSort()));
        List<Evaluate> list = evaluateMapper.queryEvaluateList();
        PageInfo<Evaluate> pageInfo = new PageInfo<Evaluate>(list);
        return pageInfo;
    }
}
