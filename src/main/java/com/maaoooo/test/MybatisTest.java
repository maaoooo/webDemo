package com.maaoooo.test;

import com.maaoooo.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author lzr
 * @date 2020 01 08:58
 * @description
 */
public class MybatisTest {
    public static void main(String[] args) {
        InputStream in=MybatisTest.class.getClassLoader().getResourceAsStream("conf/sqlMapCo·nfig.xml");
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf=ssfb.build(in);
        SqlSession session=ssf.openSession();
        User user=session.selectOne("UserMapper.SelectUserByUsername");
        System.out.println(user);
    }
}
