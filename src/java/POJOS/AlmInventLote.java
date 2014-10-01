package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * AlmInventLote generated by hbm2java
 */
public class AlmInventLote  implements java.io.Serializable {


     private AlmInventLoteId id;
     private BigDecimal canInvL;
     private BigDecimal valInvL;
     private Date fecVence;

    public AlmInventLote() {
    }

    public AlmInventLote(AlmInventLoteId id, BigDecimal canInvL, BigDecimal valInvL, Date fecVence) {
       this.id = id;
       this.canInvL = canInvL;
       this.valInvL = valInvL;
       this.fecVence = fecVence;
    }
   
    public AlmInventLoteId getId() {
        return this.id;
    }
    
    public void setId(AlmInventLoteId id) {
        this.id = id;
    }
    public BigDecimal getCanInvL() {
        return this.canInvL;
    }
    
    public void setCanInvL(BigDecimal canInvL) {
        this.canInvL = canInvL;
    }
    public BigDecimal getValInvL() {
        return this.valInvL;
    }
    
    public void setValInvL(BigDecimal valInvL) {
        this.valInvL = valInvL;
    }
    public Date getFecVence() {
        return this.fecVence;
    }
    
    public void setFecVence(Date fecVence) {
        this.fecVence = fecVence;
    }




}


