package com.example.test1.controller;

import com.example.test1.entity.Result;
import com.example.test1.service.HostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created on 2022/3/24.
 *
 * @author longChuanJiang
 */

@RequestMapping("/host")
@Slf4j
@RestController
@Api(tags = "<外部接口-主机管理")
public class HostController {

    @Autowired
    HostService hostService;

    @PostMapping("uploadMails")
    @ApiModelProperty("主机文件批量上传")
    public Result uploadMails(MultipartFile mail){
        if(mail==null){
            return Result.fail("文件不能为空");
        }
        try {
            return Result.ok(hostService.uploadMails(mail));
        } catch (IOException e) {
            e.printStackTrace();
            return Result.fail("上传失败");
        }
    }

}
