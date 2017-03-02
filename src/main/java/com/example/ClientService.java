package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    
    public static ClientService createInstance() {
        return clientService;
    }
}