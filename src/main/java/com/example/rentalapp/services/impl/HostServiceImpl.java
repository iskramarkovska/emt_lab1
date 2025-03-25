package com.example.rentalapp.services.impl;

import com.example.rentalapp.model.Host;
import com.example.rentalapp.repositories.HostRepository;
import com.example.rentalapp.services.HostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HostServiceImpl implements HostService {
    private final HostRepository hostRepository;

    public HostServiceImpl (HostRepository hostRepository) {
        this.hostRepository = hostRepository;
    }

    @Override
    public List<Host> getAllHosts() {
        return hostRepository.findAll();
    }

    @Override
    public Optional<Host> getHostById(Long id) {
        return hostRepository.findById(id);
    }

    @Override
    public Host createHost(Host host) {
        return hostRepository.save(host);
    }

    @Override
    public Host updateHost(Long id, Host host) {
        if (hostRepository.existsById(id)) {
            host.setId(id);
            return hostRepository.save(host);
        }
        return null;
    }

    @Override
    public void deleteHost(Long id) {
        hostRepository.deleteById(id);
    }
}
