package com.example.test1.service.impl;

import com.example.test1.entity.po.LineHostPo;
import com.example.test1.mapper.UserMapper;
import com.example.test1.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2022/3/24.
 *
 * @author longChuanJiang
 */

@Service
public class HostServiceImpl implements HostService {



    @Override
    public List<LineHostPo> uploadMails(MultipartFile mail) throws IOException {
        String fileName= mail.getOriginalFilename();
        List<LineHostPo> failCbHostFiles=new ArrayList<>();
        return failCbHostFiles;
    }
}
