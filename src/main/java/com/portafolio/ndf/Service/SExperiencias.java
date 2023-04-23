package com.portafolio.ndf.Service;

import com.portafolio.ndf.Entity.Experiencias;
import com.portafolio.ndf.Repository.RExperiencias;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SExperiencias {
// Inyecta el repositorio

    @Autowired
    RExperiencias rexperiencias;

    public List<Experiencias> listarItems() {
        return rexperiencias.findAll();
    }

    public Experiencias cargarItem(Long id) {
        return rexperiencias.findById(id).orElse(null);
    }

    public void crearItem(Experiencias experiencia) {
        rexperiencias.save(experiencia);
    }

    public void borrarItem(Long id) {
        rexperiencias.deleteById(id);
    }

    public void modificarItem(Experiencias experiencia) {
        rexperiencias.save(experiencia);
    }

}
