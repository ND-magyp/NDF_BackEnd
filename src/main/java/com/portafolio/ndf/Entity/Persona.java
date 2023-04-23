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
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "banner", length = 800)
    private String banner;

    @Lob
    @Column(name = "profile_image", length = 800)
    private String profile_image;

    private String nombre;

    private String apellido;

    private String titulo1;

    private String titulo2;

    @Lob
    @Column(name = "sobre_mi", length = 800)
    private String sobre_mi;

    @Lob
    @Column(name = "cvpdf", length = 800)
    private String cvpdf;

    @Lob
    @Column(name = "textofooter", length = 800)
    private String textofooter;

    @Lob
    private String email;

    private String password;

    public Persona() {
    }

    public Persona(Long id, String banner, String profile_image, String nombre, String apellido, String titulo1, String titulo2, String sobre_mi, String cvpdf, String textofooter, String email, String password) {
        this.id = id;
        this.banner = banner;
        this.profile_image = profile_image;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo1 = titulo1;
        this.titulo2 = titulo2;
        this.sobre_mi = sobre_mi;
        this.cvpdf = cvpdf;
        this.textofooter = textofooter;
        this.email = email;
        this.password = password;
    }
}
