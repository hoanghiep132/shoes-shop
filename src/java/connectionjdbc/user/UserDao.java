/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionjdbc.user;

import connectionjdbc.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author hiepnguyen
 */
public class UserDao {

    private final Connection connection;

    public UserDao() {
        connection = GetConnection.getConnection();
    }

    public List<User> getAllInforCustomer() {
        List<User> users = new ArrayList();
        String sql = "Select * from ban_hang.infor where role = 'customer'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "customer");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id_user"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setPhoneNumber(resultSet.getString("phone"));
                user.setGender(resultSet.getBoolean("gender"));
                user.setBirthday(resultSet.getString("birthday"));
                user.setAvatar(resultSet.getString("avatar"));
                user.setPoint(resultSet.getInt("point"));
                users.add(user);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return users;
    }

    public List<User> getAllInforEmployee() {
        List<User> users = new ArrayList();
        String sql = "Select * from ban_hang.infor where role = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "employee");

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id_user"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setPhoneNumber(resultSet.getString("phone"));
                user.setGender(resultSet.getBoolean("gender"));
                user.setBirthday(resultSet.getString("birthday"));
                user.setAvatar(resultSet.getString("avatar"));
                user.setPoint(resultSet.getInt("point"));
                users.add(user);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return users;
    }

    public User getUserById(int id) {
        User user = new User();
        String sql = "Select * from ban_hang.infor where id_user = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            user.setId(id);
            user.setName(resultSet.getString("name"));
            user.setEmail(resultSet.getString("email"));
            user.setPhoneNumber(resultSet.getString("phone"));
            user.setGender(resultSet.getBoolean("gender"));
            user.setBirthday(resultSet.getString("birthday"));
            user.setAvatar(resultSet.getString("avatar"));
            user.setPoint(resultSet.getInt("point"));
        } catch (SQLException ex) {

        }
        return user;
    }

    public void UpdateAvatarUserByID(User user) {

        String sql = "update ban_hang.user set avatar = ? where id_user = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getAvatar());
            preparedStatement.setInt(2, user.getId());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void addUser(User user) {
        String sql = "insert into user(name, email,phone_number,gender,address,birthday,avatar"
                + "role)"
                + " values (?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPhoneNumber());
            preparedStatement.setBoolean(4, user.isGender());
            preparedStatement.setString(5, user.getAddress());
            preparedStatement.setString(6, user.getBirthday());
            preparedStatement.setString(7, user.getAvatar());
            preparedStatement.setString(8, user.getRole());

            int rs = preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void deleteUser(int id) {

        String sql = "delete from user where id_user = ?";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
        } catch (SQLException ex) {

        }
    }

    public void updateUser(User user) {
        String sql = "update ban_hang.infor set name = ?, email = ?, phone_number = ?,"
                + "gender = ?, address = ?, birthday = ?, avatar = ?, role = ? where id = ?";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPhoneNumber());
            preparedStatement.setBoolean(4, user.isGender());
            preparedStatement.setString(5, user.getAddress());
            preparedStatement.setString(6, user.getBirthday());
            preparedStatement.setString(7, user.getAvatar());
            preparedStatement.setString(8, user.getRole());
            preparedStatement.setInt(9, user.getId());

            int rs = preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public User getAccount(String username, String password) {
        String sql = "Select * from ban_hang.account where username = ? and password = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return getUserById(rs.getInt("id"));

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
