package io.codelex.registrationform.service;

import io.codelex.registrationform.repository.RegistrationFormRepository;
import io.codelex.registrationform.request.RegisteredUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationFormService implements RegistrationService{


    private RegistrationFormRepository registrationFormRepository;

    public RegistrationFormService(RegistrationFormRepository registrationFormRepository) {
        this.registrationFormRepository = registrationFormRepository;
    }

    @Override
    public void saveUser(RegisteredUser user) {
        registrationFormRepository.save(user);
        System.out.println("Registration successful!");
    }

    @Override
    public List<RegisteredUser> getAllUsers() {
        return registrationFormRepository.findAll();
    }


}
