package com.nbzwy.dto.query;

import java.util.Date;
import java.util.List;

/**
 * Created by ` on 2016/10/10.
 */
public class ComponentQueryDTO {
    private String id;
    private String name;
    private String author;
    private String category;
    private int categoryId;
    private Date createTime;
    private List<ElementQueryDTO> elems;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<ElementQueryDTO> getElems() {
        return elems;
    }

    public void setElems(List<ElementQueryDTO> elems) {
        this.elems = elems;
    }
}
