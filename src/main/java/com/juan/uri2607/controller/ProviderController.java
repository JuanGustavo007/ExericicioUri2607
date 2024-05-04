package com.juan.uri2607.controller;

import com.juan.uri2607.dto.ProvidersDto;
import com.juan.uri2607.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping(value = "/{id}")
    public ProvidersDto getProviderById(Long id) {
        ProvidersDto providersDto = providerService.findById(id);
        return providersDto;
    }

    @GetMapping
    public ResponseEntity<List<ProvidersDto>> getAllProviders() {
        List<ProvidersDto> providersDto = providerService.findAllOrdened();
        return ResponseEntity.ok(providersDto);
    }
}
