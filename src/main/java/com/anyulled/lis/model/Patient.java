package com.anyulled.lis.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Patient {
    private String firstName;
    private String lastName;
    private LocalDate birthYear;
}
