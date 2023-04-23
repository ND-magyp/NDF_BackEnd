package com.portafolio.ndf.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Estudios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String lugar;

    private String anio;

    @Lob
    @Column(name = "titulo", length = 800)
    private String titulo;

    public Estudios() {
    }

    public Estudios(String lugar, String anio, String titulo) {

        this.lugar = lugar;
        this.anio = anio;
        this.titulo = titulo;
    }
}
