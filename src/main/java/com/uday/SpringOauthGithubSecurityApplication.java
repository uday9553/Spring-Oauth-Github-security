package com.uday;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableOAuth2Sso
@RestController
@SpringBootApplication
public class SpringOauthGithubSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauthGithubSecurityApplication.class, args);
	}

	@GetMapping("/getMessage")
	public String getMessage(Principal principal) {
		return "Hi "+principal.getName()+" you are authenticated with github now";
	}
}
