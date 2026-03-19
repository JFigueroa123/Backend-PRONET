package com.example.AppGenes.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.AppGenes.dto.ConsultaRequestDTO;
import com.example.AppGenes.dto.ConsultaResponseDTO;

@FeignClient(
    name = "consulta-service",
    url = "${api.consulta.url}"
)
public interface ConsultasClient {
    @PostMapping("/cashout/api/consulta")
    ConsultaResponseDTO consultar(@RequestBody ConsultaRequestDTO consulta);
}