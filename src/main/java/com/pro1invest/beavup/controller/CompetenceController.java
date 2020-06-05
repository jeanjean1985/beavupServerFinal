package com.pro1invest.beavup.controller;

import com.pro1invest.beavup.model.Avis;
import com.pro1invest.beavup.model.Competence;
import com.pro1invest.beavup.repository.CompetenceRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompetenceController {

    private CompetenceRepo competenceRepo;

    public CompetenceController( CompetenceRepo competenceRepo){
        this.competenceRepo = competenceRepo;
    }

    @GetMapping("/competences")
    List<Competence> all() {
        return competenceRepo.findAll();
    }

    @GetMapping("/competences/{competenceId}")
    List<Competence> allCompetence(@PathVariable Long competenceId) {
        return  competenceRepo.findAllById(competenceId);
    }

    @PostMapping("/competences/")
    Competence newCompetence(@RequestBody Competence competence) {
        return competenceRepo.save(competence);
    }

}
