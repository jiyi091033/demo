
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>编辑菜单</title>
        <link rel="stylesheet" href="../css/style.css">
    </head>
    <body>
        <fieldset>
            <legend>编辑菜单</legend>
            <form action="editMenu">
                <span>菜单编号：</span><input type="text" name="menuId" value="${menu.menuId}">
                <br><br>
                <span>菜单名称：</span><input type="text" name="menuName" value="${menu.menuName}" >
                <br><br>
                <span>菜单路径：</span><input type="text" name="menuUrl" value="${menu.menuUrl}" >
                <br><br>
                <input type="submit" value="提交更改">
            </form>
        </fieldset>
    </body>
</html>
