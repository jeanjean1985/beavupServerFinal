package com.pro1invest.beavup.controller;

import com.pro1invest.beavup.model.Post;
import com.pro1invest.beavup.repository.PostRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {
    private final PostRepo postRepo;

    public PostController(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @GetMapping("/posts")
    List<Post> all() {
        return postRepo.findAll();
    }

    @PostMapping("/posts")
    Post newPost(@RequestBody Post post) {
        return postRepo.save(post);
    }

    @GetMapping("/posts/{id}")
    Optional<Post> one(@PathVariable Long id) {

        return postRepo.findById(id);
    }

    @GetMapping("/posts/type/{typeid}")
    List<Post> oneType(@PathVariable int typeid) {
        return postRepo.findByTypeId(typeid);
    }


    @PutMapping("/posts/{id}")
    Post replacePost(@RequestBody Post newPost, @PathVariable Long id) {

        return postRepo.findById(id)
                .map(post -> {
                    post.setDescr(newPost.getDescr());
                    post.setLocation(newPost.getLocation());
                    post.setTypeOfPost(newPost.getTypeOfPost());
                    return postRepo.save(post);
                })
                .orElseGet(() -> {
                    newPost.setId(id);
                    return postRepo.save(newPost);
                })
                ;
    }

    //TODO delete post
    @DeleteMapping("/posts/{id}")
    void deletePost(@PathVariable Long id) {
        postRepo.deleteById(id);
    }
}
