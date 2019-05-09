package com.mr.discount.service;

import java.util.List;

/**
 * Created by 1115393087 on 2019/5/9.
 */
public interface DisSer {


    List selectDis(Integer userId);

    void deleDiscont(Integer yhId);
}
