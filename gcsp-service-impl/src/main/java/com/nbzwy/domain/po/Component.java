package com.nbzwy.domain.po;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by ` on 2016/10/10.
 */
@Document
public class Component {
    @Id
    private String id;
    private String name;
    private String author;
    private String category;
    private int categoryId;
    private Date createTime;
    private List<Element> elems;

    public Component() {
    }

    @PersistenceConstructor
    public Component(String id, String name, String author, String category, int categoryId, Date createTime, List<Element> elems) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.categoryId = categoryId;
        this.createTime = createTime;
        this.elems = elems;
    }

    public Component(String name, String author, String category, int categoryId, Date createTime, List<Element> elems) {
        this.name = name;
        this.author = author;
        this.category = category;
        this.categoryId = categoryId;
        this.createTime = createTime;
        this.elems = elems;
    }

    @Override
    public String toString() {
        return "Component{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", createTime=" + createTime +
                ", elems=" + elems +
                '}';
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public List<Element> getElems() {
        return elems;
    }

    public void setElems(List<Element> elems) {
        this.elems = elems;
    }
}
