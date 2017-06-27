package com.logisticsystem.model;

import lombok.Data;

//import javax.persistence.Entity;
import java.io.Serializable;

//@Entity
@Data
public class Driver implements Serializable{

    private Long driverID;

    private String password;

    private String name;

}
