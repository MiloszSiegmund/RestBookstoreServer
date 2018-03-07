package com.example.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentBookDto {

    private String studentName;
    private String studentSurname;
    private Integer studentNumber;
    private String bookTitle;

}
