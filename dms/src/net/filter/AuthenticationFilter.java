package net.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.dbcp.BasicDataSource;


public class AuthenticationFilter implements Filter{
	
	
	BasicDataSource springDataSource;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
	     
		System.out.println("in authentication filter");
		
		HttpServletRequest request = (HttpServletRequest) servletrequest;
		HttpServletResponse response = (HttpServletResponse) servletresponse;
		
		HttpSession session = request.getSession();
		
		String url = request.getRequestURL().toString();
		
		if(url.contains("logout.htm"))
		{
			 session.invalidate();
			 System.out.println("session destroyed");
			 request.getRequestDispatcher("/Logout.jsp").forward(request, response);
			//response.sendRedirect(urlString.toString());
		}
		//response.sendRedirect("http://localhost:8080/vms/Login.jsp");
		else
		{
			chain.doFilter(request, response);//sends request to next resource
		}
	   /*String password=request.getParameter("password");  
	    if(password.equals("admin")){  
	    chain.doFilter(request, response);//sends request to next resource  
	    }  
	    
	    else{  
	    out.print("username or password error!");  
	    RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	    rd.include(request, response);  
	    }  */
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
