package com.nbzwy.dto.query;

import com.nbzwy.dto.childElement.query.ElementTreeQueryDTO;
import com.nbzwy.dto.childElement.query.SliderOptionQueryDTO;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by ` on 2016/10/10.
 */
public class ElementQueryDTO {
    private String id;
    private String type;
    private String name;
    private String val;
    private String describe;
    private String unit;
    private long length;
    private SliderOptionQueryDTO sliderOption;
    private Map<String, Object> val_radio;
    private Map<String, Object> val_tree;
    private List<ElementQueryDTO> elementOptionList;
    private List<ElementTreeQueryDTO> elementTreeData;
    private int elementOrder;
    private String displayCheckField;
    private String displayCheckValue;
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public Map<String, Object> getVal_radio() {
        return val_radio;
    }

    public void setVal_radio(Map<String, Object> val_radio) {
        this.val_radio = val_radio;
    }

    public Map<String, Object> getVal_tree() {
        return val_tree;
    }

    public void setVal_tree(Map<String, Object> val_tree) {
        this.val_tree = val_tree;
    }

    public SliderOptionQueryDTO getSliderOption() {
        return sliderOption;
    }

    public void setSliderOption(SliderOptionQueryDTO sliderOption) {
        this.sliderOption = sliderOption;
    }

    public List<ElementQueryDTO> getElementOptionList() {
        return elementOptionList;
    }

    public void setElementOptionList(List<ElementQueryDTO> elementOptionList) {
        this.elementOptionList = elementOptionList;
    }

    public List<ElementTreeQueryDTO> getElementTreeData() {
        return elementTreeData;
    }

    public void setElementTreeData(List<ElementTreeQueryDTO> elementTreeData) {
        this.elementTreeData = elementTreeData;
    }

    public int getElementOrder() {
        return elementOrder;
    }

    public void setElementOrder(int elementOrder) {
        this.elementOrder = elementOrder;
    }

    public String getDisplayCheckField() {
        return displayCheckField;
    }

    public void setDisplayCheckField(String displayCheckField) {
        this.displayCheckField = displayCheckField;
    }

    public String getDisplayCheckValue() {
        return displayCheckValue;
    }

    public void setDisplayCheckValue(String displayCheckValue) {
        this.displayCheckValue = displayCheckValue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
