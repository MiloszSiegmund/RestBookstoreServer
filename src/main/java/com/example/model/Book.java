package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @JsonIgnore
    @OneToMany (cascade = CascadeType.PERSIST, mappedBy = "book")
    private Set<Student> students = new HashSet<>();
}
