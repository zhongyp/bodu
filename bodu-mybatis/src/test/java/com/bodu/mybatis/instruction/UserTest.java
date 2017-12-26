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
public class UserTest {
    @Test
    public void testUser(){
        SqlSession session = SessionFactory.getCurrentSession();
        try {
            User user = (User) session.selectOne("com.bodu.mybatis.instruction.UserMapper.GetUserByID", 1);
            if(user!=null){
                String userInfo = "名字："+user.getName()+", 所属部门："+user.getDept()+", 主页："+user.getWebsite();
                System.out.println(userInfo);
            }
        } finally {
            session.close();
        }
    }
}
