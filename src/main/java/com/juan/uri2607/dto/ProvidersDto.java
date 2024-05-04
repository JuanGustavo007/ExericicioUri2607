package com.juan.uri2607.dto;

import com.juan.uri2607.entities.Providers;

public class ProvidersDto {

    private Long id;
    private String name;
    private String street;
    private String city;
    private String state;

    public ProvidersDto(Long id, String name, String street, String city, String state) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public ProvidersDto(Providers providers) {
        this.id = providers.getId();
        this.name = providers.getName();
        this.street = providers.getStreet();
        this.city = providers.getCity();
        this.state = providers.getState();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
