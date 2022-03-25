package com.example.test1.service;

import com.example.test1.entity.po.LineHostPo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * Created on 2022/3/24.
 *
 * @author longChuanJiang
 */
public interface HostService {
    List<LineHostPo> uploadMails(MultipartFile mail) throws IOException;

}
