package com.example.demo.repository;

import com.example.demo.controller.MyController;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<MyController, Long> {
}
