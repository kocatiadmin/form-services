package com.kocati.form.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kocati.form.app.models.Agency;
import com.kocati.form.app.repositories.AgencyRepo;

@RestController
@RequestMapping("/api/v1/agency")
public class AgencyController {

    @Autowired
    private AgencyRepo agencyRepo;

    //On agency registration, an agency will get created with a username and get an id will get created in DB for it
    //On login, agency object by agency id will be loaded.
    //Client associated with that object will be available by relationship on entity
    //So for agency module we only need to have agency object available in view or get clients or employees

    @GetMapping("/{id}")
    private Agency get(@PathVariable("id") Long id){
        return agencyRepo.findById(id).orElse(null);
    }

}
