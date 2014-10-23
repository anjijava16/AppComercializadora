package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * NomTransxEmpTmp generated by hbm2java
 */
public class NomTransxEmpTmp  implements java.io.Serializable {


     private NomTransxEmpTmpId id;
     private BigDecimal qty;
     private BigDecimal vrUnitario;
     private String codAlmPre;
     private String numPre;
     private String numCuo;
     private byte PIni;
     private byte PFin;
     private BigDecimal ajusteP;

    public NomTransxEmpTmp() {
    }

    public NomTransxEmpTmp(NomTransxEmpTmpId id, BigDecimal qty, BigDecimal vrUnitario, String codAlmPre, String numPre, String numCuo, byte PIni, byte PFin, BigDecimal ajusteP) {
       this.id = id;
       this.qty = qty;
       this.vrUnitario = vrUnitario;
       this.codAlmPre = codAlmPre;
       this.numPre = numPre;
       this.numCuo = numCuo;
       this.PIni = PIni;
       this.PFin = PFin;
       this.ajusteP = ajusteP;
    }
   
    public NomTransxEmpTmpId getId() {
        return this.id;
    }
    
    public void setId(NomTransxEmpTmpId id) {
        this.id = id;
    }
    public BigDecimal getQty() {
        return this.qty;
    }
    
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }
    public BigDecimal getVrUnitario() {
        return this.vrUnitario;
    }
    
    public void setVrUnitario(BigDecimal vrUnitario) {
        this.vrUnitario = vrUnitario;
    }
    public String getCodAlmPre() {
        return this.codAlmPre;
    }
    
    public void setCodAlmPre(String codAlmPre) {
        this.codAlmPre = codAlmPre;
    }
    public String getNumPre() {
        return this.numPre;
    }
    
    public void setNumPre(String numPre) {
        this.numPre = numPre;
    }
    public String getNumCuo() {
        return this.numCuo;
    }
    
    public void setNumCuo(String numCuo) {
        this.numCuo = numCuo;
    }
    public byte getPIni() {
        return this.PIni;
    }
    
    public void setPIni(byte PIni) {
        this.PIni = PIni;
    }
    public byte getPFin() {
        return this.PFin;
    }
    
    public void setPFin(byte PFin) {
        this.PFin = PFin;
    }
    public BigDecimal getAjusteP() {
        return this.ajusteP;
    }
    
    public void setAjusteP(BigDecimal ajusteP) {
        this.ajusteP = ajusteP;
    }




}


