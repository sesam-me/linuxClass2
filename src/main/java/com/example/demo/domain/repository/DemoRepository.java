package com.example.demo.domain.repository;


import com.example.demo.domain.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Long> {

}
