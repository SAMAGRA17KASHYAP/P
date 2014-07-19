package mypack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet
{
	private PrintWriter out;
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
			try
			{
			out=response.getWriter();
			response.setContentType("text/html");
			out.println("Samae Server Another application");
			}
			catch(Exception e)
			{
				out.println(e);
			}
	}
}