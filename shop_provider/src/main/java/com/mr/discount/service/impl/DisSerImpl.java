package com.mr.discount.service.impl;

import com.mr.discount.mapper.DisMapper;
import com.mr.discount.service.DisSer;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.PrinterAbortException;
import java.util.List;

/**
 * Created by 1115393087 on 2019/5/9.
 */
@Service
public class DisSerImpl implements DisSer {

    @Autowired
    private DisMapper disMapper;

    @Override
    public List selectDis(Integer userId) {
        return disMapper.selectDis(userId);
    }

    @Override
    public void deleDiscont(Integer yhId) {
        disMapper.deleDiscont(yhId);
    }
}
