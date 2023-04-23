package com.portafolio.ndf.Controller;

import com.portafolio.ndf.Entity.Redes;
import com.portafolio.ndf.Service.SRedes;
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
@CrossOrigin(origins = "http://localhost:4200") //con que se va a cruzar, o sea, angular
//@CrossOrigin(origins = "https://portfoliofrontend-ndf.web.app")
public class CRedes {

    @Autowired
    SRedes sredes;

    @GetMapping("/redes")
    @ResponseBody
    public List<Redes> listarItems() {
        return sredes.listarItems();
    }

    @PostMapping("/redes")
    @ResponseBody
    public String crearItem(@RequestBody Redes red) {
        sredes.crearItem(red);
        return "Creado correctamente";
    }

    @DeleteMapping("/redes/{id}")
    public String borrarRede(@PathVariable Long id) {
        sredes.borrarItem(id);
        return "Eliminado correctamente";
    }

    @GetMapping("/redes/{id}")
    @ResponseBody
    public Redes cargarItem(@PathVariable Long id) {
        return sredes.cargarItem(id);
    }

    @PutMapping("/redes")
    public String modificarItem(@RequestBody Redes red) {
        sredes.modificarItem(red);
        return "Modificado correctamente";
    }
}
