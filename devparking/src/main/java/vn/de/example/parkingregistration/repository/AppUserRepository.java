package vn.de.example.parkingregistration.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.val;
import vn.de.example.parkingregistration.controller.dto.AppUserDTO;
import vn.de.example.parkingregistration.exception.DataNotFoundException;
import vn.de.example.parkingregistration.model.AppUser;
import vn.de.example.parkingregistration.model.mapper.AppUserModelMapper;

@Repository
public class AppUserRepository {

    @Autowired
    private AppUserModelMapper mapper;

    public Optional<AppUser> findUserAccount(String name) {
        return mapper.findUserAccount(name);
    }

    public List<AppUserDTO> findAllUser() {
        return mapper.findAllUser().stream().map(appUser -> new AppUserDTO(appUser)).collect(Collectors.toList());
    }

    public AppUserDTO findById(Long userId) {
        val appUser = mapper.findById(userId)
                .orElseThrow(() -> new DataNotFoundException("Not found user : " + userId));
        return new AppUserDTO(appUser);
    }
}
