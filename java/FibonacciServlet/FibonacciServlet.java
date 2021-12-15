package FibonacciServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FibonacciService.FibonacciService;

/**
 * Servlet implementation class FibonacciServlet
 */
@WebServlet("/FibonacciServlet")
public class FibonacciServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Double n1=Double.parseDouble(request.getParameter("Numero"));
		Double resultado=0.0;
		FibonacciService service=new FibonacciService(); 
		resultado=service.fibonacci(n1);
		
		//reporte
				response.setContentType("text/hyml;charset=UTF-8");
				PrintWriter out=response.getWriter();
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>CALCULADORA</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>FIBONACCI</h1>");
				out.println("<p>numero 1:"+n1+"</p>");
				
				out.println("<p>resultado:"+resultado+"</p>");
				out.println("<p><a href='index.html'>nueva operacion</a></p>");
				out.println("</body>");
				out.println("</html>");
				out.flush();
	}

}
