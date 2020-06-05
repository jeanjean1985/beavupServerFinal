package com.pro1invest.beavup.repository;

import com.pro1invest.beavup.model.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AvisRepo extends JpaRepository<Avis, Long> {

    List<Avis> findAvisByUserId(@Param("UserId") long userId);
}
