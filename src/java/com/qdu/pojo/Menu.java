package com.qdu.pojo;

public class Menu  implements java.io.Serializable {


     private int menuId;
     private String menuName;
     private String menuUrl;

    public Menu() {
    }

    public Menu(int menuId, String menuName, String menuUrl) {
       this.menuId = menuId;
       this.menuName = menuName;
       this.menuUrl = menuUrl;
    }
   
    public int getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
    public String getMenuName() {
        return this.menuName;
    }
    
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public String getMenuUrl() {
        return this.menuUrl;
    }
    
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }




}


