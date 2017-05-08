package com.uchoice.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class UchoiceDemoProviderApplication 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = SpringApplication.run(UchoiceDemoProviderApplication.class, args);
//       String[] beans = context.getBeanDefinitionNames();
//       if(null == beans || beans.length <= 0){
//    	   System.out.println("bean is null");
//       }else{
//    	   for(String bean : beans){
//    		   System.out.println("Bean :"+bean);
//    	   }
//       }
    }
}
