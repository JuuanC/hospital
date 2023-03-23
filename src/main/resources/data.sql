DROP TABLE IF EXISTS doctor;
DROP TABLE IF EXISTS consultorio;
DROP TABLE IF EXISTS cita;

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
    piso                 VARCHAR(10) NOT NULL
);

CREATE TABLE cita
(
    id_cita             BIGINT PRIMARY KEY NOT NULL,
    id_doctor           BIGINT PRIMARY KEY NOT NULL,
    id_consultorio      BIGINT PRIMARY KEY NOT NULL,
    hora_cita           VARCHAR(50) NOT NULL,
    nombre_paciente     VARCHAR(200) NOT NULL,
);

ALTER TABLE cita
    ADD FOREIGN KEY (id_doctor)
        REFERENCES doctor(id_doctor);
ALTER TABLE cita
    ADD FOREIGN KEY (id_consultorio)
        REFERENCES consultorio(id_consultorio);

INSERT INTO doctor(id_doctor, nombre, apellido_paterno, apellido_materno)
values (1, 'Kevin', 'K', 'Doe'),
       (2, 'John', 'J', 'DoeJ'),
       (3, 'Laura', 'L', 'DoeL'),
       (4, 'Arnold', 'A', 'DoeA'),
       (5, 'Taulok', 'T', 'DoeT');

INSERT INTO consultorio(id_consultorio, numero, piso)
values (1, 'Kevin', 'K', 'Doe'),
       (2, 'John', 'J', 'DoeJ'),
       (3, 'Laura', 'L', 'DoeL'),
       (4, 'Arnold', 'A', 'DoeA'),
       (5, 'Taulok', 'T', 'DoeT');