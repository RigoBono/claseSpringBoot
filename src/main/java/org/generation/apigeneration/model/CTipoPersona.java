package org.generation.apigeneration.model;


import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity(name="CTipoPersona")
public class CTipoPersona  implements Serializable{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idCTipoPersona")
    private Integer idCTipoPersona;

    @Column(name="CTipoPersona")
    private String CTipoPersona;


    public CTipoPersona(Integer idCTipoPersona, String CTipoPersona) {
        this.idCTipoPersona = idCTipoPersona;
        this.CTipoPersona = CTipoPersona;
    }

    public CTipoPersona() {
    }

    public Integer getIdCTipoPersona() {
        return idCTipoPersona;
    }

    public void setIdCTipoPersona(Integer idCTipoPersona) {
        this.idCTipoPersona = idCTipoPersona;
    }

    public String getCTipoPersona() {
        return CTipoPersona;
    }

    public void setCTipoPersona(String CTipoPersona) {
        this.CTipoPersona = CTipoPersona;
    }
}
