package com.example.AppGenes.service;

import org.springframework.stereotype.Service;

import com.example.AppGenes.dto.AuthDTO;
import com.example.AppGenes.dto.TokenDTO;
import com.example.AppGenes.interfaces.AuthClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthClient authClient;


    public TokenDTO login(AuthDTO auth) {
        return authClient.login(auth);
    }
    
}
