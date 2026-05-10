package com.medikids.medikids_osorio_backend.process.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Setter
@Getter
@Builder
public class PacienteDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id_paciente;
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String sexo;
    private String dni;
    private int id_cliente; // apoderado
}