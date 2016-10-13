package com.nbzwy.domain.po;

import java.util.List;

/**
 * Created by ` on 2016/10/12.
 */
public class ElementTree {
    private int id;
    private String name;
    private List<ElementTree> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElementTree> getChildren() {
        return children;
    }

    public void setChildren(List<ElementTree> children) {
        this.children = children;
    }
}
