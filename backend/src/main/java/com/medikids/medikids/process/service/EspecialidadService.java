package com.medikids.medikids.process.service;

import com.medikids.medikids.expose.model.EspecialidadRequest;
import com.medikids.medikids.process.domain.Especialidad;
import com.medikids.medikids.process.dto.EspecialidadDto;
import com.medikids.medikids.process.repository.EspecialidadRepository;
import com.medikids.medikids.utils.helpers.EspecialidadHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    public List<EspecialidadDto> getAll() {
        return EspecialidadHelper.mapAll(especialidadRepository.findAll());
    }

    public EspecialidadDto getById(int id) {
        Optional<Especialidad> especialidad = especialidadRepository.findById(id);
        return especialidad.map(EspecialidadHelper::mapEspecialidad).orElse(null);
    }

    public EspecialidadDto save(EspecialidadRequest especialidad) {
        return EspecialidadHelper.mapEspecialidad(
                especialidadRepository.save(EspecialidadHelper.buildEspecialidad(especialidad))
        );
    }

    public EspecialidadDto update(int id, EspecialidadRequest especialidad) {
        Optional<Especialidad> especialidadUpdate = especialidadRepository.findById(id);
        if (especialidadUpdate.isPresent()) {
            especialidadUpdate.get().setNombre_especialidad(especialidad.getNombre_especialidad());
            especialidadUpdate.get().setDescripcion(especialidad.getDescripcion());
            especialidadUpdate.get().setPrecio(especialidad.getPrecio());

            return EspecialidadHelper.mapEspecialidad(especialidadRepository.save(especialidadUpdate.get()));
        }
        return null;
    }
}