package com.example.microservice3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Recruteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numRec;

    private String nomRec;
    private String emailRec;
    @Temporal(TemporalType.DATE)
    private Date dateDebut ;
    @Temporal(TemporalType.DATE)
    private Date dateFin ;


}