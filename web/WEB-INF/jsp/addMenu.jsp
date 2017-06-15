<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>添加菜单</title>
        <link rel="stylesheet" href="../css/style.css">
    </head>
    <body>
        <fieldset>
            <legend>添加菜单</legend>
            <form action="addMenu">
                <span>菜单编号：</span><input type="text" name="menuId">
                <br><br>
                <span>菜单名称：</span><input type="text" name="menuName">
                <br><br>
                <span>菜单路径：</span><input type="text" name="menuUrl">
                <br><br>
                <input type="submit" value="添 加">
            </form>
        </fieldset>
    </body>
</html>
