package com.medikids.medikids.expose.web;

import com.medikids.medikids.process.dto.UsuarioDto;
import com.medikids.medikids.process.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;

    @GetMapping("/all")
    public List<UsuarioDto> all() {
        return usuarioService.getAll();
    }
}
