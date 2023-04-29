package com.myportfolio.argprogviviana.service;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDTO {
    int id;

    private String nombre;

    private String apellido;

    private String titulo;

    private String foto_perfil;

    private String textsobre_mi;

    private String textsobre_mi2;

    private String textsobre_mi3;

    private String cv;

    public PersonaDTO() {
    }

    public PersonaDTO(int id, String nombre, String apellido, String titulo, String foto_perfil, String textsobre_mi, String textsobre_mi2, String textsobre_mi3, String cv) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.foto_perfil = foto_perfil;
        this.textsobre_mi = textsobre_mi;
        this.textsobre_mi2 = textsobre_mi2;
        this.textsobre_mi3 = textsobre_mi3;
        this.cv = cv;
    }
}
