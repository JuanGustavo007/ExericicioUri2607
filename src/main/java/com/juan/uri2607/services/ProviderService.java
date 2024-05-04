package com.juan.uri2607.services;

import com.juan.uri2607.dto.ProvidersDto;
import com.juan.uri2607.entities.Providers;
import com.juan.uri2607.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    @Transactional(readOnly = true)
    public ProvidersDto findById(Long id){
        Providers providersDto = providerRepository.findById(id).orElseThrow(() ->new RuntimeException());
        return new ProvidersDto(providersDto);
    }

    @Transactional(readOnly = true)
    public List<ProvidersDto> findAllOrdened(){
        List<ProvidersDto> providers = providerRepository.findAllOrder();
        return providers;
    }
}
