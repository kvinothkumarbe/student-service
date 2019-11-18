/**
 * 
 */
package com.cts.ms.student.simple;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author 430040(Vinoth)
 *
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.cts.ms.student")
public class StudentServiceEurekaClientMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SpringApplicationBuilder(StudentServiceEurekaClientMain.class).run(args);
	}

}
