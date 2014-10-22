package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * AlmDetaPedidoVentaRm generated by hbm2java
 */
public class AlmDetaPedidoVentaRm  implements java.io.Serializable {


     private AlmDetaPedidoVentaRmId id;
     private BigDecimal qtyRem;
     private String numFac;
     private String tipfac;
     private String codRes;
     private String estado;

    public AlmDetaPedidoVentaRm() {
    }

    public AlmDetaPedidoVentaRm(AlmDetaPedidoVentaRmId id, BigDecimal qtyRem, String numFac, String tipfac, String codRes, String estado) {
       this.id = id;
       this.qtyRem = qtyRem;
       this.numFac = numFac;
       this.tipfac = tipfac;
       this.codRes = codRes;
       this.estado = estado;
    }
   
    public AlmDetaPedidoVentaRmId getId() {
        return this.id;
    }
    
    public void setId(AlmDetaPedidoVentaRmId id) {
        this.id = id;
    }
    public BigDecimal getQtyRem() {
        return this.qtyRem;
    }
    
    public void setQtyRem(BigDecimal qtyRem) {
        this.qtyRem = qtyRem;
    }
    public String getNumFac() {
        return this.numFac;
    }
    
    public void setNumFac(String numFac) {
        this.numFac = numFac;
    }
    public String getTipfac() {
        return this.tipfac;
    }
    
    public void setTipfac(String tipfac) {
        this.tipfac = tipfac;
    }
    public String getCodRes() {
        return this.codRes;
    }
    
    public void setCodRes(String codRes) {
        this.codRes = codRes;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


