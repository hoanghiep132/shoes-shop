/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionjdbc.product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import model.DetailProduct;
import model.Product;

/**
 *
 * @author hiepnguyen
 */
public class ProductService {
 
    private final ProductDao productDao;

    public ProductService() {
        productDao = new ProductDao();
    }
    
    public List<Product> getAllProduct(){
        return productDao.getAllProduct();
    }
    
    
    public List<Product> getAllProductForBrand(String brand){
        return productDao.getAllProductForBrand(brand);
    }
    
    public List<Product> getAllShoes(){
        return productDao.getAllShoes();
    }
    
    public List<Product> getAllOthers(){
        return productDao.getAllOthers();
    }
    
    public List<Product> searchProductForName(String name){
        return productDao.searchProductForName(name);  
    }
   
    public List<Product> recommenProduct(Product product){
        return productDao.recommendProduct(product);
    }
    
    public Product searchProductById(int id){
        return productDao.searchProductById(id);
    }
    
    public Product getDescriptionProduct(int id){
        return productDao.getDescriptionProduct(id);
    }
    
    public Product getProductById(int id){
        return productDao.getProductById(id);
    }
    
    public void addProduct(Product product){
        productDao.addProduct(product);
    }
    
    public void deleteProduct(int id){
        productDao.deleteProduct(id);
    }
    
    public void updateProduct(Product product){
        productDao.updateProduct(product);
    }
    
    
    public List<Product> orderProductAscendingByName(List<Product> list){
        return list.stream().sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
    }
    
    public List<Product> orderProductAscendingByPrice(List<Product> list){
        return list.stream().sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }
    
    public List<Product> orderProductDescendingByName(List<Product> list){
        return list.stream().sorted((p1,p2) -> p2.getName().compareTo(p1.getName()))
                .collect(Collectors.toList());
    }
    
    public List<Product> orderProductDescendingByPrice(List<Product> list){
        return list.stream().sorted((p1,p2) -> (int)(p2.getPrice() - p1.getPrice()))
                .collect(Collectors.toList());
    }
}
