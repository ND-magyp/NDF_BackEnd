package com.portafolio.ndf.Service;

import com.portafolio.ndf.Entity.Persona;
import com.portafolio.ndf.Repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPersona {

    @Autowired
    RPersona rpersona;

    public List<Persona> listarItems() {
        return rpersona.findAll();
    }

    public Persona cargarItem(Long id) {
        return rpersona.findById(id).orElse(null);
    }

    public void crearItem(Persona persona) {
        rpersona.save(persona);
    }

    public void borrarItem(Long id) {
        rpersona.deleteById(id);
    }

    public void modificarItem(Persona persona) {
        rpersona.save(persona);
    }

    public PersonaDTO login(String email, String password) {
        Persona persona = rpersona.findByEmailAndPassword(email, password);
        PersonaDTO personaDTO = new PersonaDTO(persona.getId(), persona.getBanner(), persona.getProfile_image(), persona.getNombre(), persona.getApellido(), persona.getTitulo1(), persona.getTitulo2(), persona.getSobre_mi(), persona.getCvpdf(), persona.getTextofooter());
        return personaDTO;
    }
}
