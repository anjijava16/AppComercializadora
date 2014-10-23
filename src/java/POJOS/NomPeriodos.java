package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * NomPeriodos generated by hbm2java
 */
public class NomPeriodos  implements java.io.Serializable {


     private NomPeriodosId id;
     private Date FCierre;
     private boolean liquidado;
     private boolean aportes;
     private boolean provisiones;
     private boolean removido;

    public NomPeriodos() {
    }

	
    public NomPeriodos(NomPeriodosId id, boolean liquidado, boolean aportes, boolean provisiones, boolean removido) {
        this.id = id;
        this.liquidado = liquidado;
        this.aportes = aportes;
        this.provisiones = provisiones;
        this.removido = removido;
    }
    public NomPeriodos(NomPeriodosId id, Date FCierre, boolean liquidado, boolean aportes, boolean provisiones, boolean removido) {
       this.id = id;
       this.FCierre = FCierre;
       this.liquidado = liquidado;
       this.aportes = aportes;
       this.provisiones = provisiones;
       this.removido = removido;
    }
   
    public NomPeriodosId getId() {
        return this.id;
    }
    
    public void setId(NomPeriodosId id) {
        this.id = id;
    }
    public Date getFCierre() {
        return this.FCierre;
    }
    
    public void setFCierre(Date FCierre) {
        this.FCierre = FCierre;
    }
    public boolean isLiquidado() {
        return this.liquidado;
    }
    
    public void setLiquidado(boolean liquidado) {
        this.liquidado = liquidado;
    }
    public boolean isAportes() {
        return this.aportes;
    }
    
    public void setAportes(boolean aportes) {
        this.aportes = aportes;
    }
    public boolean isProvisiones() {
        return this.provisiones;
    }
    
    public void setProvisiones(boolean provisiones) {
        this.provisiones = provisiones;
    }
    public boolean isRemovido() {
        return this.removido;
    }
    
    public void setRemovido(boolean removido) {
        this.removido = removido;
    }




}


