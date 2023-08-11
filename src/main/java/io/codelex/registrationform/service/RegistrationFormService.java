package io.codelex.registrationform.service;

import io.codelex.registrationform.repository.RegistrationFormRepository;
import io.codelex.registrationform.request.RegisteredUser;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RegistrationFormService implements RegistrationService{


    private RegistrationFormRepository registrationFormRepository;

    public RegistrationFormService(RegistrationFormRepository registrationFormRepository) {
        this.registrationFormRepository = registrationFormRepository;
    }

    @Override
    public void saveUser(RegisteredUser registeredUser) {
        if(findByEmail(registeredUser)){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Email already exist! ");
        } else {
            registrationFormRepository.save(registeredUser);
            throw new ResponseStatusException(HttpStatus.CREATED);
        }
    }

    @Override
    public List<RegisteredUser> getAllUsers() {
        return registrationFormRepository.findAll();
    }

    public boolean findByEmail(RegisteredUser registeredUser) {
        return registrationFormRepository.findByEmail(registeredUser.getEmail());
    }


}
