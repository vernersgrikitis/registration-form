package io.codelex.registrationform.repository;

import io.codelex.registrationform.request.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationFormRepository extends JpaRepository<RegisteredUser, Long> {
}
