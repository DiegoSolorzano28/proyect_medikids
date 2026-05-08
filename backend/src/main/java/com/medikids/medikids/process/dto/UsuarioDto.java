package com.medikids.medikids.process.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Builder
public class UsuarioDto implements Serializable  {
    private static final long serialVersionUID = 1L;

    private int id_usuario;
    private int id_rol;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private int telefono;
}
