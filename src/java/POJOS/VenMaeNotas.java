package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * VenMaeNotas generated by hbm2java
 */
public class VenMaeNotas  implements java.io.Serializable {


     private VenMaeNotasId id;
     private String codter;
     private BigDecimal valNota;
     private BigDecimal valCartera;
     private BigDecimal valAnticipo;
     private Date fecNota;
     private String codUsu;
     private Date fecSys;
     private String estado;
     private String numFac;
     private String tipFac;
     private String codres;
     private BigDecimal valret;
     private String codterant;

    public VenMaeNotas() {
    }

    public VenMaeNotas(VenMaeNotasId id, String codter, BigDecimal valNota, BigDecimal valCartera, BigDecimal valAnticipo, Date fecNota, String codUsu, Date fecSys, String estado, String numFac, String tipFac, String codres, BigDecimal valret, String codterant) {
       this.id = id;
       this.codter = codter;
       this.valNota = valNota;
       this.valCartera = valCartera;
       this.valAnticipo = valAnticipo;
       this.fecNota = fecNota;
       this.codUsu = codUsu;
       this.fecSys = fecSys;
       this.estado = estado;
       this.numFac = numFac;
       this.tipFac = tipFac;
       this.codres = codres;
       this.valret = valret;
       this.codterant = codterant;
    }
   
    public VenMaeNotasId getId() {
        return this.id;
    }
    
    public void setId(VenMaeNotasId id) {
        this.id = id;
    }
    public String getCodter() {
        return this.codter;
    }
    
    public void setCodter(String codter) {
        this.codter = codter;
    }
    public BigDecimal getValNota() {
        return this.valNota;
    }
    
    public void setValNota(BigDecimal valNota) {
        this.valNota = valNota;
    }
    public BigDecimal getValCartera() {
        return this.valCartera;
    }
    
    public void setValCartera(BigDecimal valCartera) {
        this.valCartera = valCartera;
    }
    public BigDecimal getValAnticipo() {
        return this.valAnticipo;
    }
    
    public void setValAnticipo(BigDecimal valAnticipo) {
        this.valAnticipo = valAnticipo;
    }
    public Date getFecNota() {
        return this.fecNota;
    }
    
    public void setFecNota(Date fecNota) {
        this.fecNota = fecNota;
    }
    public String getCodUsu() {
        return this.codUsu;
    }
    
    public void setCodUsu(String codUsu) {
        this.codUsu = codUsu;
    }
    public Date getFecSys() {
        return this.fecSys;
    }
    
    public void setFecSys(Date fecSys) {
        this.fecSys = fecSys;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getNumFac() {
        return this.numFac;
    }
    
    public void setNumFac(String numFac) {
        this.numFac = numFac;
    }
    public String getTipFac() {
        return this.tipFac;
    }
    
    public void setTipFac(String tipFac) {
        this.tipFac = tipFac;
    }
    public String getCodres() {
        return this.codres;
    }
    
    public void setCodres(String codres) {
        this.codres = codres;
    }
    public BigDecimal getValret() {
        return this.valret;
    }
    
    public void setValret(BigDecimal valret) {
        this.valret = valret;
    }
    public String getCodterant() {
        return this.codterant;
    }
    
    public void setCodterant(String codterant) {
        this.codterant = codterant;
    }




}


