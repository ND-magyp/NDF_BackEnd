package com.portafolio.ndf.Controller;

import com.portafolio.ndf.Entity.Estudios;
import com.portafolio.ndf.Service.SEstudios;
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

@RestController //anotacion del spring o controlador
//@CrossOrigin(origins = "http://localhost:4200") //con que se va a cruzar, o sea, angular
@CrossOrigin(origins = "https://portfoliondf.web.app")

public class CEstudios {

    @Autowired
    SEstudios sestudios;

    @GetMapping("/estudios")
    @ResponseBody
    public List<Estudios> listarItems() {
        return sestudios.listarItems();
    }

    @PostMapping("/estudios")
    @ResponseBody
    public String crearItem(@RequestBody Estudios estudio) {
        sestudios.crearItem(estudio);
        return "Creado correctamente";
    }

    @DeleteMapping("/estudios/{id}")
    public String borrarExperiencia(@PathVariable Long id) {
        sestudios.borrarItem(id);
        return "Eliminado correctamente";
    }

    @GetMapping("/estudios/{id}")
    @ResponseBody
    public Estudios cargarItem(@PathVariable Long id) {
        return sestudios.cargarItem(id);
    }

    @PutMapping("/estudios")
    public String modificarItem(@RequestBody Estudios estudio) {
        sestudios.modificarItem(estudio);
        return "Modificado correctamente";
    }
}
