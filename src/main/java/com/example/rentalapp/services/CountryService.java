package com.example.rentalapp.services;

import com.example.rentalapp.model.Country;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CountryService {
    List<Country> getAllCountries();

    Optional<Country> getCountryById(Long id);

    Country createCountry(Country country);

    Country updateCountry(Long id, Country country);

    void deleteCountry(Long id);
}