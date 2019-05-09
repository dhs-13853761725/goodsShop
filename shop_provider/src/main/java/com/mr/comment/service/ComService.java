package com.mr.comment.service;

import com.mr.pojo.CommHtml;

import java.util.List;

/**
 * Created by 1115393087 on 2019/5/7.
 */
public interface ComService {

    List selectComment(Integer orId);

    void comInsert(CommHtml commHtml);
}
