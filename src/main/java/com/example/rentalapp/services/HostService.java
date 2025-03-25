package com.example.rentalapp.services;

import com.example.rentalapp.model.Host;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface HostService {
    List<Host> getAllHosts();
    Optional<Host> getHostById(Long id);
    Host createHost(Host host);
    Host updateHost(Long id, Host host);
    void deleteHost(Long id);
}
