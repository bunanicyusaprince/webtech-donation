package com.prince.service;

import com.prince.model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PatientService {
    Patient addPatient(Patient patient);
    List<Patient> listPatients();
    void deletePatient(Patient patient);
    List<Patient> searchPatients(String names, String treatment, String sickness);
    Page<Patient> findPaginated(Pageable pageable, String names, String treatment, String sickness);
}
