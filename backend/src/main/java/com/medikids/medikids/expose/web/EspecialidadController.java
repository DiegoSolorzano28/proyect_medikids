package com.medikids.medikids.expose.web;

import com.medikids.medikids.process.domain.Especialidad;
import com.medikids.medikids.process.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping("/all")
    public List<Especialidad> all() {
        return especialidadService.getAll();
    }

    @GetMapping("/getBy/{id}")
    public Especialidad getById(@PathVariable int id) {
        return especialidadService.getById(id);
    }
}
