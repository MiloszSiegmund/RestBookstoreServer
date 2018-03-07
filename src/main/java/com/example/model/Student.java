package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private Integer number;
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn (name = "book_id")
    private Book book;
}
