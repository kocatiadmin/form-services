package com.kocati.form.app.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String agencyName;

    @OneToMany(cascade = CascadeType.MERGE )
    @JoinColumn(name = "client_id")
    private List<Client> clientList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void addClient(Client client){
        getClientList().add(client);
    }
}
