package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * AlmDetaTomaInv generated by hbm2java
 */
public class AlmDetaTomaInv  implements java.io.Serializable {


     private AlmDetaTomaInvId id;
     private BigDecimal fisico;
     private BigDecimal canInv;
     private BigDecimal valInv;

    public AlmDetaTomaInv() {
    }

    public AlmDetaTomaInv(AlmDetaTomaInvId id, BigDecimal fisico, BigDecimal canInv, BigDecimal valInv) {
       this.id = id;
       this.fisico = fisico;
       this.canInv = canInv;
       this.valInv = valInv;
    }
   
    public AlmDetaTomaInvId getId() {
        return this.id;
    }
    
    public void setId(AlmDetaTomaInvId id) {
        this.id = id;
    }
    public BigDecimal getFisico() {
        return this.fisico;
    }
    
    public void setFisico(BigDecimal fisico) {
        this.fisico = fisico;
    }
    public BigDecimal getCanInv() {
        return this.canInv;
    }
    
    public void setCanInv(BigDecimal canInv) {
        this.canInv = canInv;
    }
    public BigDecimal getValInv() {
        return this.valInv;
    }
    
    public void setValInv(BigDecimal valInv) {
        this.valInv = valInv;
    }




}


