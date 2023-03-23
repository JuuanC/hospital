package com.kosmos.hospital.repository;

import com.kosmos.hospital.model.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Long> {

    List<Cita> findAll();
    List<Cita> findByFecha(Date fecha);
    List<Cita> findByIdConsultorio(Long idConsultorio);
    List<Cita> findByIdDoctor(Long idDoctor);
    List<Cita> findByFechaAndIdConsultorio(Date fecha, Long idConsultorio);
    List<Cita> findByFechaAndIdDoctor(Date fecha, Long idDoctor);
    List<Cita> findByIdDoctorAndIdConsultorio(Long idDoctor, Long idConsultorio);
    List<Cita> findByFechaAndIdConsultorioAndIdDoctor(Date fecha, Long idConsultorio, Long idDoctor);
}

