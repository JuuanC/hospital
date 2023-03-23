package com.kosmos.hospital.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
public class Cita {

    @Id
    @SequenceGenerator(name = "citaSeqGen", sequenceName = "citaSeqGen", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "citaSeqGen")
    private Long idCita;

    @Column
    @NotNull(message = "El DOCTOR no puede estar vació")
    private Long idDoctor;

    @Column
    @NotNull(message = "El CONSULTORIO no puede estar vació")
    private Long idConsultorio;

    @Column
    @NotNull(message = "La FECHA de la CITA no puede estar vaciá")
    private Date fecha;

    @Column
    @NotNull(message = "La HORA de la CITA no puede estar vaciá")
    private Time hora;

    @Column
    @NotNull(message = "El NOMBRE DEL PACIENTE no puede estar vació")
    @Size(max = 200, message = "Maximo 200 caracteres")
    private String nombrePaciente;

    @Column
    @NotNull(message = "El ESTATUS de la CITA no puede estar vació")
    private String estatus;
}
