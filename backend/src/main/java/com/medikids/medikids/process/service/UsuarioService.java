package com.medikids.medikids.process.service;

import com.medikids.medikids.process.dto.UsuarioDto;
import com.medikids.medikids.process.repository.UsuarioRepository;
import com.medikids.medikids.utils.helpers.UsuarioHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioDto> getAll() {
        return UsuarioHelper.mapAll(usuarioRepository.findAll());
    }
}
