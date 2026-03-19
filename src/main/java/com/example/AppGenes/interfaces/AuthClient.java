package com.example.AppGenes.interfaces;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.AppGenes.dto.AuthDTO;
import com.example.AppGenes.dto.TokenDTO;

@FeignClient(
    name = "auth-service",
    url = "${api.auth.url}"
)
public interface AuthClient {
    @PostMapping("/cashout/authenticate")
    TokenDTO login(@RequestBody AuthDTO auth);
}