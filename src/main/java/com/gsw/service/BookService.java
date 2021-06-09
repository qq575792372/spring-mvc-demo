package com.gsw.service;

import com.gsw.entity.Book;

import java.util.List;
import java.util.Map;

/**
 * 接口名
 * 描述：<请输入>
 *
 * @author：Admin
 * @date：2018/10/23
 */
public interface BookService {
    /**
     * 查询列表
     *
     * @param params
     * @return
     */
    public List<Book> selectBooks(Map<String, Object> params);
}
