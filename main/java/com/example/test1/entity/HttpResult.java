package com.example.test1.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created on 2022/3/24.
 *
 * @author longChuanJiang
 */
public enum HttpResult {

    SUCCESS("请求成功",0),
    FALL("请求失败",1);

    @Setter
    @Getter
    private int code;

    @Setter
    @Getter
    private String message;

    HttpResult(String message,int code){
        this.code=code;
        this.message=message;
    }


}
