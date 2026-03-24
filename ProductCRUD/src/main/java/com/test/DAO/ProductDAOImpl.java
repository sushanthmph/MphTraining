package com.test.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.test.*;
import com.test.DB.ConnectionDB;
import com.test.Model.Product;
public class ProductDAOImpl implements ProductDAO {
	Connection con =ConnectionDB.getCon();
	String Insert_sql="insert into product(p_name,p_brand,p_price) values(?,?,?);";
	String find_sql="select * from product where id=?";
	String read_sql="select * from product";
	String update_sql="update prroduct set p_name=?,p_brand=?,p_price=? where id= ?";
	String delete_sql="delete from product where id= ? ";
	@Override
	public int saveProduct(Product obj) {
		// TODO Auto-generated method stub
		
		int x=0;
		try
		{
			PreparedStatement pst =con.prepareStatement(Insert_sql);
			pst.setString(1,obj.getP_name());
			pst.setString(2,obj.getP_brand());
			pst.setString(3,obj.getP_price());
			x=pst.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	@Override
	public Product getProductbyId(int id) {
		// TODO Auto-generated method stub
		Product pr=null;
		try {
			PreparedStatement pst =con.prepareStatement(find_sql);
			pst.setInt(1,id);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				pr.setId(rs.getInt(1));
				pr.setP_name(rs.getString(2));
				pr.setP_brand(rs.getString(3));
				pr.setP_price(rs.getString(4));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return pr;
	}

	@Override
	public List<Product> listAllProducts() {
		// TODO Auto-generated method stub
		List<Product> listProducts =new ArrayList<>();
		try
		{
			PreparedStatement pst =con.prepareStatement(read_sql);
			ResultSet rs =pst.executeQuery();
			while(rs.next())
			{
				Product pr =new Product();
				pr.setId(rs.getInt(1));
				pr.setP_name(rs.getString(2));
				pr.setP_brand(rs.getString(3));
				pr.setP_price(rs.getString(4));
				
				listProducts.add(pr);	
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return listProducts;
	}

	@Override
	public int updateProduct(Product obj) {
		// TODO Auto-generated method stub
		int x=0;
		try
		{
			PreparedStatement pst =con.prepareStatement(update_sql);
			pst.setString(1,obj.getP_name());
			pst.setString(2,obj.getP_brand());
			pst.setString(3,obj.getP_price());
			pst.setInt(4,obj.getId());
			x=pst.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}

	@Override
	public int deleteProductById(int id) {
		int x=0;
		try
		{
			PreparedStatement pst =con.prepareStatement(delete_sql);
			pst.setInt(1,id);
			x=pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
}
