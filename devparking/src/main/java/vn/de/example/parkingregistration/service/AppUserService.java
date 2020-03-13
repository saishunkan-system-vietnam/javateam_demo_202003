package vn.de.example.parkingregistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.de.example.parkingregistration.controller.dto.AppUserDTO;
import vn.de.example.parkingregistration.model.AppUser;
import vn.de.example.parkingregistration.repository.AppUserRepository;

@Service
public class AppUserService extends BaseTransactionalService {

    @Autowired
    private AppUserRepository repository;

    public Optional<AppUser> findUserAccount(String name) {
        return repository.findUserAccount(name);
    }

    public List<AppUserDTO> findAllUser() {
        return repository.findAllUser();
    }

    public AppUserDTO findById(Long userId) {
        return repository.findById(userId);
    }
}
