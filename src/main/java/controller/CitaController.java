package controller;

import model.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CitaService;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("cita")
public class CitaController {

    @Autowired
    CitaService service;

    @GetMapping("list")
    public String getList(){
        return "asdasdasdasd";
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
    public Cita save(@RequestBody Cita cita){
        return service.save(cita);
    }

    @PutMapping
    public Cita update(@RequestBody Cita cita){
        return service.update(cita);
    }

}
