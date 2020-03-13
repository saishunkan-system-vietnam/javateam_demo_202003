package vn.de.example.parkingregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("vn.de.example.parkingregistration")
public class DevparkingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevparkingApplication.class, args);
    }

}
