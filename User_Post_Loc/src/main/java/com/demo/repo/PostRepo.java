package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Post;

public interface PostRepo extends JpaRepository<Post,Integer> {

}
