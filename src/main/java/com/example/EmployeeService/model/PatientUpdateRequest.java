package com.example.EmployeeService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientUpdateRequest {
    @Id
    private Long id;
    private String prescription;
}
