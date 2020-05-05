package com.maaoooo.mapper;

import com.maaoooo.bean.User;

/**
 * @author lzr
 * @date 2020 01 17:13
 * @description
 */
public interface UserMapper {
    public User SelectUserByUsername(String name);
}
