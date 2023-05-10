package com.example.demo5.repository;

import com.example.demo5.domain.todolist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todolistRepository extends JpaRepository<todolist, Long> {

}
