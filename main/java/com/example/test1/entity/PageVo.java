package com.example.test1.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 2022/3/24.
 *
 * @author longChuanJiang
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageVo<T> {

    @ApiModelProperty("当前页码")
    private Long current;

    @ApiModelProperty("页面大小")
    private Long size;

    @ApiModelProperty("数据总数")
    private Long total;

    @ApiModelProperty("数据记录")
    private Long records;
}
