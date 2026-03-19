package com.example.AppGenes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AppGenes.dto.AuthDTO;
import com.example.AppGenes.dto.TokenDTO;
import com.example.AppGenes.service.AuthService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/login")
@RequiredArgsConstructor
public class AuthController {
    
    private final AuthService authService;

    @PostMapping
    public TokenDTO Autenticar(@RequestBody AuthDTO auth) {
        return authService.login(auth);
    }
}
