package mypack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet
{
	private PrintWriter out;
	public void service(HttpServletRequest request,HttpServletResponse response) 
	{
			try
			{
			out=response.getWriter();
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			if(name.startsWith("s")&&name.endsWith("a"))
			{
				response.sendRedirect("http://localhost:7777/AppTomcat/servlet2");
			}
			}
			catch(Exception e)
			{
				out.println(e);
			}
	}
}