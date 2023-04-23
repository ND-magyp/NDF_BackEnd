package com.portafolio.ndf.Repository;

import com.portafolio.ndf.Entity.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRedes extends JpaRepository<Redes, Long> {

}
