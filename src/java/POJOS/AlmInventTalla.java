package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * AlmInventTalla generated by hbm2java
 */
public class AlmInventTalla  implements java.io.Serializable {


     private AlmInventTallaId id;
     private BigDecimal canInvT;
     private BigDecimal valInvT;

    public AlmInventTalla() {
    }

    public AlmInventTalla(AlmInventTallaId id, BigDecimal canInvT, BigDecimal valInvT) {
       this.id = id;
       this.canInvT = canInvT;
       this.valInvT = valInvT;
    }
   
    public AlmInventTallaId getId() {
        return this.id;
    }
    
    public void setId(AlmInventTallaId id) {
        this.id = id;
    }
    public BigDecimal getCanInvT() {
        return this.canInvT;
    }
    
    public void setCanInvT(BigDecimal canInvT) {
        this.canInvT = canInvT;
    }
    public BigDecimal getValInvT() {
        return this.valInvT;
    }
    
    public void setValInvT(BigDecimal valInvT) {
        this.valInvT = valInvT;
    }




}

