package com.nbzwy.lib.common.web.controller;

import com.nbzwy.dto.ComponentDTO;
import com.nbzwy.dto.query.ComponentQueryDTO;
import com.nbzwy.dto.response.ResultDO;
import com.nbzwy.service.ComponentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by ` on 2016/10/12.
 */
@Controller
@RequestMapping(value = "/rest")
public class ComponentController {

    @Resource
    private ComponentService componentService;

    @ModelAttribute
    public void getEmployee(@PathVariable(value = "id", required = false) String id, Map<String, Object> map){
        System.out.println("ModelAttribute method" + id);
        if(id != null){
            ComponentDTO componentDTO = componentService.get(id);
            System.out.println("---------->" + componentDTO);
            map.put("componentDTO", componentDTO);
        }
    }

    /**
     * 查询构件列表
     * @param pageNum 页数
     * @param pageSize 记录数
     * @return
     */
    @RequestMapping(value = "/component", method = RequestMethod.GET)
    public @ResponseBody
    ResultDO<Map<String, Object>> components(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        ComponentQueryDTO componentQueryDTO = new ComponentQueryDTO();
        return componentService.getComponentList(componentQueryDTO, pageNum, pageSize);
    }

    /**
     * 根据id 查询构件
     * @param id 构件的id
     * @return
     */
    @RequestMapping(value = "/component/{id}", method = RequestMethod.GET)
    public @ResponseBody
    ResultDO<ComponentDTO> component(@PathVariable("id") String id){
        return componentService.getComponent(id);
    }

    /**
     * 添加构件
     * @param componentDTO 添加的构件对象
     * @return
     */
    @RequestMapping(value = "/component", method = RequestMethod.POST)
    public @ResponseBody
    ResultDO<String> addComponent(@RequestBody ComponentDTO componentDTO) {
        return componentService.addComponent(componentDTO);
    }

    /**
     * 修改构件
     * @param componentDTO 修改的构件对象, 需要有id
     * @return
     */
    @RequestMapping(value = "/component", method = RequestMethod.PUT)
    public @ResponseBody
    ResultDO<String> updateComponent(@RequestBody ComponentDTO componentDTO){
        System.out.println(componentDTO.toString());
        return componentService.updateComponent(componentDTO);
    }

    /**
     * 删除构件
     * @param id 需删除的构件id
     * @return
     */
    @RequestMapping(value = "/component/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResultDO<String> deleteComponent(@PathVariable("id") String id){
        return componentService.delComponent(id);
    }







}
