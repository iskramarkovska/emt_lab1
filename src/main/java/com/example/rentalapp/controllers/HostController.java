package com.example.rentalapp.controllers;

import com.example.rentalapp.model.Host;
import com.example.rentalapp.services.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hosts")
public class HostController {
    private final HostService hostService;

    @Autowired
    public HostController (HostService hostService) {
        this.hostService = hostService;
    }

    @GetMapping
    public List<Host> getAllHosts() {
        return hostService.getAllHosts();
    }

    @GetMapping("/{id}")
    public Host getHostById
            (@PathVariable Long id) {
        return hostService.getHostById(id).orElse(null);
    }

    @PostMapping
    public Host createHost
            (@RequestBody Host host) {
        return hostService.createHost(host);
    }

    @PutMapping("/{id}")
    public Host updateHost
            (@PathVariable Long id,
             @RequestBody Host host) {
        return hostService.updateHost(id, host);
    }

    @DeleteMapping("/{id}")
    public void deleteHost
            (@PathVariable Long id) {
        hostService.deleteHost(id);
    }
}
