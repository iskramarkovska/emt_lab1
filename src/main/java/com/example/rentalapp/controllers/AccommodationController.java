package com.example.rentalapp.controllers;

import com.example.rentalapp.model.Accommodation;
import com.example.rentalapp.services.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accommodations")
public class AccommodationController {
    private AccommodationService accommodationService;

    @Autowired
    public AccommodationController(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }

    @GetMapping
    public List<Accommodation> getAllAccommodations() {
        return accommodationService.getAllAccommodations();
    }

    @GetMapping("/{id}")
    public Optional<Accommodation> getAccommodationById
            (@PathVariable Long id) {
        return accommodationService.getAccommodationById(id);
    }

    @PostMapping
    public Accommodation createAccommodation
            (@RequestBody Accommodation accommodation) {
        return accommodationService.createAccommodation(accommodation);
    }

    @PutMapping("/{id}")
    public Accommodation updateAccommodation
            (@PathVariable Long id,
             @RequestBody Accommodation accommodation) {
        return accommodationService.updateAccommodation(id, accommodation);
    }

    @DeleteMapping("/{id}")
    public void deleteAccommodation
            (@PathVariable Long id) {
        accommodationService.deleteAccommodation(id);
    }
}
