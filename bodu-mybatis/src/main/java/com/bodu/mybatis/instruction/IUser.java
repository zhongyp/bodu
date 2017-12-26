package com.bodu.mybatis.instruction;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * project: bodu-mybatis
 * author: zhongyp
 * date: 2017/12/14
 * mail: zhongyp001@163.com
 */
public interface IUser {
    @Select("select * from `mybatis-user` where id = #{id}")
    public User getUserById(int i);
    public List getUserList();
    public void addUser(User user);
    public void delUser();
    public void updateUser();

}
