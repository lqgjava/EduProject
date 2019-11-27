package com.yuxiu.edu.service.base;

/**
 * @author : 李清钢
 * @date : 2019-11-23 20:03
 **/
public interface IBaseService<T> {
    T findUserById(Integer id);
    T findUserByUUID(String  uuid);

    void deleteById(Integer id);
    void deleteByUUID(String uuid);

    void update(T t);

    void insert(T t);
}
