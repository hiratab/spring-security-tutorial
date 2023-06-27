package com.hiratab.springsecurity.tutorial.springsecuritytutorial;

import com.hiratab.springsecurity.tutorial.springsecuritytutorial.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTutorialApplication.class, args);
	}

}
