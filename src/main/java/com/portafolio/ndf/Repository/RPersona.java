package com.portafolio.ndf.Repository;

import com.portafolio.ndf.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Long> {

    public Persona findByEmailAndPassword(String email, String password);
}
