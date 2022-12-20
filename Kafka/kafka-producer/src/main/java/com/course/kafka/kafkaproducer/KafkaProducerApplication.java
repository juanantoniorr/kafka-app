package com.course.kafka.kafkaproducer;

import com.course.kafka.kafkaproducer.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableScheduling
public class KafkaProducerApplication implements CommandLineRunner {
	@Autowired
	private EmployeeJsonProducer employeeJsonProducer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
			employeeJsonProducer.sendMessage(new Employee("1", "Juan", LocalDate.now()));
		System.out.println("Employee sent");
	}
}
