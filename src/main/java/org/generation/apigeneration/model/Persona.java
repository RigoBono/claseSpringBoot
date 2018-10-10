package org.generation.apigeneration.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table
@Entity(name="Persona")
public class Persona implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idPersona")
    private Integer idPersona;

    @Column(name="nombre")
    private String nombre;

    @Column(name="paterno")
    private String paterno;

    @Column(name="materno")
    private String materno;

    @Column(name="dtCreado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCreado;

    @Column(name="dtModificado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtModificado;

    @ManyToOne
    @JoinColumn(name="idCTipoPersona")
    private CTipoPersona cTipoPersona;



    public Persona() {
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Date getDtCreado() {
        return dtCreado;
    }

    public void setDtCreado(Date dtCreado) {
        this.dtCreado = dtCreado;
    }

    public Date getDtModificado() {
        return dtModificado;
    }

    public void setDtModificado(Date dtModificado) {
        this.dtModificado = dtModificado;
    }

    public CTipoPersona getcTipoPersona() {
        return cTipoPersona;
    }


}
