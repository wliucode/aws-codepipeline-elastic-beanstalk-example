package com.wliucode.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsCodePipelineElasticBeanstalkExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCodePipelineElasticBeanstalkExampleApplication.class, args);

		System.out.println("Hello for AWS CodePipeline!");
	}

}
