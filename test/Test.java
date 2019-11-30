
import connectionjdbc.GetConnection;
import connectionjdbc.bill.BillDao;
import connectionjdbc.bill.BillTransaction;
import connectionjdbc.product.ProductDao;
import connectionjdbc.product.ProductService;
import connectionjdbc.user.UserService;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.Bill;
import model.Product;
import model.ProductInBill;
import model.Shoes;
import model.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hiepnguyen
 */
public class Test {

   

    public static void main(String[] args) {
        User user = new User("hiep","aas","1212","male","ha noi", "12/12","");
        new UserService().addUser(user, "hieasp", "hiep");
       
    }
}

