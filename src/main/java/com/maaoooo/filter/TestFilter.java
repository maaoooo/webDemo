package com.maaoooo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(filterName = "TestFilter",urlPatterns = "/login.jsp")//也可以在web.xml配置,与配置servlet类似。
public class TestFilter implements Filter {
    private String Encoding;
    public void destroy() {
        System.out.println("销毁");
    }
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //过滤客户端发往服务器端的请求
        req.setCharacterEncoding("utf-8");
        chain.doFilter(req, resp);
        //chain后的代码是过滤服务器端发往用户的响应
    }
    public void init(FilterConfig config) throws ServletException {
        System.out.println("构造");
        //构造时读取配置文件到FilterConfig中
        Encoding=config.getInitParameter("Encoding");
        System.out.println("当前编码："+Encoding);
    }
}
