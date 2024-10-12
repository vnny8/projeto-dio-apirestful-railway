package com.projetoDIO.ProjetoCLARO.repository;


import com.projetoDIO.ProjetoCLARO.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
