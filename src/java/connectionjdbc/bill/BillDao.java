/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionjdbc.bill;

import connectionjdbc.GetConnection;
import connectionjdbc.product.ProductDao;
import connectionjdbc.product.ProductService;
import connectionjdbc.user.UserDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        
        String sql = "Select * from bill where id_customer = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Bill bill = new Bill();
                int id_bill = rs.getInt("id_bill");
                bill.setId(id_bill);
                bill.setList(getDetailBill(id_bill));
                bill.setDate(rs.getString("date"));
                bill.setTime(rs.getString("time"));
                bill.setStatus(rs.getString("status"));
                bills.add(bill);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bills;
    }
    
    public List<ProductInBill> getDetail(int idBill){
        String sql = "select * from detail_bill where id_bill = ?";
        List<ProductInBill> list = new ArrayList();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idBill);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id_product");
                int size = rs.getInt("size");
                Product product = new ProductService().getProductById(id);
                list.add(new ProductInBill(product, size));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    

    public List<ProductInBill> getDetailBill(int id){
        List<ProductInBill> list = new ArrayList();
        String sql = "Select * from list_product_bill where id_bill = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ProductInBill pb = new ProductInBill();
                pb.setSize(rs.getInt("quantity"));
                int idProduct = rs.getInt("id_product");
                Product pt = new ProductService().searchProductById(idProduct);
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
        
        String sql = "Select * from bill where date = ?";
        
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
                bill.setStatus(rs.getString("status"));
                bill.setList(getDetailBill(id_bill));
                
                bills.add(bill);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bills;
    }
    

    public List<Bill> getBillForMonth(int month, int year){
        List<Bill> bills = new ArrayList();
        
        String sql = "select * from bill where date >= ? and date <= ?"; 
        
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
                bill.setStatus(rs.getString("status"));
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
        
        String sql = "insert into bill(id_customer,id_employee,date,time,status)"
                + " values(?,?,?,?,?)";
        
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1,bill.getCustomer().getId());
            pst.setInt(2, bill.getEmployee().getId());
            pst.setString(3, bill.getDate());
            pst.setString(4, bill.getTime());
            pst.setString(5, bill.getStatus());
            
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
