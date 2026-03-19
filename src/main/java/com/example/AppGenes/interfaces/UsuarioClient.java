package com.example.AppGenes.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.AppGenes.dto.UsuarioDTO;

// client/UsuarioClient.java
@FeignClient(
    name = "usuario-service",
    url = "${api.usuarios.url}"   // ← viene del application.properties
)
public interface UsuarioClient {

    @GetMapping("/users")
    List<UsuarioDTO> obtenerTodos();

    @GetMapping("/users/{id}")
    UsuarioDTO obtenerPorId(@PathVariable("id") Long id);

    @PostMapping("/users")
    UsuarioDTO crear(@RequestBody UsuarioDTO usuario);
}