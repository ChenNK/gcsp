package com.nbzwy.dto.childElement;

import java.util.List;

/**
 * Created by ` on 2016/10/12.
 */
public class ElementTreeDTO {
    private int id;
    private String name;
    private List<ElementTreeDTO> children;

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

    public List<ElementTreeDTO> getChildren() {
        return children;
    }

    public void setChildren(List<ElementTreeDTO> children) {
        this.children = children;
    }
}
