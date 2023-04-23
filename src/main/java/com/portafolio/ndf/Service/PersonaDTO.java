package com.portafolio.ndf.Service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaDTO {

    Long id;

    private String nombre;

    private String apellido;

    private String titulo1;

    private String titulo2;

    private String sobre_mi;

    private String banner;

    private String profile_image;

    private String cvpdf;

    private String textofooter;

    public PersonaDTO() {
    }

    public PersonaDTO(Long id, String nombre, String apellido, String titulo1, String titulo2, String sobre_mi, String banner, String profile_image, String cvpdf, String textofooter) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo1 = titulo1;
        this.titulo2 = titulo2;
        this.sobre_mi = sobre_mi;
        this.banner = banner;
        this.profile_image = profile_image;
        this.cvpdf = cvpdf;
        this.textofooter = textofooter;
    }
}
