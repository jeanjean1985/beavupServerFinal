package com.pro1invest.beavup.controller;

import com.pro1invest.beavup.model.Message;
import com.pro1invest.beavup.repository.MessageRepo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@RestController
public class MessageController {
    private final MessageRepo messageRepo;

    public MessageController(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    @GetMapping("/messages")
    List<Message> all() {
        return messageRepo.findAll();
    }

    @PostMapping("/messages")
    Message newMessage(@RequestBody Message message) {
        message.setSendingDate(new Date());
        return messageRepo.save(message);
    }

    @GetMapping("/messages/{id}")
    Optional<Message> one(@PathVariable Long id) {
        return messageRepo.findById(id);

    }

    @Query(value = "SELECT '*' from Message where receiverId = id or senderID = id")
    List<Message> messageByUserId(@Param("id") long id) {
        return messageByUserId(id);
    }

    //TODO utilité du put pour les message ?
    @PutMapping("/messages/{id}")
    Message replaceMessage(@RequestBody Message newMessage, @PathVariable Long id) {

        return messageRepo.findById(id)
                .map(message -> {
                    message.setMessage(newMessage.getMessage());
                    message.setReadingStatus(newMessage.getReadingStatus());
                    return messageRepo.save(message);
                })
                // a verifier si nv message dois etre cree ?
                .orElseGet(() -> {
                    newMessage.setId(id);

                    return messageRepo.save(newMessage);
                })
                ;


    }

    @DeleteMapping("/messages/{id}")
    void deleteMessage(@PathVariable Long id) {
        messageRepo.deleteById(id);
    }
}
