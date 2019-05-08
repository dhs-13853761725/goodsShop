package com.mr.evaluate.service;

import com.github.pagehelper.PageInfo;
import com.mr.pojo.Evaluate;
import com.mr.utils.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by shun on 2019/5/8.
 */
public interface EvaluateService {
    PageInfo<Evaluate> queryEvaluateList(Page page);

    List selectl();

    List selectddd();
}
