/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionjdbc.bill;

import connectionjdbc.GetConnection;
import connectionjdbc.product.ProductDao;
import connectionjdbc.user.UserDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bill;
import model.Product;
import model.ProductInBill;
import model.User;

/**
 *
 * @author hiepnguyen
 */
public class BillDao {
    private final Connection connection;

    public BillDao() {
        connection = GetConnection.getConnection();
    }
    
    

    public List<Bill> getAllBillForCustomer(int id){
        List<Bill> bills = new ArrayList();
        
        String sql = "Select * from ban_hang.bill where id_user = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Bill bill = new Bill();
                int id_bill = rs.getInt("id_bill");
                bill.setList(getDetailBill(id_bill));
                bill.setDate(rs.getString("date"));
                bill.setTime(rs.getString("time"));
                bill.setStatus(rs.getBoolean("status"));
                bills.add(bill);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bills;
    }
    
    
    //haven't yet done
    public List<ProductInBill> getDetailBill(int id){
        List<ProductInBill> list = new ArrayList();
        String sql = "Select * from ban_hang.bill where id_bill = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ProductInBill pb = new ProductInBill();
                pb.setQuantity(rs.getInt("quantity"));
                int idProduct = rs.getInt("id_product");
                Product pt = new ProductDao().searchProductById(idProduct);
                pb.setProduct(pt);
                list.add(pb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    public List<Bill> getBillForDay(int day, int month, int year){
        List<Bill> bills = new ArrayList();
        String date = year + "/" + month + "/" + day;
        
        String sql = "Select * from ban_hang.bill where date = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, date);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Bill bill = new Bill();
                int id_bill = rs.getInt("id_bill");
                int id_customer = rs.getInt("id_customer");
                int id_employee = rs.getInt("id_employee");
                
                bill.setId(id_bill);
                User customer = new UserDao().getUserById(id_customer);
                bill.setCustomer(customer);
                User employee = new UserDao().getUserById(id_employee);
                bill.setEmployee(employee);
                
                bill.setDate(rs.getString("date"));
                bill.setTime(rs.getString("time"));
                bill.setStatus(rs.getBoolean("status"));
                bill.setList(getDetailBill(id_bill));
                
                bills.add(bill);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bills;
    }
    
    //haven't yet done
    public List<Bill> getBillForMonth(int month, int year){
        List<Bill> bills = new ArrayList();
        
        String sql = "select * from ban_hang.bill where date >= ? and date <= ?"; 
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,year+"/"+month+"/01");
            ps.setString(2,setTimeForMonth(month, year));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Bill bill = new Bill();
                int id_bill = rs.getInt("id_bill");
                int id_customer = rs.getInt("id_customer");
                int id_employee = rs.getInt("id_employee");
                
                bill.setId(id_bill);
                User customer = new UserDao().getUserById(id_customer);
                bill.setCustomer(customer);
                User employee = new UserDao().getUserById(id_employee);
                bill.setEmployee(employee);
                
                bill.setDate(rs.getString("date"));
                bill.setTime(rs.getString("time"));
                bill.setStatus(rs.getBoolean("status"));
                bill.setList(getDetailBill(id_bill));
                
                bills.add(bill);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bills;
    }
    
    //haven't yet done
    public void createBill(Bill bill){
        
        String sql = "Select * from ban_hang.bill insert into bill(id_customer,id_employee,date,time,status)"
                + " values(?,?,?,?,?)";
        
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1,bill.getCustomer().getId());
            pst.setInt(2, bill.getEmployee().getId());
            pst.setString(3, bill.getDate());
            pst.setString(4, bill.getTime());
            pst.setBoolean(5, bill.isStatus());
            
            int rs = pst.executeUpdate(); 
        } catch (SQLException  ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private String setTimeForMonth(int month, int year){
        switch(month){
            case 2:
                if(year % 4 == 0){
                    return year+"02/29";
                }else{
                    return year+"02/28";
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return year+"/"+month+"/30";
            default:
                return year+"/"+month+"/31";
        }
    }
    

}
