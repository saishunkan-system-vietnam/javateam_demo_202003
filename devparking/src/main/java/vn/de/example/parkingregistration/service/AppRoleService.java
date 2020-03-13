package vn.de.example.parkingregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.de.example.parkingregistration.repository.AppRoleRepository;

@Service
public class AppRoleService extends BaseTransactionalService {

    @Autowired
    private AppRoleRepository repository;

    public List<String> getRoleNames(Long id) {
        return repository.getRoleNames(id);
    }
}
