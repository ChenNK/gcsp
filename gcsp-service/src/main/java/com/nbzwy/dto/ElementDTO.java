package com.nbzwy.dto;

import java.util.Date;

/**
 * Created by ` on 2016/10/10.
 */
public class ElementDTO {
    private Long id;
    private String type;
    private String name;
    private String val;
    private String describe;
    private int elementOrder;
    private String displayCheckField;
    private String displayCheckValue;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getdescribe() {
        return describe;
    }

    public void setdescribe(String describe) {
        this.describe = describe;
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
