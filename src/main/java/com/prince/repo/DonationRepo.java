package com.prince.repo;

import com.prince.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DonationRepo extends JpaRepository<Donation, UUID> {
    List<Donation> findAllByPatientNamesContainingIgnoreCase(String names);
}
