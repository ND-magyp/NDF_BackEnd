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
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Lob
    @Column(name = "logo_proyecto", length = 800)
    private String logo_proyecto;

    @Lob
    @Column(name = "url_proyecto", length = 800)
    private String url_proyecto;

    @Lob
    @Column(name = "titulo_proyecto", length = 800)
    private String titulo_proyecto;

    @Lob
    @Column(name = "descripcion", length = 800)
    private String descripcion;

    public Proyectos() {
    }

    public Proyectos(String logo_proyecto, String url_proyecto, String titulo_proyecto, String descripcion) {
        this.logo_proyecto = logo_proyecto;
        this.url_proyecto = url_proyecto;
        this.titulo_proyecto = titulo_proyecto;
        this.descripcion = descripcion;
    }
}
