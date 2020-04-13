package vn.de.example.parkingregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.de.example.parkingregistration.repository.UserRoleRepository;

@Service
public class UserRoleService extends BaseTransactionalService {

    @Autowired
    private UserRoleRepository repository;
}
