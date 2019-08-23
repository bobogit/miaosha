package com.miaoshaproject.service.impl;

import com.miaoshaproject.dao.UserDOMapper;
import com.miaoshaproject.dao.UserPasswordDOMapper;
import com.miaoshaproject.dataobject.UserDO;
import com.miaoshaproject.dataobject.UserPasswordDO;
import com.miaoshaproject.service.UserService;
import com.miaoshaproject.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By wangbo
 * 2019/8/23
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserModel getUserById(Integer id) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);

        if(userDO == null) {
            return null;
        }

        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(id);

        return convertFromDataObject(userDO, userPasswordDO);

    }

    private UserModel convertFromDataObject(UserDO userDO, UserPasswordDO userPasswordDO) {

        UserModel userModel = new UserModel();

        BeanUtils.copyProperties(userDO, userModel);

        if(userPasswordDO != null) {
            userModel.setEncrptPassword(userPasswordDO.getEncrptPassword());
        }

        return userModel;
    }
}
