package vn.de.example.parkingregistration.model.mapper;

import java.util.List;
import java.util.Optional;

import vn.de.example.parkingregistration.model.AppUser;

public interface AppUserModelMapper {

    Optional<AppUser> findUserAccount(String name);

    List<AppUser> findAllUser();

    Optional<AppUser> findById(Long userId);
}
