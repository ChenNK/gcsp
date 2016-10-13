package com.nbzwy.service.impl;

import com.nbzwy.domain.po.Component;
import com.nbzwy.dto.ComponentDTO;
import com.nbzwy.dto.query.ComponentQueryDTO;
import com.nbzwy.dto.response.ResultDO;
import com.nbzwy.lib.common.util.BeanCopierUtil;
import com.nbzwy.repository.ComponentRepository;
import com.nbzwy.service.ComponentService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ` on 2016/10/12.
 */
@Service
public class ComponentServiceImpl implements ComponentService {

    @Resource
    private ComponentRepository repository;

    @Override
    public ResultDO<Map<String, Object>> getComponentList(ComponentQueryDTO componentQueryDTO, int pageNum, int pageSize) {
        if (pageNum < 1) {
            pageNum = 1;
        }
        if (pageSize < 1) {
            pageSize = 10;
        }
        ResultDO<Map<String, Object>> result = new ResultDO<>();
        Map<String, Object> data = new HashMap<>();
        Component component = new Component();
        try {
            if (componentQueryDTO != null) {
                BeanCopierUtil.copyProperties(componentQueryDTO, component);
            }
            PageRequest pageable = new PageRequest(pageNum - 1, pageSize);
            Page<Component> page = repository.findAll(Example.of(component), pageable);
            if (page.getTotalElements() < 1) {
                result.setRetCode(-1);
                result.setErrMsg("查询构件属性结果为空!");
            } else {
                data.put("list", page.getContent());
                data.put("total", page.getNumberOfElements());
                result.setModule(data);
                result.setRetCode(0);
                result.setErrMsg("查询构件属性成功！");
            }
        } catch (Exception e) {
            result.setRetCode(1);
            result.setErrMsg("查询构件属性异常！");
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ResultDO<ComponentDTO> getComponent(String id) {
        ResultDO<ComponentDTO> result = new ResultDO<>();
        ComponentDTO componentDTO = new ComponentDTO();

        try {
            Component component = repository.findOne(id);
            if (component != null) {
                BeanCopierUtil.copyProperties(component, componentDTO);
                result.setModule(componentDTO);
                result.setRetCode(0);
                result.setErrMsg("查询构件成功!");
            } else {
                result.setRetCode(1);
                result.setErrMsg("查询构件失败!");
            }
        } catch (Exception e) {
            result.setRetCode(1);
            result.setErrMsg("查询构件失败!");
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public ResultDO<String> addComponent(ComponentDTO componentDTO) {
        ResultDO<String> result = new ResultDO<>();
        Component component = new Component();

        try {
            if (componentDTO != null) {
                BeanCopierUtil.copyProperties(componentDTO, component);
            }
            Component com = repository.save(component);
            result.setModule(com.getId());
            result.setRetCode(0);
            result.setErrMsg("新增构件成功!");
        } catch (Exception e) {
            result.setRetCode(1);
            result.setErrMsg("新增构件异常!");
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public ResultDO<String> updateComponent(ComponentDTO componentDTO) {
        ResultDO<String> result = new ResultDO<>();
        Component component = new Component();

        try {
            if (componentDTO != null) {
                BeanCopierUtil.copyProperties(componentDTO, component);
            }
            Component com = repository.save(component);
            result.setModule(com.getId());
            result.setRetCode(0);
            result.setErrMsg("修改构件成功!");
        } catch (Exception e) {
            result.setRetCode(1);
            result.setErrMsg("修改构件异常!");
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public ResultDO<String> delComponent(String id) {
        ResultDO<String> result = new ResultDO<>();

        try {
            repository.delete(id);
            result.setModule(id);
            result.setRetCode(0);
            result.setErrMsg("删除构件成功!");
        } catch (Exception e) {
            result.setRetCode(1);
            result.setErrMsg("删除构件异常!");
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ComponentDTO get(String id) {
        ComponentDTO componentDTO = new ComponentDTO();
        Component component = repository.findOne(id);
        if (component != null) {
            BeanCopierUtil.copyProperties(component, componentDTO);
        }
        return componentDTO;
    }
}
