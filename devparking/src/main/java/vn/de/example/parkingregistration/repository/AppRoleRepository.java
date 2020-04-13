package vn.de.example.parkingregistration.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.de.example.parkingregistration.model.mapper.AppRoleModelMapper;

@Repository
public class AppRoleRepository {

    @Autowired
    private AppRoleModelMapper mapper;

    public List<String> getRoleNames(Long id) {
        return mapper.getRoleNames(id);
    }

}
