package com.abc.cwb.service.impl;

import com.abc.cwb.dao.UserPojoMapper;
import com.abc.cwb.pojo.UserPojo;
import com.abc.cwb.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserPojoMapper userPojoMapper;

    @Override
    public UserPojo getOneUserById(Integer id) {
        return userPojoMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserPojo addOneUserById(Integer id) {
        return userPojoMapper.selectByPrimaryKey(id);
    }

}
