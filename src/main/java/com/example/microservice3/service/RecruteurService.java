package com.example.microservice3.service;
import com.example.microservice3.Repository.RecruteurRepository;
import com.example.microservice3.entity.Recruteur;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecruteurService {
    private final RecruteurRepository recruteurRepository;

    public RecruteurService(RecruteurRepository recruteurRepository) {
        this.recruteurRepository = recruteurRepository;
    }

    public Recruteur createRecruteur(Recruteur recruteur) {
        return recruteurRepository.save(recruteur);
    }

    public List<Recruteur> getAllRecruteur() {
        return recruteurRepository.findAll();
    }

    public Optional<Recruteur> getRecruteurById(Long numRec) {
        return recruteurRepository.findById(numRec);
    }

    public Recruteur updateRecruteur( Recruteur recruteur) {
       return recruteurRepository.save(recruteur);

    }



    public void deleteRecruteur(Long numRec) {
        recruteurRepository.deleteById(numRec);
    }

}
