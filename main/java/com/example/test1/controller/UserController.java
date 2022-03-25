package com.example.test1.controller;


import com.example.test1.entity.Result;
import com.example.test1.entity.User;
import com.example.test1.service.UserService;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;

/**
 * Created on 2022/3/23.
 *
 * @author longChuanJiang
 */

@RestController
@RequestMapping("/user")
@Api(tags = "<外部接口-用户管理")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation("根据ID查询学生")
    public Result findAll(@PathVariable int id){
        if (userService.selectById(id)!=null){
            return Result.ok(userService.selectById(id));
        }else{
            return Result.fail("查无此人");
        }

    }

    @PostMapping("/addUser")
    public Result addUser(@RequestBody User user){
        if(userService.insert(user)==0){
            return Result.fail("插入失败");
        }
        return Result.ok(userService.insert(user));
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id){
        if(userService.delete(id)==1){
            return Result.ok(userService.delete(id));
        }
        return Result.fail("删除失败");
    }

    @PutMapping("/updateUser")
    public  Result updateUser(@RequestBody User user)
    {
        if(userService.update(user)==1){
            return Result.ok(userService.update(user));
        }
        return Result.fail("更新失败");
    }
}
