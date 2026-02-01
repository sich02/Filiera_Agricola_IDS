package org.example.repository;

import org.example.model.Certificazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.example.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

public interface CertificazioneRepository extends JpaRepository<Certificazione, Long> {
}
