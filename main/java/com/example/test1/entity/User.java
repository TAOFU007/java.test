package com.example.test1.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created on 2022/3/23.
 *
 * @author longChuanJiang
 */

@Data
public class User {
    @ApiModelProperty("学生id")
    private int id;

    @ApiModelProperty("学生姓名")
    private String username;

    @ApiModelProperty("学生年龄")
    private int password;

    @ApiModelProperty("学生住址")
    private String realName;
}
