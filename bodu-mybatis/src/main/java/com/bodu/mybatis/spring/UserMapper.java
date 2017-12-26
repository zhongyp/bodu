package com.bodu.mybatis.spring;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * project: bodu-mybatis
 * author: zhongyp
 * date: 2017/12/18
 * mail: zhongyp001@163.com
 */
public interface UserMapper {

    public User getUserById(@Param("id") int id);
    public List<Order> getUserOrders(@Param("id") int id);
}
