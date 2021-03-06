package com.qdu.pojo;
// Generated 2017-6-14 10:33:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ProductCategory generated by hbm2java
 */
public class ProductCategory  implements java.io.Serializable {


     private int categoryId;
     private String categoryName;
     private Set products = new HashSet(0);

    public ProductCategory() {
    }

	
    public ProductCategory(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public ProductCategory(int categoryId, String categoryName, Set products) {
       this.categoryId = categoryId;
       this.categoryName = categoryName;
       this.products = products;
    }
   
    public int getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Set getProducts() {
        return this.products;
    }
    
    public void setProducts(Set products) {
        this.products = products;
    }




}


