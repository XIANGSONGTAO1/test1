package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter
public class EncodingFilter implements Filter {

	public EncodingFilter() {
		System.out.println("过滤器");
	}
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("初始化过滤器");
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
		
	}

	public void destroy() {
		System.out.println("销毁过滤器");
		
	}

}
