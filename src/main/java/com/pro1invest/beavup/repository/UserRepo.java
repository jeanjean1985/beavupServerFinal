package com.pro1invest.beavup.repository;

import com.pro1invest.beavup.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByName(String mail);
}
