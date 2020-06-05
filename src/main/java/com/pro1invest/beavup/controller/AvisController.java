package com.pro1invest.beavup.controller;

import com.pro1invest.beavup.model.Avis;
import com.pro1invest.beavup.repository.AvisRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AvisController {
    private AvisRepo avisRepo;

    public AvisController(AvisRepo avisRepo) {
        this.avisRepo = avisRepo;
    }

    @GetMapping("/avis")
    List<Avis> all() {
        return avisRepo.findAll();
    }

    @GetMapping("/avis/{userId}")
    List<Avis> allAvis(@PathVariable Long userId) {
        return  avisRepo.findAvisByUserId(userId);
    }

    @PostMapping("/avis/")
    Avis newAvis(@RequestBody Avis avis) {
        return avisRepo.save(avis);
    }

}
