package com.nbzwy.service;

import com.nbzwy.dto.ElementDTO;
import com.nbzwy.dto.query.ElementQueryDTO;
import com.nbzwy.dto.response.ResultDO;

import java.util.Map;

/**
 * Created by ` on 2016/10/10.
 */
public interface ElementService {
    public ResultDO<Map<String,Object>> getElementList(ElementQueryDTO elementQueryDTO, int pageNum, int pageSize);

    public ResultDO<Long> addElement(ElementDTO elementDTO);

    public ResultDO<Long> updateElement(ElementDTO elementDTO);

    public ResultDO<Long> delElement(Long id);

}
