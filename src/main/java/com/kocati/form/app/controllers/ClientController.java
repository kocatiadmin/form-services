package com.kocati.form.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kocati.form.app.dto.ClientDto;
import com.kocati.form.app.models.Client;
import com.kocati.form.app.repositories.ClientRepo;

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
    public void create(@RequestBody ClientDto clientDto){
        clientRepo.save(ClientDto.fromDto(clientDto));
    }

    @GetMapping("/{id}")
    private Optional<Client> get(@PathVariable("id") Long id){
        return clientRepo.findById(id);
    }
}
