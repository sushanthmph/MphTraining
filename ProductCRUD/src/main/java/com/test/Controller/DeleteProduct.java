package com.test.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.test.Controller.*;
import com.test.DAO.ProductDAOImpl;
import com.test.Model.Product;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/DeleteProduct")
public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Id =request.getParameter("id");
		int ID =Integer.parseInt(Id);
		ProductDAOImpl pimpl = new ProductDAOImpl();
		pimpl.deleteProductById(ID);
		if(pimpl.listAllProducts().size()>1)
		{
			response.sendRedirect("listproducts.jsp");
		}if(pimpl.listAllProducts().size()==1)
		{
			out.println("<center><font color='red'> Last Product Deleted<br> </font></center>");
			RequestDispatcher rd =request.getRequestDispatcher("createProduct.jsp");
			rd.include(request, response);
		}
		else
		{
			out.println("<center><font color='red'> Product Deleted<br> </font></center>");
			RequestDispatcher rd =request.getRequestDispatcher("listproducts.jsp");
			rd.include(request, response);
		}
	}

}
