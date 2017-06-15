
package com.qdu.controller;

import com.qdu.pojo.Menu;
import com.qdu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/menu")
public class MenuController {
    @Autowired
    private MenuService service;

    //查看所有用户
    @RequestMapping(value = "/showAllMenu")
    public String showAllMenu(ModelMap map) {
        map.addAttribute("mList", service.getMenuList());
        return "menuList";
    }

    //编辑用户
    @RequestMapping(value = "/forEditMenu")
    public String forEditMenu(int menuId, ModelMap map) {
        map.addAttribute("menu", service.getMenu(menuId));
        return "editMenu";
    }

    @RequestMapping(value = "/editMenu")
    public String editUser(Menu menu, ModelMap map) {
        service.editMenu(menu);
        map.addAttribute("mList", service.getMenuList());
        return "menuList";
    }

    //删除用户
    @RequestMapping(value = "/deleteMenu")
    public String deleteMenu(int menuId) {
        service.deleteMenu(menuId);
        return "menuList";
    }
    //添加用户

    @RequestMapping(value = "/forAddMenu")
    public String forAddMenu() {
        return "addMenu";
    }

    @RequestMapping(value = "/addMenu")
    public String addMenu(Menu menu, ModelMap map) {
        service.addMenu(menu);
        map.addAttribute("mList", service.getMenuList());
        return "menuList";
    }
}
