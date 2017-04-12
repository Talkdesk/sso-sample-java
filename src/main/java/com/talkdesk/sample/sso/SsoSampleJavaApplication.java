package com.talkdesk.sample.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@EnableOAuth2Sso
@SpringBootApplication
public class SsoSampleJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsoSampleJavaApplication.class, args);
	}
}
