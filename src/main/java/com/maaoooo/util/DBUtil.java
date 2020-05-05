package com.maaoooo.util;

import java.sql.*;

/**
 * @author lzr
 * @date 2020/4/30 15:42:41
 * @description
 */
public class DBUtil {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest?userUnicode=true&characterEncoding=UTF-8","root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }return null;
    }
    public static void close(Connection con,PreparedStatement pstmt,ResultSet rs){
        try {
            if(con!=null){
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(pstmt!=null){
                pstmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
