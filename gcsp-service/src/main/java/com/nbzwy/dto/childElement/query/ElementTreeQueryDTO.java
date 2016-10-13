package com.nbzwy.dto.childElement.query;

import java.util.List;

/**
 * Created by ` on 2016/10/12.
 */
public class ElementTreeQueryDTO {
    private int id;
    private String name;
    private List<ElementTreeQueryDTO> children;

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

    public List<ElementTreeQueryDTO> getChildren() {
        return children;
    }

    public void setChildren(List<ElementTreeQueryDTO> children) {
        this.children = children;
    }
}
