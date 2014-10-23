package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * VenResoluciones generated by hbm2java
 */
public class VenResoluciones  implements java.io.Serializable {


     private String codres;
     private String numres;
     private Date fecres;
     private String prefijo;
     private String rangoIni;
     private String rangoFin;
     private Integer numfact;
     private boolean modificado;
     private String nomres;
     private String codAlm;
     private int qtydiaswarning;
     private int qtyfactwarning;
     private boolean notificar;
     private int frecdias;
     private int frecfact;
     private Date fecven;
     private boolean resManual;
     private boolean activa;
     private String tipres;

    public VenResoluciones() {
    }

	
    public VenResoluciones(String codres, boolean modificado, String nomres, String codAlm, int qtydiaswarning, int qtyfactwarning, boolean notificar, int frecdias, int frecfact, Date fecven, boolean resManual, boolean activa, String tipres) {
        this.codres = codres;
        this.modificado = modificado;
        this.nomres = nomres;
        this.codAlm = codAlm;
        this.qtydiaswarning = qtydiaswarning;
        this.qtyfactwarning = qtyfactwarning;
        this.notificar = notificar;
        this.frecdias = frecdias;
        this.frecfact = frecfact;
        this.fecven = fecven;
        this.resManual = resManual;
        this.activa = activa;
        this.tipres = tipres;
    }
    public VenResoluciones(String codres, String numres, Date fecres, String prefijo, String rangoIni, String rangoFin, Integer numfact, boolean modificado, String nomres, String codAlm, int qtydiaswarning, int qtyfactwarning, boolean notificar, int frecdias, int frecfact, Date fecven, boolean resManual, boolean activa, String tipres) {
       this.codres = codres;
       this.numres = numres;
       this.fecres = fecres;
       this.prefijo = prefijo;
       this.rangoIni = rangoIni;
       this.rangoFin = rangoFin;
       this.numfact = numfact;
       this.modificado = modificado;
       this.nomres = nomres;
       this.codAlm = codAlm;
       this.qtydiaswarning = qtydiaswarning;
       this.qtyfactwarning = qtyfactwarning;
       this.notificar = notificar;
       this.frecdias = frecdias;
       this.frecfact = frecfact;
       this.fecven = fecven;
       this.resManual = resManual;
       this.activa = activa;
       this.tipres = tipres;
    }
   
    public String getCodres() {
        return this.codres;
    }
    
    public void setCodres(String codres) {
        this.codres = codres;
    }
    public String getNumres() {
        return this.numres;
    }
    
    public void setNumres(String numres) {
        this.numres = numres;
    }
    public Date getFecres() {
        return this.fecres;
    }
    
    public void setFecres(Date fecres) {
        this.fecres = fecres;
    }
    public String getPrefijo() {
        return this.prefijo;
    }
    
    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
    public String getRangoIni() {
        return this.rangoIni;
    }
    
    public void setRangoIni(String rangoIni) {
        this.rangoIni = rangoIni;
    }
    public String getRangoFin() {
        return this.rangoFin;
    }
    
    public void setRangoFin(String rangoFin) {
        this.rangoFin = rangoFin;
    }
    public Integer getNumfact() {
        return this.numfact;
    }
    
    public void setNumfact(Integer numfact) {
        this.numfact = numfact;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    public String getNomres() {
        return this.nomres;
    }
    
    public void setNomres(String nomres) {
        this.nomres = nomres;
    }
    public String getCodAlm() {
        return this.codAlm;
    }
    
    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }
    public int getQtydiaswarning() {
        return this.qtydiaswarning;
    }
    
    public void setQtydiaswarning(int qtydiaswarning) {
        this.qtydiaswarning = qtydiaswarning;
    }
    public int getQtyfactwarning() {
        return this.qtyfactwarning;
    }
    
    public void setQtyfactwarning(int qtyfactwarning) {
        this.qtyfactwarning = qtyfactwarning;
    }
    public boolean isNotificar() {
        return this.notificar;
    }
    
    public void setNotificar(boolean notificar) {
        this.notificar = notificar;
    }
    public int getFrecdias() {
        return this.frecdias;
    }
    
    public void setFrecdias(int frecdias) {
        this.frecdias = frecdias;
    }
    public int getFrecfact() {
        return this.frecfact;
    }
    
    public void setFrecfact(int frecfact) {
        this.frecfact = frecfact;
    }
    public Date getFecven() {
        return this.fecven;
    }
    
    public void setFecven(Date fecven) {
        this.fecven = fecven;
    }
    public boolean isResManual() {
        return this.resManual;
    }
    
    public void setResManual(boolean resManual) {
        this.resManual = resManual;
    }
    public boolean isActiva() {
        return this.activa;
    }
    
    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    public String getTipres() {
        return this.tipres;
    }
    
    public void setTipres(String tipres) {
        this.tipres = tipres;
    }




}


