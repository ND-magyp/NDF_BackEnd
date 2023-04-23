package com.portafolio.ndf.Service;

import com.portafolio.ndf.Entity.Estudios;
import com.portafolio.ndf.Repository.REstudios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEstudios {

    @Autowired
    REstudios restudios;

    public List<Estudios> listarItems() {
        return restudios.findAll();
    }

    public Estudios cargarItem(Long id) {
        return restudios.findById(id).orElse(null);
    }

    public void crearItem(Estudios estudio) {
        restudios.save(estudio);
    }

    public void borrarItem(Long id) {
        restudios.deleteById(id);
    }

    public void modificarItem(Estudios estudio) {
        restudios.save(estudio);
    }
}
