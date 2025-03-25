package com.example.rentalapp.services.impl;

import com.example.rentalapp.model.Accommodation;
import com.example.rentalapp.repositories.AccommodationRepository;
import com.example.rentalapp.services.AccommodationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccommodationServiceImpl implements AccommodationService {
    private final AccommodationRepository accommodationRepository;

    public AccommodationServiceImpl (AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    @Override
    public List<Accommodation> getAllAccommodations() {
        return accommodationRepository.findAll();
    }

    @Override
    public Optional<Accommodation> getAccommodationById(Long id) {
        return accommodationRepository.findById(id);
    }

    @Override
    public Accommodation createAccommodation(Accommodation accommodation) {
        return accommodationRepository.save(accommodation);
    }

    @Override
    public Accommodation updateAccommodation(Long id, Accommodation accommodation) {
        if (accommodationRepository.existsById(id)) {
            accommodation.setId(id);
            return accommodationRepository.save(accommodation);
        }
        return null;
    }

    @Override
    public void deleteAccommodation(Long id) {
        accommodationRepository.deleteById(id);
    }
}
