package com.nbzwy.domain.po;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by ` on 2016/10/10.
 */
public class Element {

    private String id;
    private String type;
    private String name;
    private String val;
    private String describe;
    private String unit;
    private long length;
    private SliderOption sliderOption;
    private Map<String, Object> val_radio;
    private Map<String, Object> val_tree;
    private List<ElementOption> elementOptionList;
    private List<ElementTree> elementTreeData;
    private int elementOrder;
    private String displayCheckField;
    private String displayCheckValue;
    private Date createTime;

    public Element() {
    }

    public Element(String id, String type, String name, String val, String describe, String unit, long length, SliderOption sliderOption, Map<String, Object> val_radio, Map<String, Object> val_tree, List<ElementOption> elementOptionList, List<ElementTree> elementTreeData, int elementOrder, String displayCheckField, String displayCheckValue, Date createTime) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.val = val;
        this.describe = describe;
        this.unit = unit;
        this.length = length;
        this.sliderOption = sliderOption;
        this.val_radio = val_radio;
        this.val_tree = val_tree;
        this.elementOptionList = elementOptionList;
        this.elementTreeData = elementTreeData;
        this.elementOrder = elementOrder;
        this.displayCheckField = displayCheckField;
        this.displayCheckValue = displayCheckValue;
        this.createTime = createTime;
    }

    public Element(String type, String name, String val, String describe, String unit, long length, SliderOption sliderOption, Map<String, Object> val_radio, Map<String, Object> val_tree, List<ElementOption> elementOptionList, List<ElementTree> elementTreeData, int elementOrder, String displayCheckField, String displayCheckValue, Date createTime) {
        this.type = type;
        this.name = name;
        this.val = val;
        this.describe = describe;
        this.unit = unit;
        this.length = length;
        this.sliderOption = sliderOption;
        this.val_radio = val_radio;
        this.val_tree = val_tree;
        this.elementOptionList = elementOptionList;
        this.elementTreeData = elementTreeData;
        this.elementOrder = elementOrder;
        this.displayCheckField = displayCheckField;
        this.displayCheckValue = displayCheckValue;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Element{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", val='" + val + '\'' +
                ", describe='" + describe + '\'' +
                ", unit='" + unit + '\'' +
                ", length=" + length +
                ", sliderOption=" + sliderOption +
                ", val_radio=" + val_radio +
                ", val_tree=" + val_tree +
                ", elementOptionList=" + elementOptionList +
                ", elementTreeData=" + elementTreeData +
                ", elementOrder=" + elementOrder +
                ", displayCheckField='" + displayCheckField + '\'' +
                ", displayCheckValue='" + displayCheckValue + '\'' +
                ", createTime=" + createTime +
                '}';
    }

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

    public SliderOption getSliderOption() {
        return sliderOption;
    }

    public void setSliderOption(SliderOption sliderOption) {
        this.sliderOption = sliderOption;
    }

    public List<ElementOption> getElementOptionList() {
        return elementOptionList;
    }

    public void setElementOptionList(List<ElementOption> elementOptionList) {
        this.elementOptionList = elementOptionList;
    }

    public List<ElementTree> getElementTreeData() {
        return elementTreeData;
    }

    public void setElementTreeData(List<ElementTree> elementTreeData) {
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