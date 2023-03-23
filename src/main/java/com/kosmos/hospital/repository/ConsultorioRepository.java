package com.kosmos.hospital.repository;

import com.kosmos.hospital.model.Consultorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultorioRepository extends CrudRepository<Consultorio, Long> {
}
