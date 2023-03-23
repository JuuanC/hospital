package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cita {

    @Id
    @SequenceGenerator(name = "citaSeqGen", sequenceName = "citaSeqGen", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "citaSeqGen")
    private Long idCita;

    @Column
    private Long idDoctor;

    @Column
    private Long idConsultorio;

    @Column
    private String horaCita;

    @Column
    private String nombrePaciente;
}
