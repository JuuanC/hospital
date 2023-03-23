package service;

import exception.CustomException;
import model.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import repository.CitaRepository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CitaService {

    @Autowired
    CitaRepository repository;

    public List<Cita> getAll() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    public List<Cita> getByFecha(Date fecha) {
        try {
            return repository.findByFecha(fecha);
        } catch (Exception e) {
            throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    public List<Cita> getByConsultorio(Long idConsultorio) {
        try {
            return repository.findByIdConsultorio(idConsultorio);
        } catch (Exception e) {
            throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    public List<Cita> getByIdDoctor(Long idDoctor) {
        try {
            return repository.findByIdDoctor(idDoctor);
        } catch (Exception e) {
            throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    public List<Cita> getByFechaConsultorio(Date fecha, Long idConsultorio) {
        try {
            return repository.findByFechaAndIdConsultorio(fecha, idConsultorio);
        } catch (Exception e) {
            throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    public List<Cita> getByFechaDoctor(Date fecha, Long idDoctor) {
        try {
            return repository.findByFechaAndIdDoctor(fecha, idDoctor);
        } catch (Exception e) {
            throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    public List<Cita> getByDoctorConsultorio(Long idDoctor, Long idConsultorio) {
        try {
            return repository.findByIdDoctorAndIdConsultorio(idDoctor, idConsultorio);
        } catch (Exception e) {
            throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    public List<Cita> getByFechaConsultorioDoctor(Date fecha, Long idConsultorio, Long idDoctor) {
        try {
            return repository.findByIdDoctorAndIdConsultorioAndIdDoctor(fecha, idConsultorio, idDoctor);
        } catch (Exception e) {
            throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    public Cita save(Cita cita){
        try {
            return repository.save(cita);
        } catch (Exception e) {
            throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    public Cita update(Cita cita){
        try {
            Optional<Cita> temp = repository.findById(cita.getIdCita());
            if(temp.isPresent()){
                return repository.save(cita);
            }else{
                throw new CustomException("La CITA que desea actualizar no existe. " + cita.getIdCita()
                        , HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            throw new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}
