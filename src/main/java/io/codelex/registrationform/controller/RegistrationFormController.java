package io.codelex.registrationform.controller;

import io.codelex.registrationform.request.RegisteredUser;
import io.codelex.registrationform.service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class RegistrationFormController {

    private RegistrationService registrationService;

    private Logger logger = LoggerFactory.getLogger(RegistrationFormController.class);

    public RegistrationFormController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody RegisteredUser registeredUser){
        logger.info("Person was saved: " + registeredUser.getFirstname());
        registrationService.saveUser(registeredUser);
    }

    @GetMapping public List<List<RegisteredUser>> getAllUsers(){
        return List.of(registrationService.getAllUsers());
    }
}
