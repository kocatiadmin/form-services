package com.kocati.form.app.controllers;

import com.kocati.form.app.models.Client;
import com.kocati.form.app.repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {
    @Autowired
    private ClientRepo clientRepo;

    @GetMapping
    public List<Client> list(){
        return clientRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody @DateTimeFormat(pattern="yyyy-MM-dd") Client client){
        clientRepo.save(client);
    }

    @GetMapping("/{id}")
    private Optional<Client> get(@PathVariable("id") Long id){
        return clientRepo.findById(id);
    }
}
