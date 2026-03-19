package com.example.AppGenes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.AppGenes.dto.UsuarioDTO;
import com.example.AppGenes.interfaces.UsuarioClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioClient usuarioClient;

    public List<UsuarioDTO> listar() {
        return usuarioClient.obtenerTodos();
    }

    public UsuarioDTO buscar(Long id) {
        return usuarioClient.obtenerPorId(id);
    }
}
