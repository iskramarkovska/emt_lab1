package com.example.rentalapp.controllers;

import com.example.rentalapp.model.Country;
import com.example.rentalapp.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController (CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{id}")
    public Country getCountryById
            (@PathVariable Long id) {
        return countryService.getCountryById(id).orElse(null);
    }

    @PostMapping
    public Country createCountry
            (@RequestBody Country country) {
        return countryService.createCountry(country);
    }

    @PutMapping("/{id}")
    public Country updateCountry
            (@PathVariable Long id,
             @RequestBody Country country) {
        return countryService.updateCountry(id, country);
    }

    @DeleteMapping("/{id}")
    public void deleteCountry
            (@PathVariable Long id) {
        countryService.deleteCountry(id);
    }


}
