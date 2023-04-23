package com.portafolio.ndf.Service;

import com.portafolio.ndf.Entity.Redes;
import com.portafolio.ndf.Repository.RRedes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SRedes {

    @Autowired
    RRedes rredes;

    public List<Redes> listarItems() {
        return rredes.findAll();
    }

    public Redes cargarItem(Long id) {
        return rredes.findById(id).orElse(null);
    }

    public void crearItem(Redes red) {
        rredes.save(red);
    }

    public void borrarItem(Long id) {
        rredes.deleteById(id);
    }

    public void modificarItem(Redes red) {
        rredes.save(red);
    }
}
