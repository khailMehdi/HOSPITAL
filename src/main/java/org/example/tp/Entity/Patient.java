package org.example.tp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
@Entity @Table(name ="Xpatient")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id ;
   private String nom ;
   private Date dateNaissanec ;
   private boolean malade ;
   private int score ;

}
