package org.generation.apigeneration.rest;


import org.generation.apigeneration.Repos.CTipoPersonaRepository;
import org.generation.apigeneration.model.CTipoPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CTipoPersonaREST {

    @Autowired
    CTipoPersonaRepository cTipoPersonaRepository;

    @PostMapping("/ctipopersona/crud/create")
    public List<CTipoPersona> create(@RequestParam("Tipo") String tipo){
        CTipoPersona cTipoPersona=new CTipoPersona();
        cTipoPersona.setCTipoPersona(tipo);
        cTipoPersonaRepository.save(cTipoPersona);
        return cTipoPersonaRepository.findAll();
    }

    @GetMapping("/ctipopersona/crud/getall")
    public List<CTipoPersona> getall(){
        return cTipoPersonaRepository.findAll();
    }



}
