package com.example.test1.service.impl;

import com.example.test1.entity.User;
import com.example.test1.mapper.UserMapper;
import com.example.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created on 2022/3/23.
 *
 * @author longChuanJiang
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @Override
    public User selectById(int id) {
        return  userMapper.selectById(id);
    }

    /**
     * 增添用户
     * @param user
     * @return
     */
    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }


}
