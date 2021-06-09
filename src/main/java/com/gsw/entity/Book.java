package com.gsw.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 类名
 * 描述：<请输入>
 *
 * @author：Admin
 * @date：2018/10/23
 */
public class Book implements Serializable {
    private int id;
    private String bookName;
    private String authName;
    private int searchHot;
    private Date createTime;
    private Date updateTime;

    /**
     * 构造函数
     */
    public Book() {
    }

    public Book(int id, String bookName, String authName, int searchHot, Date createTime, Date updateTime) {
        this.id = id;
        this.bookName = bookName;
        this.authName = authName;
        this.searchHot = searchHot;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * 生成toString（）方法
     */
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authName='" + authName + '\'' +
                ", searchHot=" + searchHot +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    /**
     * 生成getter和setter
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public int getSearchHot() {
        return searchHot;
    }

    public void setSearchHot(int searchHot) {
        this.searchHot = searchHot;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
