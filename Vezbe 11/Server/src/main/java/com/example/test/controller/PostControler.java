package com.example.test.controller;

import com.example.test.model.Post;
import com.example.test.model.PostDTO;
import com.example.test.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(value = "/posts")
public interface PostControler {

    @PostMapping
    Post createPost(int id, String title, String description,int owner);

    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable int id);

    @GetMapping("/user/{owner}")
    public List<Post> getPostByOwner(@PathVariable int owner);

    @GetMapping("/radi")
    public ResponseEntity<List<PostDTO>> getPostsByOwnerJmbg();

    @GetMapping()
    List<Post> getPost();

    @PutMapping("/{postId}")
    Post updatePost(@PathVariable int id, String title, String description);

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable int id);
}
