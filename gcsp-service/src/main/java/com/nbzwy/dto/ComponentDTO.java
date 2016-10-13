package com.nbzwy.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by ` on 2016/10/10.
 */
public class ComponentDTO {
    private String id;
    private String name;
    private String author;
    private String category;
    private int categoryId;
    private Date createTime;
    private List<ElementDTO> elems;

    @Override
    public String toString() {
        return "ComponentDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", categoryId=" + categoryId +
                ", createTime=" + createTime +
                ", elems=" + elems +
                '}';
    }

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

    public List<ElementDTO> getElems() {
        return elems;
    }

    public void setElems(List<ElementDTO> elems) {
        this.elems = elems;
    }
}
