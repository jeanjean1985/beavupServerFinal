package com.pro1invest.beavup.repository;

import com.pro1invest.beavup.model.Competence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompetenceRepo extends JpaRepository<Competence, Long> {
    List<Competence> findAllById(Long competenceId);
}
