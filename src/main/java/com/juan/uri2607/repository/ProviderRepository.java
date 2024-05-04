package com.juan.uri2607.repository;

import com.juan.uri2607.dto.ProvidersDto;
import com.juan.uri2607.entities.Providers;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProviderRepository extends JpaRepository<Providers, Long> {
    @Query("SELECT obj FROM Providers obj ORDER BY obj.name")
    List<ProvidersDto> findAllOrder();
}
