package com.example.vehiclemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleManagementApplication.class, args);

        System.out.println("======================================");
        System.out.println("Application started successfully 🚀");
        System.out.println("Open in browser:");
        System.out.println("http://localhost:8081");
        System.out.println("======================================");
    }
}
