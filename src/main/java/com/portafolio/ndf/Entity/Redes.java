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
public class Redes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    private String nombre;

    @Lob
    @Column(name = "url", length = 800)
    private String url;

    @Lob
    @Column(name = "ico_font", length = 800)
    private String ico_font;

    public Redes() {
    }

    public Redes(String nombre,String url, String ico_font) {
        this.nombre = nombre;
        this.url = url;
        this.ico_font = ico_font;
    }
}
