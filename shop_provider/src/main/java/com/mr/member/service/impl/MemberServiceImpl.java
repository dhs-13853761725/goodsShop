package com.mr.member.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mr.member.mapper.MemberMapper;
import com.mr.member.service.MemberService;
import com.mr.pojo.Address;
import com.mr.utils.Page;
import com.mr.utils.StringUtil;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shun on 2019/5/5.
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public PageInfo<Address> queryAddressList(Page page) {
        if(null == page){
            page = new Page();
        }
        PageHelper.startPage(page.getPage(),page.getLimit());
        page.setSort(StringUtil.underscoreName(page.getSort()));
        List<Address> addressList = memberMapper.queryAddressList();
        PageInfo<Address> pageInfo = new PageInfo<Address>(addressList);
        return pageInfo;
    }
}
