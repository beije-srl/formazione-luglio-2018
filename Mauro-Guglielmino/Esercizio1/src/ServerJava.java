import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServerJava extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//request è quello che ci viene dato
		
		String prendi = req.getParameter("nome");
		
		resp.getWriter().append(prendi);
		
		System.out.println(prendi);
	}
	
}