package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * TesControlTurno generated by hbm2java
 */
public class TesControlTurno  implements java.io.Serializable {


     private TesControlTurnoId id;
     private String codCaja;
     private String codven;
     private Date fecApert;
     private BigDecimal saldoApert;
     private String observaApert;
     private Date fecCierre;
     private BigDecimal saldoCierre;
     private String observaCierre;
     private Date fecsys;
     private String codusu;
     private char estado;
     private boolean cuadrado;

    public TesControlTurno() {
    }

	
    public TesControlTurno(TesControlTurnoId id, String codCaja, String codven, BigDecimal saldoApert, String observaApert, BigDecimal saldoCierre, String observaCierre, Date fecsys, String codusu, char estado, boolean cuadrado) {
        this.id = id;
        this.codCaja = codCaja;
        this.codven = codven;
        this.saldoApert = saldoApert;
        this.observaApert = observaApert;
        this.saldoCierre = saldoCierre;
        this.observaCierre = observaCierre;
        this.fecsys = fecsys;
        this.codusu = codusu;
        this.estado = estado;
        this.cuadrado = cuadrado;
    }
    public TesControlTurno(TesControlTurnoId id, String codCaja, String codven, Date fecApert, BigDecimal saldoApert, String observaApert, Date fecCierre, BigDecimal saldoCierre, String observaCierre, Date fecsys, String codusu, char estado, boolean cuadrado) {
       this.id = id;
       this.codCaja = codCaja;
       this.codven = codven;
       this.fecApert = fecApert;
       this.saldoApert = saldoApert;
       this.observaApert = observaApert;
       this.fecCierre = fecCierre;
       this.saldoCierre = saldoCierre;
       this.observaCierre = observaCierre;
       this.fecsys = fecsys;
       this.codusu = codusu;
       this.estado = estado;
       this.cuadrado = cuadrado;
    }
   
    public TesControlTurnoId getId() {
        return this.id;
    }
    
    public void setId(TesControlTurnoId id) {
        this.id = id;
    }
    public String getCodCaja() {
        return this.codCaja;
    }
    
    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }
    public String getCodven() {
        return this.codven;
    }
    
    public void setCodven(String codven) {
        this.codven = codven;
    }
    public Date getFecApert() {
        return this.fecApert;
    }
    
    public void setFecApert(Date fecApert) {
        this.fecApert = fecApert;
    }
    public BigDecimal getSaldoApert() {
        return this.saldoApert;
    }
    
    public void setSaldoApert(BigDecimal saldoApert) {
        this.saldoApert = saldoApert;
    }
    public String getObservaApert() {
        return this.observaApert;
    }
    
    public void setObservaApert(String observaApert) {
        this.observaApert = observaApert;
    }
    public Date getFecCierre() {
        return this.fecCierre;
    }
    
    public void setFecCierre(Date fecCierre) {
        this.fecCierre = fecCierre;
    }
    public BigDecimal getSaldoCierre() {
        return this.saldoCierre;
    }
    
    public void setSaldoCierre(BigDecimal saldoCierre) {
        this.saldoCierre = saldoCierre;
    }
    public String getObservaCierre() {
        return this.observaCierre;
    }
    
    public void setObservaCierre(String observaCierre) {
        this.observaCierre = observaCierre;
    }
    public Date getFecsys() {
        return this.fecsys;
    }
    
    public void setFecsys(Date fecsys) {
        this.fecsys = fecsys;
    }
    public String getCodusu() {
        return this.codusu;
    }
    
    public void setCodusu(String codusu) {
        this.codusu = codusu;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public boolean isCuadrado() {
        return this.cuadrado;
    }
    
    public void setCuadrado(boolean cuadrado) {
        this.cuadrado = cuadrado;
    }




}


