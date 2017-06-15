<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>菜单列表</title>
        <link rel="stylesheet" href="../css/style.css" >
        <script src="../js/jquery-3.2.0.min.js"></script>
        <script>
            //Json
            function deleteMenu(mid){
                //发送一个ajax请求
                $.ajax({
                    url:'deleteMenu',  //deleteMenu?menuId=1
                    type:'GET', //提交请求的方法类型GET或POST等
                    data: 'menuId='+mid, //请求数据
                    success: function(){ //请求成功的话执行的js语句
                        $("tr#"+mid).remove();
                    }
                });
            }
        </script>
    </head>
    <body>
        <fieldset>
            <legend>菜单列表</legend>
            <table>
                <tr class="head">
                    <th>菜单编号</th>
                    <th>菜单名称</th>
                    <th>菜单路径</th>
                </tr>
                <c:forEach items="${mList}" var="m">
                    <tr id="${m.menuId}">
                        <td>${m.menuId}</td>
                        <td>${m.menuName}</td>
                        <td>${m.menuUrl}</td>
                        <td>
                            <a href="forEditMenu?menuId=${m.menuId}">编辑</a> &nbsp;
                            <a href="javascript:deleteMenu('${m.menuId}');">删除</a> &nbsp;
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </fieldset>
        <br>
        <a href="forAddMenu">+添加新产品</a> &nbsp;
    </body>
</html>
