package com.Ritesh.projectManagementSystem.service;

import com.Ritesh.projectManagementSystem.model.Chat;
import com.Ritesh.projectManagementSystem.repository.ChatRepository;

public class ChatServiceImpl implements ChatService{

    private ChatRepository chatRepository;

    @Override
    public Chat createChat(Chat chat) {
        return chatRepository.save(chat);
    }
}
