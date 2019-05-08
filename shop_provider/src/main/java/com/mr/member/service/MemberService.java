package com.mr.member.service;

import com.github.pagehelper.PageInfo;
import com.mr.pojo.Address;
import com.mr.utils.Page;

/**
 * Created by shun on 2019/5/5.
 */
public interface MemberService {
    PageInfo<Address> queryAddressList(Page page);
}
