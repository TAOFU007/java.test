package com.example.test1.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;

/**
 * Created on 2022/3/24.
 *
 * @author longChuanJiang
 */
@Data
@Builder
@Slf4j
public class Result<T> {

    @ApiModelProperty("返回码")
    private int code;

    @ApiModelProperty("返回描述")
    private String message;

    @ApiModelProperty("返回数据")
    private T data;

    /**
     * 请求成功
     */
    public static Result ok(){return result(HttpResult.SUCCESS.getCode(),HttpResult.SUCCESS.getMessage(), null);}

    public static <T> Result<T> ok(T data){return result(HttpResult.SUCCESS,data);}


    public static Result fail(){return result(HttpResult.FALL.getCode(),HttpResult.FALL.getMessage(), null);}

    public static Result fail(String message){return result(HttpResult.FALL.getCode(),message,null);}


    public static <T> Result<T> result(HttpResult httpResult,T data){
        return result(httpResult.getCode(),httpResult.getMessage(),data);
    }



    public  static  <T> Result<T> result(Integer code,String message,T data){
        return Result.<T>builder()
                .code(code)
                .message(message)
                .data(data).build();
    }
}
