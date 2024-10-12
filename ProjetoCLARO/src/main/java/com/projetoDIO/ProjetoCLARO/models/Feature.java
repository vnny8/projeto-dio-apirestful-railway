package com.projetoDIO.ProjetoCLARO.models;

import jakarta.persistence.*;

@Entity(name = "tb_feature")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;
    private String description;
}
