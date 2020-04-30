package com.maaoooo.service;

import com.maaoooo.bean.User;
import com.maaoooo.dao.UserDao;

/**
 * @author lzr
 * @date 2020/4/30 15:35:19
 * @description
 */
public class UserService {
        UserDao userDao=new UserDao();
    public boolean isExist(String username){
        return userDao.isExistByName(username);
    }
    public int registerUser(String username,String password){
        if(isExist(username)){
            return -1;
        }else {
            //TODO
            int rs=userDao.registerUser(username,password);
            if(rs==1){
                return 1;
            }else {
                return -2;
            }
        }
    }
}
