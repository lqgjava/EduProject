package com.yuxiu.edu.service;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.base.BaseServiceImpl;
import com.yuxiu.edu.service.base.IBaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : 李清钢
 * @date : 2019-11-23 20:13
 * 继承base实现，传个User模型，实现IUserService接口
 **/
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public User findUserByUUID(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }
}
