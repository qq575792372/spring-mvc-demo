package com.gsw.service.impl;

import com.gsw.entity.Book;
import com.gsw.mapper.BookMapper;
import com.gsw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 类名
 * 描述：<请输入>
 *
 * @author：Admin
 * @date：2018/10/23
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectBooks(Map<String, Object> params) {
        return bookMapper.selectBooks(params);
    }
}
