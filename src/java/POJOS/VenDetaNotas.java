package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * VenDetaNotas generated by hbm2java
 */
public class VenDetaNotas  implements java.io.Serializable {


     private VenDetaNotasId id;
     private BigDecimal valAbo;
     private BigDecimal valSaldo;
     private String codCon;
     private BigDecimal valNota;

    public VenDetaNotas() {
    }

    public VenDetaNotas(VenDetaNotasId id, BigDecimal valAbo, BigDecimal valSaldo, String codCon, BigDecimal valNota) {
       this.id = id;
       this.valAbo = valAbo;
       this.valSaldo = valSaldo;
       this.codCon = codCon;
       this.valNota = valNota;
    }
   
    public VenDetaNotasId getId() {
        return this.id;
    }
    
    public void setId(VenDetaNotasId id) {
        this.id = id;
    }
    public BigDecimal getValAbo() {
        return this.valAbo;
    }
    
    public void setValAbo(BigDecimal valAbo) {
        this.valAbo = valAbo;
    }
    public BigDecimal getValSaldo() {
        return this.valSaldo;
    }
    
    public void setValSaldo(BigDecimal valSaldo) {
        this.valSaldo = valSaldo;
    }
    public String getCodCon() {
        return this.codCon;
    }
    
    public void setCodCon(String codCon) {
        this.codCon = codCon;
    }
    public BigDecimal getValNota() {
        return this.valNota;
    }
    
    public void setValNota(BigDecimal valNota) {
        this.valNota = valNota;
    }




}

