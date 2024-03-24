package org.example.tp;

import org.example.tp.Entity.Patient;
import org.example.tp.JPArepository.JPArepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {
    @Autowired
    private JPArepository jpArepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Ajouter des patients
    jpArepository.save(new Patient(null,"MOhamed",new Date(),true,2));
    jpArepository.save(new Patient(null,"younes",new Date(),false,1));
    jpArepository.save(new Patient(null,"kawtar",new Date(),true,8));
    List<Patient> patients=jpArepository.findAll();
       patients.forEach(patient -> System.out.println(patient));
       // Chercher des patients
       Patient patient=jpArepository.findById(Long.valueOf(1)).get();
       System.out.println(".......................");
       System.out.println(patient.getId()+" "+patient.getNom()+" "+patient.getDateNaissanec()
               +" "+patient.getScore());

       List<Patient> patientList=jpArepository.search("%M%");
       patientList.forEach(patient1 -> System.out.println(patient1));
       //Mettre à jour un patient
       jpArepository.updatePatient(Long.valueOf(1),"jilali");
       //supprimer un patien
       jpArepository.deleteById(Long.valueOf(1));

    }
}
