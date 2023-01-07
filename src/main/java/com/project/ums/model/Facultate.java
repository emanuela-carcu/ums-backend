package com.project.ums.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "facultate")
@Getter
@Setter
public class Facultate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String numeFacultate;

}
