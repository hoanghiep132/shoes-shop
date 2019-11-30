/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

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
    private String role;            // customer, employee, manager
    private int point;

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
    
    public void removeProduct(TempProduct temp){
        boolean check = temps.remove(temp);
    }
    
}
