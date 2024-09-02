package com.Ritesh.projectManagementSystem.service;

import com.Ritesh.projectManagementSystem.model.Chat;
import org.springframework.stereotype.Service;

@Service
public interface ChatService {

    Chat createChat(Chat chat);
}
