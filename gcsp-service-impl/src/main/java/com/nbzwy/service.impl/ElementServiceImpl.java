package com.nbzwy.service.impl;

import com.nbzwy.dto.ElementDTO;
import com.nbzwy.dto.query.ElementQueryDTO;
import com.nbzwy.dto.response.ResultDO;
import com.nbzwy.service.ElementService;

import java.util.Map;

/**
 * Created by ` on 2016/10/11.
 */
public class ElementServiceImpl implements ElementService {
    @Override
    public ResultDO<Map<String, Object>> getElementList(ElementQueryDTO elementQueryDTO, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public ResultDO<Long> addElement(ElementDTO elementDTO) {
        return null;
    }

    @Override
    public ResultDO<Long> updateElement(ElementDTO elementDTO) {
        return null;
    }

    @Override
    public ResultDO<Long> delElement(Long id) {
        return null;
    }
}
