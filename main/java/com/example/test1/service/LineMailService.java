package com.example.test1.service;

import com.example.test1.entity.PageBo;
import com.example.test1.entity.PageVo;
import com.example.test1.entity.po.LineMailPo;

/**
 * Created on 2022/3/24.
 *
 * @author longChuanJiang
 */
public interface LineMailService {

    PageVo<LineMailPo> findMailLine(PageBo pageBo,LineMailPo lineMailPo);
}
