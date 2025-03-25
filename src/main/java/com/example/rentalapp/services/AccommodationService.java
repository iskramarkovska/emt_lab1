package com.example.rentalapp.services;

import com.example.rentalapp.model.Accommodation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccommodationService {
    List<Accommodation> getAllAccommodations();
    Optional<Accommodation> getAccommodationById(Long id);
    Accommodation createAccommodation(Accommodation accommodation);
    Accommodation updateAccommodation(Long id, Accommodation accommodation);
    void deleteAccommodation(Long id);
}
