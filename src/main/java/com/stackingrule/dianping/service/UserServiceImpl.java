package com.stackingrule.dianping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.stackingrule.dianping.dal.UserModelMapper;
import com.stackingrule.dianping.model.UserModel;
import com.stackingrule.dianping.service.UserService;


/*
 *Created by Stackingrule 2019.12.16
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserModelMapper userModelMapper;


    @Override
    public UserModel getUser(Integer id) {
        return userModelMapper.selectByPrimaryKey(id);
    }
}
