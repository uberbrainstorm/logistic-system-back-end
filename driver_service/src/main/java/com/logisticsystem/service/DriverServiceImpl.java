package com.logisticsystem.service;

import com.logisticsystem.dao.DriverDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl {

    @Autowired
    DriverDAO userDAO;

    public void SomeMeth(String name){
        userDAO.findDriverByName();
    }
}
