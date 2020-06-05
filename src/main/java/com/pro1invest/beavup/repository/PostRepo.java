package com.pro1invest.beavup.repository;

import com.pro1invest.beavup.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {

    List<Post> findPostsByTypeOfPost(@Param("typeOfPost") int typeOfPost);

    @Query("select p from Post p where p.typeOfPost = ?1")
    List<Post> findByTypeId(int typeid);

}
