package com.pro1invest.beavup.repository;

import com.pro1invest.beavup.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepo extends JpaRepository<Message, Long> {

    List<Message> findBySenderID(@Param("senderId") long senderID);


}
