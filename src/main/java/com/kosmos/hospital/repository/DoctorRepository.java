package com.kosmos.hospital.repository;

import com.kosmos.hospital.model.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Long> {
}
