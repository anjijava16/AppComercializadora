package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * VenCupos generated by hbm2java
 */
public class VenCupos  implements java.io.Serializable {


     private String cedula;
     private BigDecimal autorizado;
     private String infoPagare;

    public VenCupos() {
    }

    public VenCupos(String cedula, BigDecimal autorizado, String infoPagare) {
       this.cedula = cedula;
       this.autorizado = autorizado;
       this.infoPagare = infoPagare;
    }
   
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public BigDecimal getAutorizado() {
        return this.autorizado;
    }
    
    public void setAutorizado(BigDecimal autorizado) {
        this.autorizado = autorizado;
    }
    public String getInfoPagare() {
        return this.infoPagare;
    }
    
    public void setInfoPagare(String infoPagare) {
        this.infoPagare = infoPagare;
    }




}


