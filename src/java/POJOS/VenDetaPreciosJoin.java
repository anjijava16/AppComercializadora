package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * VenDetaPreciosJoin generated by hbm2java
 */
public class VenDetaPreciosJoin  implements java.io.Serializable {


     private VenDetaPreciosJoinId id;
     private BigDecimal margenInc;

    public VenDetaPreciosJoin() {
    }

    public VenDetaPreciosJoin(VenDetaPreciosJoinId id, BigDecimal margenInc) {
       this.id = id;
       this.margenInc = margenInc;
    }
   
    public VenDetaPreciosJoinId getId() {
        return this.id;
    }
    
    public void setId(VenDetaPreciosJoinId id) {
        this.id = id;
    }
    public BigDecimal getMargenInc() {
        return this.margenInc;
    }
    
    public void setMargenInc(BigDecimal margenInc) {
        this.margenInc = margenInc;
    }




}


