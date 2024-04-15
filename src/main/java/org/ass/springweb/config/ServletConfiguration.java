package org.ass.springweb.config;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletConfiguration implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	context.register(AppConfiguration.class);//where the objects are present
	DispatcherServlet servlet = new DispatcherServlet(context);
	Dynamic dynamic=servletContext.addServlet("dispatcherServlet",servlet);
	dynamic.addMapping("/");
	dynamic.setLoadOnStartup(1);//it will create object if we are passing any value
	}
}
//Information related to servlet