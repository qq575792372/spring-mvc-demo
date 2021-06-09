package com.gsw.controller;

import com.gsw.entity.Book;
import com.gsw.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类名
 * 描述：<请输入>
 *
 * @author：Admin
 * @date：2018/10/23
 */

@Controller(value = "bookController")
@RequestMapping("/book")
@Api(description = "书本接口描述")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiOperation(value = "增加文章", httpMethod = "POST")
    public ModelAndView hello(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView("hello");
        Map map = new HashMap();
        map.put("bookName", request.getParameter("bookName"));
        List<Book> list = bookService.selectBooks(map);
        mv.addObject("bookList", list);

        return mv;
    }

    @RequestMapping(value = {"/hello1", "/hello1/{bookName}"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView hello1(@PathVariable(required = false) String bookName) {
        ModelAndView mv = new ModelAndView("hello");
        Map map = new HashMap();
        map.put("bookName", bookName);
        List<Book> list = bookService.selectBooks(map);
        mv.addObject("bookList", list);

        return mv;
    }
}
