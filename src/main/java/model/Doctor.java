package model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
public class Doctor {

    @Id
    @SequenceGenerator(name = "citaSeqGen", sequenceName = "citaSeqGen", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "citaSeqGen")
    private Long idDoctor;

    @Column
    @NotNull(message = "El NOMBRE no puede estar vació")
    @Size(max = 50, message = "Maximo 50 caracteres")
    private String nombre;

    @Column
    @NotNull(message = "El APELLIDO PATERNO no puede estar vació")
    @Size(max = 100, message = "Maximo 100 caracteres")
    private String apellidoPaterno;

    @Column
    @NotNull(message = "El APELLIDO MATERNO no puede estar vació")
    @Size(max = 100, message = "Maximo 100 caracteres")
    private String apellidoMaterno;

    @Column
    @NotNull(message = "La ESPECIALIDAD no puede estar vació")
    @Size(max = 100, message = "Maximo 100 caracteres")
    private String especialidad;
}
