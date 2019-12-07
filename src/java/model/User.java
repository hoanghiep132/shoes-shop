/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import other.Other;

/**
 *
 * @author hiepnguyen
 */
public class User {
    private int id;
    private String name;
    private String email;           // regex abc@gmail.com
    private String phoneNumber;
    private String gender;         
    private String address;          
    private String birthday;        // format yyyy/MM/dd
    private List<TempProduct> temps;
    
    public User() {
        temps = new ArrayList();
    }
    private String avatar;          // link
    private String role;            // customer, employee, admin
    private int point;

    public User(String name, String email, String phoneNumber, String gender, String address, String birthday) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
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

    public User(String name, String email, String phoneNumber, String gender, String address, String birthday, String avatar) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.avatar = avatar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    
    public List<TempProduct> getTemps(){
        return temps;
    }
    
    public void addTempProduct(TempProduct temp){
        temps.add(temp);
    }
    
    public int getSizeTemps(){
        return temps.size();   
    }
    
    public void removeProduct(int id){
        for(TempProduct t: temps) {
            if(t.getId() == id){
                temps.remove(t);
                break;
            }
        }
    }
    
    public String sendEmail(String phoneNumber, String address){
        String msg = "\tMiaShoe xin kính chào quý khách! \nCảm ơn quý khách đã đặt hàng trên trang web của chúng tôi! \n"
                + "\tDanh sách sản phẩm của quý khách bao gồm : \n";
        for(TempProduct t : temps){
            String price = Other.displayMoney((int)(t.getPrice()));
            String sub ="\t" + t.getName() + "\t" + price + "\t" + t.getSize() + "\n";
            msg += sub;
        }
        msg += "\tĐịa chỉ nhận hàng : " + address + "\n";
        msg += "\tSố điện thoại : " + phoneNumber + "\n";
        msg += "\t Sản phẩm sẽ được vận chuyển đến địa chỉ một cách sớm nhất! Trân thành cảm ơn!";
        return msg;
    }
    
}
