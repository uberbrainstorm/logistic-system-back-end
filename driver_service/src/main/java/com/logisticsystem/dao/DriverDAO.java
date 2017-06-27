package com.logisticsystem.dao;

import com.logisticsystem.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DriverDAO extends JpaRepository<Driver, Long> {

    Driver findDriverByName(String name);
}
