package com.test.Controller;

import java.io.IOException;

import com.test.Model.Product;
import com.test.DAO.ProductDAOImpl;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		int i = Integer.parseInt(id);
		String name=request.getParameter("name");
		String brand= request.getParameter("brand");
		String price = request.getParameter("price");
		ProductDAOImpl pimpl = new ProductDAOImpl();
		Product pr = new Product();
		ServletContext ctx = getServletContext();
		ctx.setAttribute("data", pr);
		response.sendRedirect("editproduct.jsp");
		
	}

}
