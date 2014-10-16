package peyto.push.admin.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BasicInterceptor extends HandlerInterceptorAdapter {

	private static final String  ACCESS_CONTROL_ALLOW_ORIGIN      = "Access-Control-Allow-Origin";
    private static final String  ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";
    private static final String  REQUEST_HEADER_ORIGIN            = "Origin";
 
	
	private Logger	logger	= LoggerFactory.getLogger( BasicInterceptor.class );
	
	@Override
	public boolean preHandle(
			HttpServletRequest request,
			HttpServletResponse response, 
			Object handler ) throws Exception {
		logger.debug( "preHandle" );

//		if ( !request.getServletPath().equals( "/" )  ) {
//			HttpSession session = request.getSession( false );
//			if ( session == null ) {
//				// redirect 
//				response.sendRedirect( request.getContextPath() + "/app.view.login" );
//				return false;
//			}
//		}
		
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(
			HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView ) throws Exception {
		logger.debug( "postHandle" );

		super.postHandle(request, response, handler, modelAndView);
	}
}
