package jakarta.servlet.GenericServlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String user =request.getParameter("user");
		String pas=request.getParameter("pwd");
		if(user.equals("admin") && pas.equals("java"))
		{
			//RequestDispatcher rd=request.getRequestDispatcher("home.html");
			//rd.forward(request, response);
			//response.sendRedirect("home.html");  //links and pages
			response.sendRedirect("http://google.com");

		}
		else
		{
			out.println("<font color ='red'>invalid Credentials</font>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);

			
		}
	}

}
