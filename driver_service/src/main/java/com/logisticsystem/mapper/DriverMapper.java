package com.logisticsystem.mapper;

import com.logisticsystem.dto.DriverDTO;
import com.logisticsystem.model.Driver;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {

    Driver toDomainModel(DriverDTO driverDTO);

    DriverDTO toDTO(Driver driver);

    List<Driver> toDomainModel(List<DriverDTO> dtoList);

    List<DriverDTO> toDTO(List<Driver> domainModelList);
}
