package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * AlmDetaMultiProd generated by hbm2java
 */
public class AlmDetaMultiProd  implements java.io.Serializable {


     private AlmDetaMultiProdId id;
     private BigDecimal qty;

    public AlmDetaMultiProd() {
    }

    public AlmDetaMultiProd(AlmDetaMultiProdId id, BigDecimal qty) {
       this.id = id;
       this.qty = qty;
    }
   
    public AlmDetaMultiProdId getId() {
        return this.id;
    }
    
    public void setId(AlmDetaMultiProdId id) {
        this.id = id;
    }
    public BigDecimal getQty() {
        return this.qty;
    }
    
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }




}


