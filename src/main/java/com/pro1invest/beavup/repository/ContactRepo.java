package com.pro1invest.beavup.repository;

import com.pro1invest.beavup.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Long> {
}
