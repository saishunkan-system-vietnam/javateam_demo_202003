package vn.de.example.parkingregistration.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.de.example.parkingregistration.model.mapper.AppRoleModelMapper;

@Repository
public class UserRoleRepository {

    @Autowired
    private AppRoleModelMapper mapper;
}
