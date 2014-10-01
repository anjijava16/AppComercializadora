package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * NomHistorialProvisiones generated by hbm2java
 */
public class NomHistorialProvisiones  implements java.io.Serializable {


     private NomHistorialProvisionesId id;
     private String codAlm;
     private String numDoc;
     private String tipDoc;
     private String codSec;
     private String codTer;
     private BigDecimal cesantia;
     private BigDecimal icesantia;
     private BigDecimal primas;
     private BigDecimal vacaciones;
     private String codUsu;
     private Date fecSys;

    public NomHistorialProvisiones() {
    }

    public NomHistorialProvisiones(NomHistorialProvisionesId id, String codAlm, String numDoc, String tipDoc, String codSec, String codTer, BigDecimal cesantia, BigDecimal icesantia, BigDecimal primas, BigDecimal vacaciones, String codUsu, Date fecSys) {
       this.id = id;
       this.codAlm = codAlm;
       this.numDoc = numDoc;
       this.tipDoc = tipDoc;
       this.codSec = codSec;
       this.codTer = codTer;
       this.cesantia = cesantia;
       this.icesantia = icesantia;
       this.primas = primas;
       this.vacaciones = vacaciones;
       this.codUsu = codUsu;
       this.fecSys = fecSys;
    }
   
    public NomHistorialProvisionesId getId() {
        return this.id;
    }
    
    public void setId(NomHistorialProvisionesId id) {
        this.id = id;
    }
    public String getCodAlm() {
        return this.codAlm;
    }
    
    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }
    public String getNumDoc() {
        return this.numDoc;
    }
    
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    public String getTipDoc() {
        return this.tipDoc;
    }
    
    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }
    public String getCodSec() {
        return this.codSec;
    }
    
    public void setCodSec(String codSec) {
        this.codSec = codSec;
    }
    public String getCodTer() {
        return this.codTer;
    }
    
    public void setCodTer(String codTer) {
        this.codTer = codTer;
    }
    public BigDecimal getCesantia() {
        return this.cesantia;
    }
    
    public void setCesantia(BigDecimal cesantia) {
        this.cesantia = cesantia;
    }
    public BigDecimal getIcesantia() {
        return this.icesantia;
    }
    
    public void setIcesantia(BigDecimal icesantia) {
        this.icesantia = icesantia;
    }
    public BigDecimal getPrimas() {
        return this.primas;
    }
    
    public void setPrimas(BigDecimal primas) {
        this.primas = primas;
    }
    public BigDecimal getVacaciones() {
        return this.vacaciones;
    }
    
    public void setVacaciones(BigDecimal vacaciones) {
        this.vacaciones = vacaciones;
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




}


