package com.example.test1.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created on 2022/3/24.
 *
 * @author longChuanJiang
 */
public class PageBo {

    public static final int DEFAULT_INDEX=1;
    public static final int DEFAULT_SIZE=10;

    @ApiModelProperty("当前页码")
    private Long current;

    @ApiModelProperty("页面大小")
    private Long size;

}
