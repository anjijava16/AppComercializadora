package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * TesNb generated by hbm2java
 */
public class TesNb  implements java.io.Serializable {


     private TesNbId id;
     private Date fecNot;
     private char tipNot;
     private BigDecimal valNot;
     private String codter;
     private String codCta;
     private String estNot;
     private String observa;
     private String codUsu;
     private Date fecSys;
     private String pc;

    public TesNb() {
    }

    public TesNb(TesNbId id, Date fecNot, char tipNot, BigDecimal valNot, String codter, String codCta, String estNot, String observa, String codUsu, Date fecSys, String pc) {
       this.id = id;
       this.fecNot = fecNot;
       this.tipNot = tipNot;
       this.valNot = valNot;
       this.codter = codter;
       this.codCta = codCta;
       this.estNot = estNot;
       this.observa = observa;
       this.codUsu = codUsu;
       this.fecSys = fecSys;
       this.pc = pc;
    }
   
    public TesNbId getId() {
        return this.id;
    }
    
    public void setId(TesNbId id) {
        this.id = id;
    }
    public Date getFecNot() {
        return this.fecNot;
    }
    
    public void setFecNot(Date fecNot) {
        this.fecNot = fecNot;
    }
    public char getTipNot() {
        return this.tipNot;
    }
    
    public void setTipNot(char tipNot) {
        this.tipNot = tipNot;
    }
    public BigDecimal getValNot() {
        return this.valNot;
    }
    
    public void setValNot(BigDecimal valNot) {
        this.valNot = valNot;
    }
    public String getCodter() {
        return this.codter;
    }
    
    public void setCodter(String codter) {
        this.codter = codter;
    }
    public String getCodCta() {
        return this.codCta;
    }
    
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    public String getEstNot() {
        return this.estNot;
    }
    
    public void setEstNot(String estNot) {
        this.estNot = estNot;
    }
    public String getObserva() {
        return this.observa;
    }
    
    public void setObserva(String observa) {
        this.observa = observa;
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
    public String getPc() {
        return this.pc;
    }
    
    public void setPc(String pc) {
        this.pc = pc;
    }




}


