package com.maaoooo.controllor;

import com.maaoooo.service.UserService;

import java.io.IOException;

public class registerServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        UserService userService=new UserService();
        int rs=userService.registerUser(username,password);
        if(rs==1){
            //注册成功
            request.setAttribute("msg","success");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }else if(rs==-1){
            //已有用户
        }else if(rs==-2){
            //数据库写入失败
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
