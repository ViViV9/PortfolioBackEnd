package com.myportfolio.argprogviviana.service;

import com.myportfolio.argprogviviana.entity.Persona;
import com.myportfolio.argprogviviana.repository.RPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SPersona{
    @Autowired
     private RPersona personaRepo;

    public List<Persona> verPersonas(){
        return  personaRepo.findAll();
    }

    public Persona buscarPersona(Integer id) {
        return personaRepo.findById(id).orElse(null);
    }

    public void editarPersona(Persona perso){
        personaRepo.save(perso);
    }

    public void crearPersona(Persona perso){
        personaRepo.save(perso);
    }

    public PersonaDTO login(String email, String password) {
        Persona pers= personaRepo.findByEmailAndPassword(email, password);
        PersonaDTO personaDTO = new PersonaDTO(pers.getId(), pers.getNombre(), pers.getApellido(), pers.getTitulo(), pers.getFoto_perfil(), pers.getTextsobre_mi(), pers.getTextsobre_mi2(), pers.getTextsobre_mi3(), pers.getCv());
        return personaDTO;
    }

    ///public void borrarPersona(int id){
       /// personaRepo.deleteById(id);
    ///}


}
