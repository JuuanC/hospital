package controller;

import model.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import service.CitaService;

import javax.validation.Valid;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("cita")
public class CitaController {

    @Autowired
    CitaService service;

    @GetMapping()
    public List<Cita> getList(){
        return service.getAll();
    }

    @GetMapping
    public List<Cita> getByFecha(@RequestParam("fecha") Date fecha){
        return service.getByFecha(fecha);
    }

    @GetMapping
    public List<Cita> getByConsultorio(@RequestParam("idConsultorio") Long idConsultorio){
        return service.getByConsultorio(idConsultorio);
    }

    @GetMapping
    public List<Cita> getByIdDoctor(@RequestParam("idDoctor") Long idDoctor){
        return service.getByIdDoctor(idDoctor);
    }

    @GetMapping
    public List<Cita> getByFechaConsultorio(@RequestParam("fecha") Date fecha, @RequestParam("idConsultorio") Long idConsultorio){
        return service.getByFechaConsultorio(fecha, idConsultorio);
    }

    @GetMapping
    public List<Cita> getByFechaDoctor(@RequestParam("fecha") Date fecha, @RequestParam("idDoctor") Long idDoctor){
        return service.getByFechaDoctor(fecha, idDoctor);
    }

    @GetMapping
    public List<Cita> getByDoctorConsultorio(@RequestParam("idDoctor") Long idDoctor, @RequestParam("idConsultorio") Long idConsultorio){
        return service.getByDoctorConsultorio(idDoctor, idConsultorio);
    }

    @GetMapping
    public List<Cita> getByFechaConsultorioDoctor(@RequestParam("fecha") Date fecha, @RequestParam("idConsultorio") Long idConsultorio, @RequestParam("idDoctor") Long idDoctor){
        return service.getByFechaConsultorioDoctor(fecha, idConsultorio, idDoctor);
    }

    @PostMapping
    public Cita save(@Valid @RequestBody Cita cita){
        return service.save(cita);
    }

    @PutMapping
    public Cita update(@Valid @RequestBody Cita cita){
        return service.update(cita);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
