/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionjdbc.product;

import connectionjdbc.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DetailProduct;
import model.Product;

/**
 *
 * @author hiepnguyen
 */
public class ProductDao {

    private final Connection connection;

    public ProductDao() {
        connection = GetConnection.getConnection();
    }

    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList();
        String sql = "Select * from product";

        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id_product"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setBrand(resultSet.getString("brand"));
                product.setDiscount(resultSet.getInt("discount"));
                product.setImg1(resultSet.getString("img1"));
                product.setImg2(resultSet.getString("img2"));
                product.setType(resultSet.getString("type"));
                products.add(product);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return products;
    }

    public List<Product> getAllProductForBrand(String brand) {
        List<Product> products = new ArrayList();
        String sql = "Select * from product where brand = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, brand);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id_product"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setBrand(resultSet.getString("brand"));
                product.setDiscount(resultSet.getInt("discount"));
                product.setImg1(resultSet.getString("img1"));
                product.setImg2(resultSet.getString("img2"));
                product.setType(resultSet.getString("type"));
                products.add(product);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return products;
    }
    
    public List<Product> getAllShoes(){
        List<Product> list = new ArrayList();
        String sql = "Select * from product where type = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "shoes");

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id_product"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setBrand(resultSet.getString("brand"));
                product.setDiscount(resultSet.getInt("discount"));
                product.setImg1(resultSet.getString("img1"));
                product.setImg2(resultSet.getString("img2"));
                                product.setType(resultSet.getString("type"));
                list.add(product);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return list;
    }

    public List<Product> getAllOthers() {
        List<Product> products = new ArrayList();
        String sql = "Select * from product where type = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "others");

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id_product"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setBrand(resultSet.getString("brand"));
                product.setDiscount(resultSet.getInt("discount"));
                product.setImg1(resultSet.getString("img1"));
                product.setImg2(resultSet.getString("img2"));
                                product.setType(resultSet.getString("type"));
                products.add(product);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return products;
    }

    public List<Product> searchProductForName(String name) {
        List<Product> products = new ArrayList();
        String sql = "Select * from product where name like ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id_product"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setBrand(resultSet.getString("brand"));
                product.setDiscount(resultSet.getInt("discount"));
                product.setImg1(resultSet.getString("img1"));
                product.setImg2(resultSet.getString("img2"));
                                product.setType(resultSet.getString("type"));
                products.add(product);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return products;
    }

    public Product searchProductById(int id) {
        Product product = new Product();
        String sql = "Select * from product where id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            product.setId(resultSet.getInt("id_product"));
            product.setName(resultSet.getString("name"));
            product.setPrice(resultSet.getDouble("price"));
            product.setBrand(resultSet.getString("brand"));
            product.setDiscount(resultSet.getInt("discount"));
            product.setImg1(resultSet.getString("img1"));
            product.setImg2(resultSet.getString("img2"));
                            product.setType(resultSet.getString("type"));
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return product;
    }

    public List<Product> recommendProduct(Product product) {
        List<Product> products = new ArrayList();
        List<Integer> idList = new ArrayList();
        String tag = product.getTag();
        String sql = "Select * from describe_product where tag like %?%";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tag);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                if(idList.size() <= 4){
                    int id = resultSet.getInt("id_product");
                    if (id != product.getId()) {
                        idList.add(id);
                    }
                }else{
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        idList.forEach(i -> {
            String sql2 = "Select * from product where id_product = ?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, i);
                ResultSet resultSet = preparedStatement.executeQuery();
                Product p = new Product();
                p.setName(resultSet.getString("name"));
                p.setPrice(resultSet.getDouble("price"));
                p.setBrand(resultSet.getString("brand"));
                p.setDiscount(resultSet.getInt("discount"));
                p.setImg1(resultSet.getString("img1"));
                p.setImg2(resultSet.getString("img2"));
                                product.setType(resultSet.getString("type"));
                products.add(p);
            } catch (SQLException ex) {
                Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        return products;
    }

    public void addProduct(Product product) {
        String sql = "insert into product(name, price,discount,brand,img1,img2,type"
                + "role)"
                + " values (?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getDiscount());
            preparedStatement.setString(4, product.getBrand());
            preparedStatement.setString(5, product.getImg1());
            preparedStatement.setString(6, product.getImg2());
            preparedStatement.setString(7, product.isType());

            int rs = preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void deleteProduct(int id) {
        String sql = "delete from user where id_user = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void updateProduct(Product product) {
        String sql = "update product set name = ?, price = ?,"
                + "discount = ?, brand = ?, img1 = ?, img2 = ?, type = ? where id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getDiscount());
            preparedStatement.setString(4, product.getBrand());
            preparedStatement.setString(5, product.getImg1());
            preparedStatement.setString(6, product.getImg2());
            preparedStatement.setInt(7, product.getId());
            preparedStatement.setString(8,product.isType());
            
            int rs = preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public Product getDescriptionProduct(int id) {
        Product product = getProductById(id);
        if(product == null) {
            return null;
        }
        String sql = "Select * from describe_product where id_product = ?";
        DetailProduct detailProduct = new DetailProduct();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            detailProduct.setDescription(resultSet.getString("description"));
            detailProduct.setImg1(resultSet.getString("img1"));
            detailProduct.setImg2(resultSet.getString("img2"));
            detailProduct.setImg3(resultSet.getString("img3"));
            detailProduct.setTag(resultSet.getString("tag"));
            product.setDetailProduct(detailProduct);
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }
    
    public Product getProductById(int id){
        String sql = "Select * from product where id = ?";
        Product product = new Product();
        try(PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                product.setId(rs.getInt("id_product"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setBrand(rs.getString("brand"));
                product.setDiscount(rs.getInt("discount"));
                product.setImg1(rs.getString("img1"));
                product.setImg2(rs.getString("img2"));
                product.setType(rs.getString("type"));
            }
        }catch(SQLException ex){
            
        }
        return  product;
    }

}
