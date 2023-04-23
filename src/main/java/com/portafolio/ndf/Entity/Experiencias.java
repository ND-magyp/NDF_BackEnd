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
public class Experiencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String empresa;

    @Lob
    @Column(name = "puesto", length = 800)
    private String puesto;

    private String inicio;

    private String fin;

    //constructor
    public Experiencias() {
    }

    public Experiencias(String empresa, String puesto, String inicio, String fin) {

        this.empresa = empresa;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;

    }
}
