package com.example.microservice3.Repository;

import com.example.microservice3.entity.Recruteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruteurRepository extends JpaRepository<Recruteur, Long> { }
