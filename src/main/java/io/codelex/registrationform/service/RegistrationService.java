package io.codelex.registrationform.service;

import io.codelex.registrationform.request.RegisteredUser;

import java.util.List;

public interface RegistrationService {

    void saveUser(RegisteredUser user);

    List<RegisteredUser> getAllUsers();

}
