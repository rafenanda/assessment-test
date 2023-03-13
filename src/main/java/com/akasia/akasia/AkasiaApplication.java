package com.akasia.akasia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AkasiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkasiaApplication.class, args);
		for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FWD");
            } else if (i % 3 == 0) {
                System.out.println("AKASIA");
            } else if (i % 5 == 0) {
                System.out.println("OKE");
            } else {
                System.out.println(i);
            }
        }
    }
}