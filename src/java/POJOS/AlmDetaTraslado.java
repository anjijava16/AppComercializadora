package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * AlmDetaTraslado generated by hbm2java
 */
public class AlmDetaTraslado  implements java.io.Serializable {


     private AlmDetaTrasladoId id;
     private BigDecimal qtyEnviada;
     private BigDecimal qtyRecibida;
     private BigDecimal qtyDevuelta;
     private char tiptra;
     private BigDecimal costo;

    public AlmDetaTraslado() {
    }

    public AlmDetaTraslado(AlmDetaTrasladoId id, BigDecimal qtyEnviada, BigDecimal qtyRecibida, BigDecimal qtyDevuelta, char tiptra, BigDecimal costo) {
       this.id = id;
       this.qtyEnviada = qtyEnviada;
       this.qtyRecibida = qtyRecibida;
       this.qtyDevuelta = qtyDevuelta;
       this.tiptra = tiptra;
       this.costo = costo;
    }
   
    public AlmDetaTrasladoId getId() {
        return this.id;
    }
    
    public void setId(AlmDetaTrasladoId id) {
        this.id = id;
    }
    public BigDecimal getQtyEnviada() {
        return this.qtyEnviada;
    }
    
    public void setQtyEnviada(BigDecimal qtyEnviada) {
        this.qtyEnviada = qtyEnviada;
    }
    public BigDecimal getQtyRecibida() {
        return this.qtyRecibida;
    }
    
    public void setQtyRecibida(BigDecimal qtyRecibida) {
        this.qtyRecibida = qtyRecibida;
    }
    public BigDecimal getQtyDevuelta() {
        return this.qtyDevuelta;
    }
    
    public void setQtyDevuelta(BigDecimal qtyDevuelta) {
        this.qtyDevuelta = qtyDevuelta;
    }
    public char getTiptra() {
        return this.tiptra;
    }
    
    public void setTiptra(char tiptra) {
        this.tiptra = tiptra;
    }
    public BigDecimal getCosto() {
        return this.costo;
    }
    
    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }




}

