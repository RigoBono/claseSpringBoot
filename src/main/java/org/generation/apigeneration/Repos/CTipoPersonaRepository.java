package org.generation.apigeneration.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.generation.apigeneration.model.CTipoPersona;
import org.springframework.data.jpa.repository.Query;

public interface CTipoPersonaRepository extends JpaRepository<CTipoPersona,Integer> {

    CTipoPersona findBycTipoPersona(String cTipoPersona);

   // @Query("SELECT c FROM CTipoPersona as c WHERE c.CTipoPersona=?1")
   // CTipoPersona findByCTipoPersona(String cTipoPersona);
}
