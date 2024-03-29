package com.example.EmployeeService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {
    @Id
    private Long id;
    private String name;
    private String dateOfBirth;
    private String phoneNumber;
    private String emailAddress;
    private String gender;
    private String prescription;
    private String diagnosis;
    private String medicalHistory;
}
