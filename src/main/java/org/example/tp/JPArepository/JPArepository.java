package org.example.tp.JPArepository;

import org.example.tp.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPArepository extends JpaRepository<Patient,Long> {
}
