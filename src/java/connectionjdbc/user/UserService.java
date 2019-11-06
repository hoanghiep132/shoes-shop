/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionjdbc.user;

import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author hiepnguyen
 */
public class UserService {
 
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserService() {
        userDao = new UserDao();
    }
    
    
    
    public List<User> getAllInforCustomer(){
       return userDao.getAllInforCustomer();
    }
    
    public List<User> getAllInforEmployee(){
       return userDao.getAllInforEmployee();
    }
    
    public User getUserById(int id){
        return userDao.getUserById(id);
    }
    
    public void addUser(User user){
        userDao.addUser(user);
    }
    
    public void deletaUser(int id){
        userDao.deleteUser(id);
    }
    
    public void updateUser(User user){
        userDao.updateUser(user);
    }
    
    public User getAccount(String username, String password){
        return userDao.getAccount(username, password);
    }
    
    
}
