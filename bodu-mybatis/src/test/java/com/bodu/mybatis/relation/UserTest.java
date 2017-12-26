package com.bodu.mybatis.relation;

import com.bodu.mybatis.util.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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
            int userid = 1;
            User user = session.selectOne("com.bodu.mybatis.relation.UserMapper.getUser", 1);
            System.out.println("username: "+user.getUsername()+",");
            List<Post> posts = user.getPosts();
            for(Post p : posts) {
                System.out.println("Title:" + p.getTitle());
                System.out.println("Content:" + p.getContent());
            }
        } finally {
            session.close();
        }
    }
    @Test
    public void testMany2One(){
        SqlSession session = SessionFactory.getCurrentSession();
        try {
            int postId = 1;
            Post post = session.selectOne("com.bodu.mybatis.relation.userMaper.getPosts", postId);
            System.out.println("title: "+post.getTitle());
            System.out.println("userName: "+post.getUser().getUsername());
        } finally {
            session.close();
        }
    }
}
