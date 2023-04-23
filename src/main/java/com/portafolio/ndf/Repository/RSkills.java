package com.portafolio.ndf.Repository;

import com.portafolio.ndf.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Long> {

}
