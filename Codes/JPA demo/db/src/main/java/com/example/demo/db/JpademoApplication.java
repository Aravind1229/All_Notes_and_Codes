package com.example.demo.db;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.db.jdbc.personJdbcDao;
import com.example.demo.db.jpa.personJparepository;
import com.example.demo.db.entity.Person;

@SpringBootApplication
public class JpademoApplication implements CommandLineRunner{
private Logger logger=LoggerFactory.getLogger(this.getClass());
@Autowired
 personJparepository repository;
	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 -> {}",repository.findById(10001));
		logger.info("Inserting id 10004 -> {}",repository.insert(new Person(10004,"Tara","Berlin",new Date())));
		logger.info("Updating id 10003 -> {}",repository.update(new Person(10003,"Peter","Utrecht",new Date())));
		repository.deleteById(10002);
		logger.info("All users-> {}",repository.findAll());
		
		
	}

}
