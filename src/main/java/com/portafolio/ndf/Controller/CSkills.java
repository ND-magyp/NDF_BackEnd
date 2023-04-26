package com.portafolio.ndf.Controller;

import com.portafolio.ndf.Entity.Skills;
import com.portafolio.ndf.Service.SSkills;
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
public class CSkills {

    @Autowired
    SSkills sskills;

    @GetMapping("/skills")
    @ResponseBody
    public List<Skills> listarItems() {
        return sskills.listarItems();
    }

    @PostMapping("/skills")
    @ResponseBody
    public String crearItem(@RequestBody Skills skill) {
        sskills.crearItem(skill);
        return "Creado correctamente";
    }

    @DeleteMapping("/skills/{id}")
    public String borrarSkill(@PathVariable Long id) {
        sskills.borrarItem(id);
        return "Eliminado correctamente";
    }

    @GetMapping("/skills/{id}")
    @ResponseBody
    public Skills cargarItem(@PathVariable Long id) {
        return sskills.cargarItem(id);
    }

    @PutMapping("/skills")
    public String modificarItem(@RequestBody Skills skill) {
        sskills.modificarItem(skill);
        return "Modificado correctamente";
    }
}
