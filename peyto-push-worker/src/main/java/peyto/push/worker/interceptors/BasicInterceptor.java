package peyto.push.worker.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BasicInterceptor extends HandlerInterceptorAdapter {

	private Logger	logger	= LoggerFactory.getLogger( BasicInterceptor.class );
	
	@Override
	public boolean preHandle(
			HttpServletRequest request,
			HttpServletResponse response, 
			Object handler ) throws Exception {
		logger.debug( "preHandle" );
		
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(
			HttpServletRequest request,
			HttpServletResponse response, 
			Object handler,
			ModelAndView modelAndView ) throws Exception {
		logger.debug( "postHandle" );

		super.postHandle(request, response, handler, modelAndView);
	}
}
