package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Consultorio {

    @Id
    @SequenceGenerator(name = "citaSeqGen", sequenceName = "citaSeqGen", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "citaSeqGen")
    private Long idConsultorio;

    @Column
    private int numero;

    @Column
    private  String piso;
}
