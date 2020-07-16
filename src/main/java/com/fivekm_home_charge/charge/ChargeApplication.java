package com.fivekm_home_charge.charge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChargeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChargeApplication.class, args);
    }

}
