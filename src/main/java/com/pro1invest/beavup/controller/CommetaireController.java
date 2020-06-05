package com.pro1invest.beavup.controller;

import com.pro1invest.beavup.model.Commentaire;
import com.pro1invest.beavup.repository.CommentaireRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CommetaireController {

 private final CommentaireRepo commentaireRepo;

    public CommetaireController(CommentaireRepo commentaireRepo) {
        this.commentaireRepo = commentaireRepo;
    }


    @GetMapping("/commentaires")
    List<Commentaire> all() {return commentaireRepo.findAll();}

    @PostMapping("/commentaires")
    Commentaire newComm(@RequestBody Commentaire commentaire){
        return commentaireRepo.save(commentaire);
    }



}
