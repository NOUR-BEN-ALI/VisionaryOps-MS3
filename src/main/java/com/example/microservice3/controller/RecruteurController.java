package com.example.microservice3.controller;

import com.example.microservice3.entity.Recruteur;
import com.example.microservice3.service.RecruteurService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/Recruteur")
public class RecruteurController {
    private final RecruteurService recruteurService;

    public RecruteurController(RecruteurService recruteurService) {
        this.recruteurService = recruteurService;
    }

    @PostMapping
    public Recruteur createRecruteur(@RequestBody Recruteur recruteur) {
        return recruteurService.createRecruteur(recruteur);
    }

    @GetMapping("/all")
    public List<Recruteur> getAllRec() {
        return recruteurService.getAllRecruteur();
    }

    @GetMapping("/{numRec}")
    public Optional<Recruteur> getRecById(@PathVariable Long numRec) {
        return recruteurService.getRecruteurById(numRec);
    }

    @PutMapping("/update")
    public Recruteur updateEmployee( @RequestBody Recruteur recruteur) {
        return recruteurService.updateRecruteur(recruteur);
    }



    @DeleteMapping("/{numRec}")
    public void deleteRec(@PathVariable Long numRec) {
        recruteurService.deleteRecruteur(numRec);
    }
}
