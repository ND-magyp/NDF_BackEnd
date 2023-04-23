package com.portafolio.ndf.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String nombre;

    private String porcentaje;
    
    private String color;

    private String ico_font;

    private String titulo;

    public Skills() {
    }

    public Skills(String nombre, String porcentaje,String color, String ico_font, String titulo) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.color = color;
        this.ico_font = ico_font;
        this.titulo = titulo;
    }
}
