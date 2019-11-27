package com.yuxiu.edu.service;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.base.IBaseService;

/**
 * @author : 李清钢
 * @date : 2019-11-23 20:11
 **/
public interface IUserService extends IBaseService<User> {

    //特有的方法
    User login(String username,String password);
}
