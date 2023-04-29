package com.myportfolio.argprogviviana.controller;

import com.myportfolio.argprogviviana.entity.Persona;
import com.myportfolio.argprogviviana.service.PersonaDTO;
import com.myportfolio.argprogviviana.service.SPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfoliovivianaverachtert.web.app")
public class CPersona {
    @Autowired
    SPersona personaServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> verPersonas(){
        return personaServ.verPersonas();
    }

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable int id) {
        return personaServ.buscarPersona(id);
    }

    @PutMapping("/editar")
    public void editarPersona(@RequestBody Persona pers) {
        personaServ.editarPersona(pers);
    }

    @PostMapping("/crear")
    public String crearPersona(@RequestBody Persona pers){
        personaServ.crearPersona(pers);
        return "La persona fue creada correctamente";
    }

    @PostMapping("/login")
    @ResponseBody
    public PersonaDTO login(@RequestBody Persona pers){
        return personaServ.login(pers.getEmail(), pers.getPassword());
    }

    ///@DeleteMapping("/borrar/{id}")
    ///public String borrarPersona(@PathVariable int id){
    ///   personaServ.borrarPersona(id);
    ///  return "La persona fue borrada correctamente";
    ///}

}
