package com.portafolio.ndf.Repository;

import com.portafolio.ndf.Entity.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudios extends JpaRepository<Estudios, Long> {

}
