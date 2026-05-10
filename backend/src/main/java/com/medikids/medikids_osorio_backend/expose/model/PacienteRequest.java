package com.medikids.medikids_osorio_backend.expose.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class PacienteRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id_cliente;   // apoderado
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String sexo;
    private String dni;
}