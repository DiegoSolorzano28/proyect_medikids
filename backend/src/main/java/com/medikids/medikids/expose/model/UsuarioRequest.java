package com.medikids.medikids.expose.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class UsuarioRequest {
    private int id_usuario;
    private int id_rol;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private int telefono;
}
