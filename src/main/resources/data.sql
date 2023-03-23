DROP TABLE IF EXISTS doctor CASCADE;
DROP TABLE IF EXISTS consultorio CASCADE;
DROP TABLE IF EXISTS cita CASCADE;

DROP SEQUENCE IF EXISTS doctorSeqGen;
DROP SEQUENCE IF EXISTS consultorioSeqGen;
DROP SEQUENCE IF EXISTS citaSeqGen;

CREATE SEQUENCE doctorSeqGen START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE consultorioSeqGen START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE citaSeqGen START WITH 1 INCREMENT BY 1;

CREATE TABLE doctor
(
    id_doctor           BIGINT PRIMARY KEY NOT NULL,
    nombre              VARCHAR(50) NOT NULL,
    apellido_paterno    VARCHAR(100) NOT NULL,
    apellido_materno    VARCHAR(100) NOT NULL,
    especialidad        VARCHAR(100) NOT NULL
);

CREATE TABLE consultorio
(
    id_consultorio       BIGINT PRIMARY KEY NOT NULL,
    numero               INT NOT NULL,
    piso                 INT NOT NULL
);

CREATE TABLE cita
(
    id_cita             BIGINT PRIMARY KEY NOT NULL,
    id_doctor           BIGINT NOT NULL,
    id_consultorio      BIGINT NOT NULL,
    fecha               DATE NOT NULL,
    hora                TIME NOT NULL,
    nombre_paciente     VARCHAR(200) NOT NULL,
    estatus             VARCHAR(15) NOT NULL
);

ALTER TABLE cita
    ADD FOREIGN KEY (id_doctor)
        REFERENCES doctor(id_doctor);
ALTER TABLE cita
    ADD FOREIGN KEY (id_consultorio)
        REFERENCES consultorio(id_consultorio);

INSERT INTO doctor(id_doctor, nombre, apellido_paterno, apellido_materno, especialidad)
values (1, 'Kevin', 'K', 'Doe', 'CARDIOLOGO'),
       (2, 'John', 'J', 'DoeJ', 'UROLOGO'),
       (3, 'Laura', 'L', 'DoeL', 'NUTRIOLOGO'),
       (4, 'Arnold', 'A', 'DoeA', 'CIRUJANO DENTISTA'),
       (5, 'Taulok', 'T', 'DoeT', 'DERMATOLOGO');

INSERT INTO consultorio(id_consultorio, numero, piso)
values (1, 1, 2),
       (2, 2, 2),
       (3, 3, 3),
       (4, 4, 3),
       (5, 5, 4);