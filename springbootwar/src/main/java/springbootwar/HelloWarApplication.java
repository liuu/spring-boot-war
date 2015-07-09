package springbootwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class HelloWarApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWarApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWarApplication.class, args);
    }

//    public UrlBasedViewResolver viewResolver(){
//    	
////        <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
////        <property name="prefix" value="/WEB-INF/jsp/"/>
////        <property name="suffix" value=".jsp"/>
////        
//    	UrlBasedViewResolver resolver = new UrlBasedViewResolver();
//    	resolver.setViewClass(JstlView.class);
//    	resolver.setPrefix("/WEB-INF/jsp/");
//    	resolver.setSuffix(".jsp");
//    	return resolver;
//    }
//    
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.enableContentNegotiation(new MappingJackson2JsonView());
//        registry.jsp();
//    }
}
