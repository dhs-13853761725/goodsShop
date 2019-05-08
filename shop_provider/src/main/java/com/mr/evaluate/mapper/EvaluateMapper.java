package com.mr.evaluate.mapper;

import com.mr.pojo.Evaluate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by shun on 2019/5/8.
 */
@Mapper
public interface EvaluateMapper {
    List<Evaluate> queryEvaluateList();
}
