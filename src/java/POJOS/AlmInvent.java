package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * AlmInvent generated by hbm2java
 */
public class AlmInvent  implements java.io.Serializable {


     private AlmInventId id;
     private BigDecimal caninv;
     private BigDecimal valInv;
     private BigDecimal ucoIns;
     private BigDecimal minInv;
     private BigDecimal qtyped;

    public AlmInvent() {
    }

	
    public AlmInvent(AlmInventId id, BigDecimal minInv, BigDecimal qtyped) {
        this.id = id;
        this.minInv = minInv;
        this.qtyped = qtyped;
    }
    public AlmInvent(AlmInventId id, BigDecimal caninv, BigDecimal valInv, BigDecimal ucoIns, BigDecimal minInv, BigDecimal qtyped) {
       this.id = id;
       this.caninv = caninv;
       this.valInv = valInv;
       this.ucoIns = ucoIns;
       this.minInv = minInv;
       this.qtyped = qtyped;
    }
   
    public AlmInventId getId() {
        return this.id;
    }
    
    public void setId(AlmInventId id) {
        this.id = id;
    }
    public BigDecimal getCaninv() {
        return this.caninv;
    }
    
    public void setCaninv(BigDecimal caninv) {
        this.caninv = caninv;
    }
    public BigDecimal getValInv() {
        return this.valInv;
    }
    
    public void setValInv(BigDecimal valInv) {
        this.valInv = valInv;
    }
    public BigDecimal getUcoIns() {
        return this.ucoIns;
    }
    
    public void setUcoIns(BigDecimal ucoIns) {
        this.ucoIns = ucoIns;
    }
    public BigDecimal getMinInv() {
        return this.minInv;
    }
    
    public void setMinInv(BigDecimal minInv) {
        this.minInv = minInv;
    }
    public BigDecimal getQtyped() {
        return this.qtyped;
    }
    
    public void setQtyped(BigDecimal qtyped) {
        this.qtyped = qtyped;
    }




}


