package com.example.demo5.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class todolist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String detail;

    public todolist(String detail) {
        this.detail = detail;
    }
    protected todolist(){ // jpa 보호하기 위해
    }
}

