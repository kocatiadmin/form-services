package com.kocati.form.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kocati.form.app.models.Agency;

public interface AgencyRepo extends JpaRepository<Agency, Long> {
}
