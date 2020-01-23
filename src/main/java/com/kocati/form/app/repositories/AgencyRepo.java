package com.kocati.form.app.repositories;

import com.kocati.form.app.models.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

public interface AgencyRepo extends JpaRepository<Agency, Long> {
}
