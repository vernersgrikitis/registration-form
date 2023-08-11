package io.codelex.registrationform.controller;

import io.codelex.registrationform.request.RegisteredUser;
import io.codelex.registrationform.service.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@CrossOrigin
public class RegistrationFormController {

    private RegistrationService registrationService;

    public RegistrationFormController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    public void saveUser(@RequestBody RegisteredUser user){
        registrationService.saveUser(user);
    }

    @GetMapping public List<List<RegisteredUser>> getAllUsers(){
        return List.of(registrationService.getAllUsers());
    }
}
