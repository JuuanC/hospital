package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Doctor {

    @Id
    @SequenceGenerator(name = "citaSeqGen", sequenceName = "citaSeqGen", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "citaSeqGen")
    private Long idDoctor;

    @Column
    private String nombre;

    @Column
    private String apellidoPaterno;

    @Column
    private String apellidoMaterno;

    @Column
    private String especialidad;
}
