package com.example.test1.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
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
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "line_mail")
@ApiModel(value = "邮箱配置信息", description = "邮箱配置信息")
@Builder
public class LineMailPo {

    @TableId("id")
    @ApiModelProperty("主键")
    private int id;

    @TableField("email_name")
    private String email_name;

    @TableField("type_code")
    @ApiModelProperty("线路信息")
    private String type_code;


    @TableField("user_idf")
    private String user_idf;

    @TableField("get_time")
    private String get_time;

    @TableField("get_user")
    private String get_user;

    @TableField("last_file_time")
    private String last_file_time;

    @TableField("remark")
    @ApiModelProperty("备注")
    private String remark;

    @TableField("ta_flag")
    @ApiModelProperty("通报状态")
    private String ta_flag;


}
