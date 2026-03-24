package com.test.DAO;
import java.util.*;
import com.test.Model.*;
public interface ProductDAO {
	public int saveProduct(Product obj);
	public Product getProductbyId(int id);
	public List<Product> listAllProducts();
	public int updateProduct(Product obj);
	public int deleteProductById(int id);
	
	
}
