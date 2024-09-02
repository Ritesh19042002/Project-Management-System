package com.Ritesh.projectManagementSystem.repository;

import com.Ritesh.projectManagementSystem.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}
