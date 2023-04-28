package com.myportfolio.argprogviviana.controller;

import com.myportfolio.argprogviviana.entity.Experiencia;
import com.myportfolio.argprogviviana.service.SExperiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("experiencia")
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://portfoliovivianaverachtert.web.app")
public class CExperiencia {
    @Autowired
    SExperiencia experienciaServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return experienciaServ.verExperiencias();
    }

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Experiencia buscarExpe(@PathVariable int id) {
        return experienciaServ.buscarExperiencia(id);
    }

    @PostMapping("/crear")
    public String crearExperiencia(@RequestBody Experiencia expe){
        experienciaServ.crearExperiencia(expe);
        return "La experiencia fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarExperiencia(@PathVariable int id){
        experienciaServ.borrarExperiencia(id);
        return "La experiencia ha sido eliminada correctamente";
    }

    @PutMapping("/editar")
    public void editarExperiencia(@RequestBody Experiencia expe) {
       experienciaServ.editarExperiencia(expe);
    }

}
