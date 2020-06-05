package com.pro1invest.beavup.controller;

import com.pro1invest.beavup.model.ImagePost;
import com.pro1invest.beavup.repository.ImagePostRepo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImagePostController {

    private final ImagePostRepo imagePostRepo;

    public ImagePostController(ImagePostRepo imagePostRepo) {
        this.imagePostRepo = imagePostRepo;
    }

    @GetMapping("/imageposts")
    List<ImagePost> all(){return imagePostRepo.findAll();}

    @GetMapping("imagepost/{id)")
    List<ImagePost> byPostId(@PathVariable long id) {
        return imagePostRepo.findByPostId(id);
    }

    @PostMapping("/imagePost")
    ImagePost newImagePost(@RequestBody ImagePost imagePost){return imagePostRepo.save(imagePost);}

    @GetMapping("/imagepost/{postID}")
    List<ImagePost> byPostId(@PathVariable int postId){return imagePostRepo.findByPostId(postId);}

    @DeleteMapping("/imagepost/{postId}")
         void deleteImagePost(@PathVariable Long postId) {imagePostRepo.deleteByPostId(postId);}
}
