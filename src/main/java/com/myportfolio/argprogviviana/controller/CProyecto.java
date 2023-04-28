package com.myportfolio.argprogviviana.controller;

import com.myportfolio.argprogviviana.entity.Proyecto;
import com.myportfolio.argprogviviana.service.SProyecto;
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
@RequestMapping("proyecto")
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://portfoliovivianaverachtert.web.app")
public class CProyecto {
    @Autowired
    SProyecto proyectoServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyectoServ.verProyectos();
    }

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable int id) {
        return proyectoServ.buscarProyecto(id);
    }

    @PostMapping("/crear")
    public String crearProyecto(@RequestBody Proyecto proyect){
        proyectoServ.crearProyecto(proyect);
        return "El proyecto fue creado correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarProyecto(@PathVariable int id){
        proyectoServ.borrarProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }

    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto proyect) {
        proyectoServ.editarProyecto(proyect);
    }
}
