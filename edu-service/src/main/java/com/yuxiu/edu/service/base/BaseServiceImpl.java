package com.yuxiu.edu.service.base;

import com.yuxiu.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : 李清钢
 * @date : 2019-11-23 20:09
 **/
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    //统一管理dao
    @Autowired
    protected UserMapper userMapper;
}
