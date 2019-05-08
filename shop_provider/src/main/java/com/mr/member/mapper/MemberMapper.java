package com.mr.member.mapper;

import com.mr.pojo.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by shun on 2019/5/5.
 */
@Mapper
public interface MemberMapper {

    List<Address> queryAddressList();
}
