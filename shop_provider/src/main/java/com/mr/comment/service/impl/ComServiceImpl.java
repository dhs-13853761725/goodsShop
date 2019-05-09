package com.mr.comment.service.impl;

import com.mr.comment.mapper.ComMapper;
import com.mr.comment.service.ComService;
import com.mr.pojo.CommHtml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by 1115393087 on 2019/5/7.
 */
@Service
public class ComServiceImpl implements ComService{

    @Autowired
    private ComMapper comMapper;


    @Override
    public List selectComment(Integer orId) {
        return comMapper.selectComment(orId);
    }

    @Override
    public void comInsert(CommHtml commHtml) {
        commHtml.setEvaTime(new Date());
        comMapper.comInsert(commHtml);
        comMapper.updateOrderState(commHtml.getOrId());
    }
}
