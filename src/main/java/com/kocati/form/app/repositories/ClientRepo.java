package com.kocati.form.app.repositories;

import com.kocati.form.app.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
