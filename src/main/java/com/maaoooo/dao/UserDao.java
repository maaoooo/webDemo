package com.maaoooo.dao;

import com.maaoooo.bean.User;
import com.maaoooo.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author lzr
 * @date 2020/4/30 15:41:30
 * @description
 */
public class UserDao {
    public boolean isExistByName(String username){
        Connection con=DBUtil.getConnection();
        ResultSet rs=null;
        PreparedStatement pstmt= null;
        try {
            pstmt = con.prepareStatement("select * from user where username=?");
            pstmt.setString(1,username);
            rs=pstmt.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(con,pstmt,rs);
        }
        return false;
    }
    public int registerUser(String username,String password){
        Connection con=DBUtil.getConnection();
        ResultSet rs=null;
        PreparedStatement pstmt= null;
        try {
            pstmt=con.prepareStatement("insert into user(username,password) value(?,?)");
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(con,pstmt,rs);
        }
        return -1;
    }
}
