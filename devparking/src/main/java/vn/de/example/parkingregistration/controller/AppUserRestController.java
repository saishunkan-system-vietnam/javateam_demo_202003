package vn.de.example.parkingregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.val;
import vn.de.example.parkingregistration.controller.dto.AppUserDTO;
import vn.de.example.parkingregistration.service.AppUserService;

@RestController
@RequestMapping(path = "/api/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class AppUserRestController {

    @Autowired
    AppUserService service;

    @GetMapping("/findById/{userId}")
    public AppUserDTO findById(@PathVariable Long userId) {
        val appUserDTO = service.findById(userId);
        return appUserDTO;
    }

    @GetMapping("/findAll")
    public List<AppUserDTO> findAll() {
        return service.findAllUser();
    }
}
