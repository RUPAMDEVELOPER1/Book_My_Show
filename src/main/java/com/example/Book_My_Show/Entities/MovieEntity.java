package com.example.Book_My_Show.Entities;

import com.example.Book_My_Show.Enums.Gener;
import com.example.Book_My_Show.Enums.Languages;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String movieName;

    private double rating;

    private int duration;


    @Enumerated(value = EnumType.STRING)
    private Gener gener;

    @Enumerated(value = EnumType.STRING)
    private Languages languages;
}
