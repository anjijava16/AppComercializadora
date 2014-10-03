package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * VenBasesRet generated by hbm2java
 */
public class VenBasesRet  implements java.io.Serializable {


     private VenBasesRetId id;
     private String nomCon;
     private BigDecimal base;
     private BigDecimal margen;
     private boolean aplicaS;
     private boolean aplicaC;
     private boolean aplicaG;
     private char aplicacion;
     private String grupo;
     private String codcue;
     private String ctaCompras;
     private boolean modificado;
     private String codCueAutoRet;

    public VenBasesRet() {
    }

    public VenBasesRet(VenBasesRetId id, String nomCon, BigDecimal base, BigDecimal margen, boolean aplicaS, boolean aplicaC, boolean aplicaG, char aplicacion, String grupo, String codcue, String ctaCompras, boolean modificado, String codCueAutoRet) {
       this.id = id;
       this.nomCon = nomCon;
       this.base = base;
       this.margen = margen;
       this.aplicaS = aplicaS;
       this.aplicaC = aplicaC;
       this.aplicaG = aplicaG;
       this.aplicacion = aplicacion;
       this.grupo = grupo;
       this.codcue = codcue;
       this.ctaCompras = ctaCompras;
       this.modificado = modificado;
       this.codCueAutoRet = codCueAutoRet;
    }
   
    public VenBasesRetId getId() {
        return this.id;
    }
    
    public void setId(VenBasesRetId id) {
        this.id = id;
    }
    public String getNomCon() {
        return this.nomCon;
    }
    
    public void setNomCon(String nomCon) {
        this.nomCon = nomCon;
    }
    public BigDecimal getBase() {
        return this.base;
    }
    
    public void setBase(BigDecimal base) {
        this.base = base;
    }
    public BigDecimal getMargen() {
        return this.margen;
    }
    
    public void setMargen(BigDecimal margen) {
        this.margen = margen;
    }
    public boolean isAplicaS() {
        return this.aplicaS;
    }
    
    public void setAplicaS(boolean aplicaS) {
        this.aplicaS = aplicaS;
    }
    public boolean isAplicaC() {
        return this.aplicaC;
    }
    
    public void setAplicaC(boolean aplicaC) {
        this.aplicaC = aplicaC;
    }
    public boolean isAplicaG() {
        return this.aplicaG;
    }
    
    public void setAplicaG(boolean aplicaG) {
        this.aplicaG = aplicaG;
    }
    public char getAplicacion() {
        return this.aplicacion;
    }
    
    public void setAplicacion(char aplicacion) {
        this.aplicacion = aplicacion;
    }
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public String getCodcue() {
        return this.codcue;
    }
    
    public void setCodcue(String codcue) {
        this.codcue = codcue;
    }
    public String getCtaCompras() {
        return this.ctaCompras;
    }
    
    public void setCtaCompras(String ctaCompras) {
        this.ctaCompras = ctaCompras;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    public String getCodCueAutoRet() {
        return this.codCueAutoRet;
    }
    
    public void setCodCueAutoRet(String codCueAutoRet) {
        this.codCueAutoRet = codCueAutoRet;
    }




}

