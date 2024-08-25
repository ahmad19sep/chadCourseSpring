package com.corespring.chadspring.StudentRestPojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private int age;



}
