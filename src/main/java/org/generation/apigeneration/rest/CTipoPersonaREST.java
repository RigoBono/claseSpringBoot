package org.generation.apigeneration.rest;


import org.generation.apigeneration.Repos.CTipoPersonaRepository;
import org.generation.apigeneration.model.CTipoPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/ctipopersona/{id}")
    public CTipoPersona getById(@PathVariable("id") Integer id){
        return cTipoPersonaRepository.findById(id).get();
    }

    @GetMapping("/ctipopersona/name/{nombre}")
    public CTipoPersona getByName(@PathVariable("nombre") String nombre){
        return cTipoPersonaRepository.findBycTipoPersona(nombre);
    }


    @PostMapping("/ctipopersona/modificar.gen")
    public CTipoPersona modificar(
            @Param("id") Integer id,
            @Param("cTipo") String cTipo){
        CTipoPersona cTipoPersona=cTipoPersonaRepository.findById(id).get();
        if(cTipoPersona!=null){
            cTipoPersona.setCTipoPersona(cTipo);
            cTipoPersonaRepository.save(cTipoPersona);
            return cTipoPersona;
        }
        return null;
    }



}
