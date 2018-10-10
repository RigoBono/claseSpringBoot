package org.generation.apigeneration.MVC;


import org.generation.apigeneration.Repos.CTipoPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CTipoPersonaMVC {

    @Autowired
    CTipoPersonaRepository cTipoPersonaRepository;

    @PostMapping("/ctipo/saluda")
    public String saludo(
            @Param("ctipopersona") String cTipoPersona,
            Model model){
        model.addAttribute("CTipo","hola");
        System.out.println(cTipoPersona);
        return "saludo";
    }

    @GetMapping("/ctipos")
    public String getAllCTipo(Model model){
        model.addAttribute("ctipos",cTipoPersonaRepository.findAll());
        return "muestractipos";
    }

}
