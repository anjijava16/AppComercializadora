package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * NomHistorialAportes generated by hbm2java
 */
public class NomHistorialAportes  implements java.io.Serializable {


     private NomHistorialAportesId id;
     private String codAlm;
     private String numDoc;
     private String tipDoc;
     private String codSec;
     private String codTer;
     private BigDecimal salud;
     private BigDecimal pension;
     private BigDecimal arp;
     private BigDecimal cajas;
     private BigDecimal sena;
     private BigDecimal icbf;
     private String codUsu;
     private Date fecSys;

    public NomHistorialAportes() {
    }

    public NomHistorialAportes(NomHistorialAportesId id, String codAlm, String numDoc, String tipDoc, String codSec, String codTer, BigDecimal salud, BigDecimal pension, BigDecimal arp, BigDecimal cajas, BigDecimal sena, BigDecimal icbf, String codUsu, Date fecSys) {
       this.id = id;
       this.codAlm = codAlm;
       this.numDoc = numDoc;
       this.tipDoc = tipDoc;
       this.codSec = codSec;
       this.codTer = codTer;
       this.salud = salud;
       this.pension = pension;
       this.arp = arp;
       this.cajas = cajas;
       this.sena = sena;
       this.icbf = icbf;
       this.codUsu = codUsu;
       this.fecSys = fecSys;
    }
   
    public NomHistorialAportesId getId() {
        return this.id;
    }
    
    public void setId(NomHistorialAportesId id) {
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
    public BigDecimal getSalud() {
        return this.salud;
    }
    
    public void setSalud(BigDecimal salud) {
        this.salud = salud;
    }
    public BigDecimal getPension() {
        return this.pension;
    }
    
    public void setPension(BigDecimal pension) {
        this.pension = pension;
    }
    public BigDecimal getArp() {
        return this.arp;
    }
    
    public void setArp(BigDecimal arp) {
        this.arp = arp;
    }
    public BigDecimal getCajas() {
        return this.cajas;
    }
    
    public void setCajas(BigDecimal cajas) {
        this.cajas = cajas;
    }
    public BigDecimal getSena() {
        return this.sena;
    }
    
    public void setSena(BigDecimal sena) {
        this.sena = sena;
    }
    public BigDecimal getIcbf() {
        return this.icbf;
    }
    
    public void setIcbf(BigDecimal icbf) {
        this.icbf = icbf;
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


