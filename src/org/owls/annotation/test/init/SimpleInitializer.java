package org.owls.annotation.test.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.owls.annotation.test.config.DatasourceConfig;
import org.owls.annotation.test.config.ServletConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SimpleInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
/*		AnnotationConfigApplicationContext ctx = 
		new AnnotationConfigApplicationContext(); - Do not Confuse */
		AnnotationConfigWebApplicationContext ctx = 
				new AnnotationConfigWebApplicationContext();
		//================================ Registering Configurations.
		ctx.register(ServletConfig.class);
		ctx.register(DatasourceConfig.class);
		
		ctx.setServletContext(sc);
		Dynamic dynamic = sc.addServlet("dispatcher", new DispatcherServlet(ctx));
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
	}
}
