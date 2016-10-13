package com.nbzwy.service.impl.test;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.nbzwy.dto.ComponentDTO;
import com.nbzwy.dto.ElementDTO;
import com.nbzwy.dto.query.ComponentQueryDTO;
import com.nbzwy.dto.response.ResultDO;
import com.nbzwy.service.ComponentService;
import org.bson.types.ObjectId;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by ` on 2016/10/11.
 */
public class ComponentServiceTest extends BaseTest{

    @Resource
    private ComponentService componentService;

    @Test
    public void findOneComponent() {
        //正常查询:
        String a = new String("57fdbcbf90bb5c0ef2a8400f");
        //id 为 null 查询:
        //String a = null;
        //数据库不包含所查 id 数据:
        //String a = new String("123");
        ResultDO<ComponentDTO> result = componentService.getComponent(a);
        System.out.println(result.getModule());
        System.out.println(result.toString());
    }

    @Test
    public void delElement() {
        ResultDO<String> result = componentService.delComponent("57fdb9eb90bb73de84d0328b");
        System.out.println(result.getErrMsg());
    }

    @Test
    public void getElementsTest() {
        ComponentQueryDTO componentQueryDTO = new ComponentQueryDTO();
        componentQueryDTO.setId("57fdb9eb90bb73de84d0328b");
        ResultDO<Map<String, Object>> result = componentService.getComponentList(componentQueryDTO, 1, 5);
        System.out.println(result.getModule().get("list"));
        System.out.println(result.toString());
    }

    @Test
    public void addElementTest(){
        List<ElementDTO> elementDTOs = new ArrayList<>();
        ObjectId objectId = new ObjectId(new Date());
        ElementDTO elementDTO1 = new ElementDTO();
        elementDTO1.setId(objectId.toString());
        elementDTO1.setCreateTime(new Date());
        elementDTO1.setDescribe("描述内容");
        elementDTO1.setDisplayCheckField("");
        elementDTO1.setDisplayCheckValue("");
        elementDTO1.setElementOrder(0);
        elementDTO1.setName("纯文本111111");
        elementDTO1.setType("0");
        elementDTO1.setVal("默认值1");
        elementDTOs.add(elementDTO1);

        objectId = new ObjectId(new Date());
        ElementDTO elementDTO3 = new ElementDTO();
        elementDTO3.setId(objectId.toString());
        elementDTO3.setCreateTime(new Date());
        elementDTO3.setDescribe("描述内容");
        elementDTO3.setDisplayCheckField("");
        elementDTO3.setDisplayCheckValue("");
        elementDTO3.setElementOrder(0);
        elementDTO3.setName("单行输入框");
        elementDTO3.setType("1");
        elementDTO3.setVal("默认值2");
        elementDTOs.add(elementDTO3);

        ComponentDTO componentDTO = new ComponentDTO();
        componentDTO.setId("57fef0399c8718c58e88321b");
        componentDTO.setAuthor("管理员222222222");
        componentDTO.setName("测试测试");
        componentDTO.setCategoryId(0);
        componentDTO.setElems(elementDTOs);


        componentService.updateComponent(componentDTO);

    }

    @Test
    public void testMongodb(){
        try {
            Mongo mongo = new Mongo("127.0.0.1", 27017);
            DB db = mongo.getDB("test");
            Set<String> collectionNames = db.getCollectionNames();
            for (String name : collectionNames) {
                System.out.println("collectionName==" + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
