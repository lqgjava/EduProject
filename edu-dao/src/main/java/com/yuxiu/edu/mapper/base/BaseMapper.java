package com.yuxiu.edu.mapper.base;

import com.yuxiu.edu.model.User;

/**
 * @author : 李清钢
 * @date : 2019-11-23 19:49
 **/
public interface BaseMapper<T> {
    T findUserById(Integer id);
    T findUserByUUID(String  uuid);

    void deleteById(Integer id);
    void deleteByUUID(String uuid);

    void update(T t);

    void insert(T t);
}
