package com.example.AppGenes.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.AppGenes.dto.PagoRequestDTO;
import com.example.AppGenes.dto.PagoResponseDTO;

@FeignClient(
    name = "pago-service",
    url = "${api.pago.url}"
)
public interface PagoClient {
    @PostMapping("/cashout/api/pago")
    PagoResponseDTO pago(@RequestBody PagoRequestDTO pago);
}