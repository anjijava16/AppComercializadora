package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * VenListaPrecios generated by hbm2java
 */
public class VenListaPrecios  implements java.io.Serializable {


     private String codList;
     private String nomList;
     private String codalm;
     private boolean roundPv;
     private boolean modificarPv;
     private BigDecimal roundPvbase;
     private boolean modificado;
     private BigDecimal margening;
     private boolean activa;
     private String tipPre;
     private int orden;
     private boolean showLowerPrice;
     private boolean publica;
     private boolean controlCosto;

    public VenListaPrecios() {
    }

	
    public VenListaPrecios(String codList, boolean roundPv, boolean modificarPv, BigDecimal roundPvbase, boolean modificado, BigDecimal margening, boolean activa, String tipPre, int orden, boolean showLowerPrice, boolean publica, boolean controlCosto) {
        this.codList = codList;
        this.roundPv = roundPv;
        this.modificarPv = modificarPv;
        this.roundPvbase = roundPvbase;
        this.modificado = modificado;
        this.margening = margening;
        this.activa = activa;
        this.tipPre = tipPre;
        this.orden = orden;
        this.showLowerPrice = showLowerPrice;
        this.publica = publica;
        this.controlCosto = controlCosto;
    }
    public VenListaPrecios(String codList, String nomList, String codalm, boolean roundPv, boolean modificarPv, BigDecimal roundPvbase, boolean modificado, BigDecimal margening, boolean activa, String tipPre, int orden, boolean showLowerPrice, boolean publica, boolean controlCosto) {
       this.codList = codList;
       this.nomList = nomList;
       this.codalm = codalm;
       this.roundPv = roundPv;
       this.modificarPv = modificarPv;
       this.roundPvbase = roundPvbase;
       this.modificado = modificado;
       this.margening = margening;
       this.activa = activa;
       this.tipPre = tipPre;
       this.orden = orden;
       this.showLowerPrice = showLowerPrice;
       this.publica = publica;
       this.controlCosto = controlCosto;
    }
   
    public String getCodList() {
        return this.codList;
    }
    
    public void setCodList(String codList) {
        this.codList = codList;
    }
    public String getNomList() {
        return this.nomList;
    }
    
    public void setNomList(String nomList) {
        this.nomList = nomList;
    }
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public boolean isRoundPv() {
        return this.roundPv;
    }
    
    public void setRoundPv(boolean roundPv) {
        this.roundPv = roundPv;
    }
    public boolean isModificarPv() {
        return this.modificarPv;
    }
    
    public void setModificarPv(boolean modificarPv) {
        this.modificarPv = modificarPv;
    }
    public BigDecimal getRoundPvbase() {
        return this.roundPvbase;
    }
    
    public void setRoundPvbase(BigDecimal roundPvbase) {
        this.roundPvbase = roundPvbase;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    public BigDecimal getMargening() {
        return this.margening;
    }
    
    public void setMargening(BigDecimal margening) {
        this.margening = margening;
    }
    public boolean isActiva() {
        return this.activa;
    }
    
    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    public String getTipPre() {
        return this.tipPre;
    }
    
    public void setTipPre(String tipPre) {
        this.tipPre = tipPre;
    }
    public int getOrden() {
        return this.orden;
    }
    
    public void setOrden(int orden) {
        this.orden = orden;
    }
    public boolean isShowLowerPrice() {
        return this.showLowerPrice;
    }
    
    public void setShowLowerPrice(boolean showLowerPrice) {
        this.showLowerPrice = showLowerPrice;
    }
    public boolean isPublica() {
        return this.publica;
    }
    
    public void setPublica(boolean publica) {
        this.publica = publica;
    }
    public boolean isControlCosto() {
        return this.controlCosto;
    }
    
    public void setControlCosto(boolean controlCosto) {
        this.controlCosto = controlCosto;
    }




}


