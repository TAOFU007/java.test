package com.example.test1.service;

import com.example.test1.entity.User;

import javax.jws.soap.SOAPBinding;

/**
 * Created on 2022/3/23.
 *
 * @author longChuanJiang
 */


public interface UserService {
    User selectById(int id);

    int insert(User user);

    int delete(int id);

    int update(User user);
}
