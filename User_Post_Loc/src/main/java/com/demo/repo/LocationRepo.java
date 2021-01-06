package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Location;

public interface LocationRepo extends JpaRepository<Location,Integer> {

}
