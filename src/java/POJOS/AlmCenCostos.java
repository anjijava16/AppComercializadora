package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * AlmCenCostos generated by hbm2java
 */
public class AlmCenCostos  implements java.io.Serializable {


     private String codCos;
     private String nomCos;

    public AlmCenCostos() {
    }

    public AlmCenCostos(String codCos, String nomCos) {
       this.codCos = codCos;
       this.nomCos = nomCos;
    }
   
    public String getCodCos() {
        return this.codCos;
    }
    
    public void setCodCos(String codCos) {
        this.codCos = codCos;
    }
    public String getNomCos() {
        return this.nomCos;
    }
    
    public void setNomCos(String nomCos) {
        this.nomCos = nomCos;
    }




}


