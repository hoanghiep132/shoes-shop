/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hiepnguyen
 */
public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private double price;
    private int discount;
    private String brand;
    private boolean type;   // 1 is shoes, 0 is others
    private String img1;
    private String img2;
    private String description;
    private String tag;
    private DetailProduct detailProduct;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Product(int id, String name, double price, int discount, String brand, 
            boolean type, String img1, String img2, String description, String tag,
            DetailProduct detailProduct) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.brand = brand;
        this.type = type;
        this.img1 = img1;
        this.img2 = img2;
        this.description = description;
        this.tag = tag;
        this.detailProduct.setDescription(detailProduct.getDescription());
        this.detailProduct.setImg1(detailProduct.getImg1());
        this.detailProduct.setImg2(detailProduct.getImg2());
        this.detailProduct.setImg3(detailProduct.getImg3());
        this.detailProduct.setTag(detailProduct.getTag());
    }

    @Override
    public int compareTo(Product t) {
        return this.name.compareTo(t.getName());
    }
    
    
    
}
