package com.example.test1.mapper;

import com.example.test1.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * Created on 2022/3/23.
 *
 * @author longChuanJiang
 */

@Mapper
public interface UserMapper {
    User selectById(int id);

    int insert(User user);

    int delete(int id);

    int update(User user);
}
