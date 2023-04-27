package com.portafolio.ndf.Controller;

import com.portafolio.ndf.Service.PersonaDTO;
import com.portafolio.ndf.Entity.Persona;
import com.portafolio.ndf.Service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
//@CrossOrigin(origins = "http://localhost:4200") 
@CrossOrigin(origins = "https://portfoliondf.web.app")

public class CPersona {

    @Autowired
    SPersona spersona;

    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> listarItems() {
        return spersona.listarItems();
    }

    @PostMapping("/persona")
    @ResponseBody
    public String crearItem(@RequestBody Persona persona) {
        spersona.crearItem(persona);
        return "Creado correctamente";
    }

    @DeleteMapping("/persona/{id}")
    public String borrarExperiencia(@PathVariable Long id) {
        spersona.borrarItem(id);
        return "Eliminado correctamente";
    }

    @GetMapping("/persona/{id}")
    @ResponseBody
    public Persona cargarItem(@PathVariable Long id) {
        return spersona.cargarItem(id);
    }

    @PutMapping("/persona")
    public String modificarItem(@RequestBody Persona persona) {
        spersona.modificarItem(persona);
        return "Modificado correctamente";
    }

    @PostMapping("/login")
    @ResponseBody
    public PersonaDTO login(@RequestBody Persona persona) {
        return spersona.login(persona.getEmail(), persona.getPassword());
    }
}
