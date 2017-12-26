package com.bodu.mybatis.instruction;

import com.bodu.mybatis.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * project: bodu-mybatis
 * author: zhongyp
 * date: 2017/12/14
 * mail: zhongyp001@163.com
 */
public class IUserTest {
    @Test
    public void testIUser(){
        SqlSession sqlSession = SessionFactory.getCurrentSession();
        IUser iuser = sqlSession.getMapper(IUser.class);
        User user = iuser.getUserById(1);
        System.out.println(user.getWebsite());

    }

    @Test
    public void testAddUser(){
        SqlSession sqlSession = SessionFactory.getCurrentSession();
        IUser userMapper = sqlSession.getMapper(IUser.class);
        System.out.println("Test insert start...");
        // 执行插入
        User user = new User();
        user.setId(0);
        user.setName("Google");
        user.setDept("Tech");
        user.setWebsite("http://www.google.com");
        user.setPhone("120");
        userMapper.addUser(user);
        // 提交事务
        sqlSession.commit();
    }
}
