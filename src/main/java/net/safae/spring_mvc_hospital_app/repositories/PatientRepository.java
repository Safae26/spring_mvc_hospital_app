package net.safae.spring_mvc_hospital_app.repositories;

import net.safae.spring_mvc_hospital_app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
