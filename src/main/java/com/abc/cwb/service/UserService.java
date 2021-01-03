package com.abc.cwb.service;

import com.abc.cwb.pojo.UserPojo;

public interface UserService {

    UserPojo getOneUserById(Integer id);

    UserPojo addOneUserById(Integer id);
}
