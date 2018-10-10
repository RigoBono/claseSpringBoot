package org.generation.apigeneration.rest;

import org.generation.apigeneration.Repos.PersonaRepository;
import org.generation.apigeneration.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PersonaREST {

    @Autowired
    PersonaRepository personaRepository;

    @PostMapping("/persona/create.gen")
    public Persona create(
            @Param("nombre") String nombre,
            @Param("paterno") String paterno,
            @Param("materno") String materno){
        Persona persona=new Persona();
        persona.setMaterno(materno);
        persona.setPaterno(paterno);
        persona.setNombre(nombre);
        persona.setDtCreado(new Date());
        persona.setDtModificado(new Date());
        personaRepository.save(persona);
        return persona;
    }

    /*@PostMapping("/persona/create.gen")
    public Persona create(
            @RequestBody Persona persona){
        persona.setDtCreado(new Date());
        persona.setDtModificado(new Date());
        personaRepository.save(persona);
        return persona;
    }*/
}
