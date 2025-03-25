package com.example.rentalapp.repositories;

import com.example.rentalapp.model.Host;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostRepository extends JpaRepository<Host, Long> {
}
