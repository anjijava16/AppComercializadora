package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * AlmDetaInsumos generated by hbm2java
 */
public class AlmDetaInsumos  implements java.io.Serializable {


     private AlmDetaInsumosId id;
     private BigDecimal qty;

    public AlmDetaInsumos() {
    }

    public AlmDetaInsumos(AlmDetaInsumosId id, BigDecimal qty) {
       this.id = id;
       this.qty = qty;
    }
   
    public AlmDetaInsumosId getId() {
        return this.id;
    }
    
    public void setId(AlmDetaInsumosId id) {
        this.id = id;
    }
    public BigDecimal getQty() {
        return this.qty;
    }
    
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }




}


