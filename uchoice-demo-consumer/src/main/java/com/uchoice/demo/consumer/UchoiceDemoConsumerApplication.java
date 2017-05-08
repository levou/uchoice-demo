package com.uchoice.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.uchoice.demo.api.Request;
import com.uchoice.demo.api.Result;
import com.uchoice.demo.api.vo.UchoiceUserMetadata;
import com.uchoice.demo.consumer.config.DubboxConfig;
import com.uchoice.demo.consumer.service.UchoiceUserMetaDataServiceConsumer;

/**
 * Hello world!
 * 
 */
@SpringBootApplication
public class UchoiceDemoConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(
				UchoiceDemoConsumerApplication.class);
		springApplication.setDefaultProperties(DubboxConfig.properties());
		ApplicationContext applicationContext = springApplication.run(args);

		 UchoiceUserMetaDataServiceConsumer consumer =
		 applicationContext.getBean(UchoiceUserMetaDataServiceConsumer.class);
		 Result<Void> result
		 =consumer.addUchoiceUserMetaData(Request.<UchoiceUserMetadata>create(new
		 UchoiceUserMetadata()));
		 System.out.println("add result:"+result.toString());
		
		 Result<UchoiceUserMetadata> queryResult
		 =consumer.querySingleUchoiceUserMeta(Request.<Integer>create(112));
		 System.out.println("add result:"+queryResult.toString());
	}
}
