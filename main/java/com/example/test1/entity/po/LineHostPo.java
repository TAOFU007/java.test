package com.example.test1.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Created on 2022/3/24.
 *
 * @author longChuanJiang
 */

@Data
@Slf4j
@TableName(value = "line_host")
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "主机报信息",description = "主机报信息")
public class LineHostPo {

    @TableId("id")
    @ApiModelProperty("主键")
    private int id;


    @TableField("subnet_id")
    private String subnetId;

    @TableField("host_id")
    private String hostId;

    @TableField("get_time")
    private String getTime;

    @TableField("ip_address")
    private String ipAddress;

    @TableField("host_name")
    private String hostName;

    @TableField("log_degree")
    private String logDegree;

    @ApiModelProperty("线路地址")
    @TableField("line_path")
    private String linePath;

    @TableField("file_last_time")
    private String fileLastTime;

    @TableField("remark")
    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("通报状态")
    @TableField("tb_flag")
    private String tbFlag;
}
