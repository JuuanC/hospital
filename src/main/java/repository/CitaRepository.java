package repository;

import model.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Long> {

    List<Cita> findAll();
    List<Cita> findByFecha(Date fecha);
    List<Cita> findByIdConsultorio(Long idConsultorio);
    List<Cita> findByIdDoctor(Long idDoctor);
    List<Cita> findByFechaAndIdConsultorio(Date fecha, Long idConsultorio);
    List<Cita> findByFechaAndIdDoctor(Date fecha, Long idDoctor);
    List<Cita> findByIdDoctorAndIdConsultorio(Long idDoctor, Long idConsultorio);
    List<Cita> findByIdDoctorAndIdConsultorioAndIdDoctor(Date fecha, Long idConsultorio, Long idDoctor);
}

