package org.medicynov.medicynov.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "articles")
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String content;
    private String url;
    private int ageMax;
    private int ageMin;
    private String gender;
    private boolean isSmoke;
    private boolean isSexuality;
    private String isAlchool;
    private boolean isDrug;
    private boolean isSleeping;
}
