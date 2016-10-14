package com.nbzwy.web.controller;

import com.nbzwy.dto.ComponentDTO;
import com.nbzwy.dto.query.ComponentQueryDTO;
import com.nbzwy.dto.response.ResultDO;
import com.nbzwy.service.ComponentService;
import io.swagger.annotations.ApiOperation;
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
    public void getEmployee(@RequestParam(value = "id", required = false) String id, Map<String, Object> map){
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
    @ApiOperation(value = "分页查询 component 列表", httpMethod = "GET", response = ResultDO.class, notes = "分页查询 component 列表")
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
    @ApiOperation(value = "根据 id 查询 component", httpMethod = "GET", response = ResultDO.class, notes = "根据 id 查询 component")
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
    @ApiOperation(value = "添加 component", httpMethod = "POST", response = ResultDO.class,
            notes = "添加 component: component 对象 id 属性为空, 添加对象. " +
                    "若 component 对象 id 属性不为空, 则将该数据库中该 id 的数据替换为新数据")
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
    @ApiOperation(value = "修改 component", httpMethod = "PUT", response = ResultDO.class,
            notes = "修改 component: id 不能为空. 若id 不为空, 而数据库中不存在该 id 则会创建一个该id 的新 component")
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
    @ApiOperation(value = "删除 component", httpMethod = "DELETE", response = ResultDO.class, notes = "删除 component")
    public @ResponseBody
    ResultDO<String> deleteComponent(@PathVariable("id") String id){
        return componentService.delComponent(id);
    }







}
