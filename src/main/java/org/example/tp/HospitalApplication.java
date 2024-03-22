package org.example.tp;

import org.example.tp.Entity.Patient;
import org.example.tp.JPArepository.JPArepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {
    @Autowired
    private JPArepository jpArepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    jpArepository.save(new Patient(null,"MOhamed",new Date(),true,2));
    jpArepository.save(new Patient(null,"younes",new Date(),false,1));
    jpArepository.save(new Patient(null,"kawtar",new Date(),true,8));
    }
}
