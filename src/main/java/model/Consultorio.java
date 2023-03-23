package model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Consultorio {

    @Id
    @SequenceGenerator(name = "citaSeqGen", sequenceName = "citaSeqGen", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "citaSeqGen")
    private Long idConsultorio;

    @Column
    @NotNull(message = "El NUMERO de CONSULTORIO no puede estar vació")
    private int numero;

    @Column
    @NotNull(message = "El PISO del CONSULTORIO no puede estar vació")
    private  String piso;
}
