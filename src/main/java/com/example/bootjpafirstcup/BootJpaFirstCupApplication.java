package com.example.bootjpafirstcup;

import com.example.bootjpafirstcup.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BootJpaFirstCupApplication implements CommandLineRunner {

    private final EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(BootJpaFirstCupApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.findAllEmployee()
                .forEach(System.out::println);

        JPAUtil.checkData("select * from employee");
    }
}
