package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * CntCenCostos generated by hbm2java
 */
public class CntCenCostos  implements java.io.Serializable {


     private String codCen;
     private String nomCen;
     private boolean modificado;

    public CntCenCostos() {
    }

    public CntCenCostos(String codCen, String nomCen, boolean modificado) {
       this.codCen = codCen;
       this.nomCen = nomCen;
       this.modificado = modificado;
    }
   
    public String getCodCen() {
        return this.codCen;
    }
    
    public void setCodCen(String codCen) {
        this.codCen = codCen;
    }
    public String getNomCen() {
        return this.nomCen;
    }
    
    public void setNomCen(String nomCen) {
        this.nomCen = nomCen;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }




}


