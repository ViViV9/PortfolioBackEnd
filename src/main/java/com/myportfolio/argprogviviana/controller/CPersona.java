package com.myportfolio.argprogviviana.controller;

import com.myportfolio.argprogviviana.entity.Persona;
import com.myportfolio.argprogviviana.service.PersonaDTO;
import com.myportfolio.argprogviviana.service.SPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("persona")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfoliovivianaverachtert.web.app")
public class CPersona {
    @Autowired
    SPersona personaServ;

    ///@GetMapping("/buscar/{id}") esto lo comenté para probar si me funcionan los cambios
    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable int id) {
        return personaServ.buscarPersona(id);
    }

    @PutMapping("/persona")
    public void editarPersona(@RequestBody Persona pers) {
        personaServ.editarPersona(pers);
    }

    @PostMapping("/login")
    @ResponseBody
    public PersonaDTO login(@RequestBody Persona pers){
        return personaServ.login(pers.getEmail(), pers.getPassword());
    }

    ///@GetMapping("/lista")
    ///@ResponseBody
    ///public List<Persona> verPersonas(){
        ///return personaServ.verPersonas();
    ///}

    ///@PostMapping("/crear")
    /// public String crearPersona(@RequestBody Persona pers){
    ///    personaServ.crearPersona(pers);
    ///    return "La persona fue creada correctamente";
    ///}

    ///@DeleteMapping("/borrar/{id}")
    ///public String borrarPersona(@PathVariable int id){
    ///   personaServ.borrarPersona(id);
    ///  return "La persona fue borrada correctamente";
    ///}

}
