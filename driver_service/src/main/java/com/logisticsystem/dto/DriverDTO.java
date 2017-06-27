package com.logisticsystem.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

@Data
public class DriverDTO {

    @NotNull
    private Long driverID;

    @NotBlank
    private String password;

    @NotBlank
    private String name;
}
