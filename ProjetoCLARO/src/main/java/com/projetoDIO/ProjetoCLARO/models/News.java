package com.projetoDIO.ProjetoCLARO.models;

import jakarta.persistence.*;

@Entity(name = "tb_news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;
    private String description;
}
