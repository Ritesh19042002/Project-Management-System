package com.Ritesh.projectManagementSystem.repository;

import com.Ritesh.projectManagementSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
