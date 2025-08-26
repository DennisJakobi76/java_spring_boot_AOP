package com.dj.aopdemo;

import com.dj.aopdemo.dao.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO) {

		return runner -> {

			demoTheBeforeAdvivce(theAccountDAO);
		};
	}

	private void demoTheBeforeAdvivce(AccountDAO theAccountDAO) {

		// call the business method
		theAccountDAO.addAccount();

		// do it again
		System.out.println("\n let's call it again\n");

		// call the business method again
		theAccountDAO.addAccount();

	}

}
