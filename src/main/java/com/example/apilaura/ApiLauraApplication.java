package com.example.apilaura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"Controller", "Service", "Entity", "Dao"} )

@EnableJpaRepositories("Dao")
@EntityScan("Entity")
public class ApiLauraApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApiLauraApplication.class, args);
        System.out.println("Le serveur est lance");
    }

}
