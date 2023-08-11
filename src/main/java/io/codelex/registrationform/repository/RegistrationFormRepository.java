package io.codelex.registrationform.repository;

import io.codelex.registrationform.request.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegistrationFormRepository extends JpaRepository<RegisteredUser, Long> {

    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM RegisteredUser u WHERE u.email = ?1")
    boolean findByEmail(String email);
}
