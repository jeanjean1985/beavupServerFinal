package com.pro1invest.beavup.repository;

import com.pro1invest.beavup.model.ImagePost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ImagePostRepo extends JpaRepository<ImagePost, Long> {
    List<ImagePost> findByPostId(@Param("postId") long id);

    @Query("delete from ImagePost ip where ip.postId = ?1")
    void deleteByPostId(Long postId);
}

