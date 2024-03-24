package org.example.tp.JPArepository;

import jakarta.transaction.Transactional;
import org.example.tp.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JPArepository extends JpaRepository<Patient,Long> {
    @Query("select p from Patient p where p.nom like :x")
    List<Patient> search(@Param("x") String X);
    @Transactional
    @Modifying
    @Query("UPDATE Patient p SET p.nom = :nom  WHERE p.id = :id")
    void updatePatient(@Param("id") Long id, @Param("nom") String nom);
    @Transactional
    @Modifying
    @Query("DELETE FROM Patient p WHERE p.id=:id")
    void deleteById(@Param("id") Long id);
}
