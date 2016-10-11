package com.nbzwy.domain.po;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by ` on 2016/10/10.
 */
@Document
public class Element {
    @Id
    private Long id;
    private String type;
    private String name;
    private String val;
    private String describe;
    private int elementOrder;
    private String displayCheckField;
    private String displayCheckValue;
    private Date createTime;

    public Element() {
    }

    @PersistenceConstructor
    public Element(Long id, String type, String name, String val, String describe, int elementOrder, String displayCheckField, String displayCheckValue, Date createTime) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.val = val;
        this.describe = describe;
        this.elementOrder = elementOrder;
        this.displayCheckField = displayCheckField;
        this.displayCheckValue = displayCheckValue;
        this.createTime = createTime;
    }

    public Element(String type, String name, String val, String describe, int elementOrder, String displayCheckField, String displayCheckValue, Date createTime) {
        this.type = type;
        this.name = name;
        this.val = val;
        this.describe = describe;
        this.elementOrder = elementOrder;
        this.displayCheckField = displayCheckField;
        this.displayCheckValue = displayCheckValue;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Element{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", val='" + val + '\'' +
                ", describe='" + describe + '\'' +
                ", elementOrder=" + elementOrder +
                ", displayCheckField='" + displayCheckField + '\'' +
                ", displayCheckValue='" + displayCheckValue + '\'' +
                ", createTime=" + createTime +
                '}';
    }

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
