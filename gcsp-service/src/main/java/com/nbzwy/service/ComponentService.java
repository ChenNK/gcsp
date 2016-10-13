package com.nbzwy.service;

import com.nbzwy.dto.ComponentDTO;
import com.nbzwy.dto.query.ComponentQueryDTO;
import com.nbzwy.dto.response.ResultDO;

import java.util.Map;

/**
 * Created by ` on 2016/10/10.
 */
public interface ComponentService {
    public ResultDO<Map<String,Object>> getComponentList(ComponentQueryDTO componentQueryDTO, int pageNum, int pageSize);

    public ResultDO<ComponentDTO> getComponent(String id);

    public ResultDO<String> addComponent(ComponentDTO componentDTO);

    public ResultDO<String> updateComponent(ComponentDTO componentDTO);

    public ResultDO<String> delComponent(String id);

    public ComponentDTO get(String id);

}
