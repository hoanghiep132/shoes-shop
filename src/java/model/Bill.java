/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author hiepnguyen
 */
public class Bill {
    
    private int id;
    private User customer;
    private User employee;
    private String date;
    private String time;
    private String status;
    List<ProductInBill> list;
    private double cost;
    
    

    public void addProductToBill(Product product, int quantity){
        ProductInBill pb = new ProductInBill(product, quantity);
        list.add(pb);
    }

    public List<ProductInBill> getList() {
        return list;
    }

    public void setList(List<ProductInBill> list) {
        this.list = list;
    }

    public Bill(int id, User customer, User employee, String date, String time, String status, List<ProductInBill> list) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.date = date;
        this.time = time;
        this.status = status;
        this.list = list;
    }
    
  

    public Bill() {
        
    }
    
     

    public Bill(User customer, User employee) {
        this.customer = customer;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public double getCost(){
        double cost = 0;
        for(ProductInBill pb : list){
            cost += pb.getQuantity() * pb.getProduct().getPrice() / 100 * (100 - pb.getProduct().getDiscount());
        }
        return cost;
    }
    
}
