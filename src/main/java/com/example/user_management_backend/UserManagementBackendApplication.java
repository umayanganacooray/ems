package com.example.user_management_backend;

import com.example.user_management_backend.model.Employee;
import com.example.user_management_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Kamal");
		employee.setLastName("Perera");
		employee.setEmailId("kamal@gmail.com");
		employeeRepository.save(employee);
	}
}
