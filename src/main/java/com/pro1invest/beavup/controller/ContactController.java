package com.pro1invest.beavup.controller;

import com.pro1invest.beavup.model.Contact;
import com.pro1invest.beavup.model.Post;
import com.pro1invest.beavup.repository.ContactRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContactController {

    private final ContactRepo contactRepo;

    public ContactController(ContactRepo contactRepo) {this.contactRepo = contactRepo;}

    @GetMapping("/contacts")
    List<Contact> all() {
        return contactRepo.findAll();
    }

    @PostMapping("/contacts")
    Contact newContact(@RequestBody Contact contact) {
        return contactRepo.save(contact);
    }

    @GetMapping("/contacts/{id}")
    Optional<Contact> one(@PathVariable Long id) {

        return contactRepo.findById(id);
    }




}
