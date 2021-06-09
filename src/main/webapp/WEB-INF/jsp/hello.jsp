<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%
    String path = request.getContextPath() + "/";
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <title>demo</title>
    <style>
        .container {
            padding: 20px;
            font-size: 14px;
        }

        .layout_header {
            text-align: center;
            margin: 30px auto;
        }

        .layout_header .input-text {
            padding: 10px;
            border: solid 1px #e9eaec;
            border-radius: 4px;
            min-width: 230px;
            outline: none;
            transition: border .2s;
        }

        .layout_header .input-text:focus {
            box-shadow: 0px 0px 3px #e9eaec;
        }

        .layout_header .btn-search {
            padding: 10px 20px;
            min-width: 80px;
            background: #2d8cf0;
            border-radius: 4px;
            border: none;
            outline: none;
            color: #fff;
            cursor: pointer;
            transition: all .2s;
        }

        .layout_header .btn-search:active {
            background: #529ff1;
        }

        .layout_body .book_table {
            border-collapse: collapse;
            border: solid 1px #dddee1;
            width: 80%;
            margin: 0px auto;
            border-radius: 4px;
        }

        .layout_body .book_table tr th {
            border: solid 1px #dddee1;
            padding: 12px 26px;
            background: #f2f2f3;
            color: #333;
        }

        .layout_body .book_table tr td {
            padding: 6px 12px;
            border: solid 1px #e9eaec;
            font-size: 13px;
            text-align: center;
            color: #4b4c50;
        }
    </style>
</head>
<body>
<div class="container">

    <div class="layout_header">
        <form action="book/hello" method="post">
            <input type="text" class="input-text" name="bookName" placeholder="请输入关键字"/>
            <button class="btn-search">搜索</button>
        </form>
    </div>
    <div class="layout_body">
        <table class="book_table">
            <thead>
            <tr>
                <th>书名称</th>
                <th>作者</th>
                <th>热搜度</th>
                <th>创建时间</th>
                <th>修改时间</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${bookList}">
                <tr>
                    <td>${item.bookName}</td>
                    <td>${item.authName}</td>
                    <td>${item.searchHot}</td>
                    <td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss" type="date"/></td>
                    <td><fmt:formatDate value="${item.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" type="date"/></td>
                </tr>
            </c:forEach>
            </tbody
        </table>
    </div>
    <div class="layout_footer"></div>
</div>
</body>
</html>
