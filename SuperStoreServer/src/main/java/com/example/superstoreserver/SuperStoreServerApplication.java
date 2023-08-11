package com.example.superstoreserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 13752
 */
@SpringBootApplication
@EnableAdminServer
public class SuperStoreServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SuperStoreServerApplication.class, args);
    }
}
