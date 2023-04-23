package com.portafolio.ndf.Repository;

import com.portafolio.ndf.Entity.Experiencias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencias extends JpaRepository<Experiencias, Long> {

}
