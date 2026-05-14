package com.medikids.medikids.process.service;

import com.medikids.medikids.process.domain.Especialidad;
import com.medikids.medikids.process.repository.EspecialidadRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    public List<Especialidad> getAll() {
        return especialidadRepository.findAll();
    }

    public Especialidad getById(int id) {
        return especialidadRepository.findById((long) id).orElse(null);
    }

    @PostConstruct
    public void seed() {
        if (especialidadRepository.count() > 0) return;
        especialidadRepository.saveAll(List.of(
                Especialidad.builder().nombre("Pediatría General").descripcion("Atención pediátrica general").build(),
                Especialidad.builder().nombre("Neurología Pediátrica").descripcion("Trastornos neurológicos infantiles").build(),
                Especialidad.builder().nombre("Odontopediatría").descripcion("Salud dental infantil").build(),
                Especialidad.builder().nombre("Dermatología Pediátrica").descripcion("Enfermedades de la piel en niños").build(),
                Especialidad.builder().nombre("Cardiología Pediátrica").descripcion("Enfermedades del corazón infantiles").build(),
                Especialidad.builder().nombre("Oftalmología Pediátrica").descripcion("Salud visual infantil").build(),
                Especialidad.builder().nombre("Psicología Infantil").descripcion("Salud mental y emocional infantil").build()
        ));
    }
}
