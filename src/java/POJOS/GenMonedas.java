package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * GenMonedas generated by hbm2java
 */
public class GenMonedas  implements java.io.Serializable {


     private String codmon;
     private String nommon;
     private String abrevia;

    public GenMonedas() {
    }

    public GenMonedas(String codmon, String nommon, String abrevia) {
       this.codmon = codmon;
       this.nommon = nommon;
       this.abrevia = abrevia;
    }
   
    public String getCodmon() {
        return this.codmon;
    }
    
    public void setCodmon(String codmon) {
        this.codmon = codmon;
    }
    public String getNommon() {
        return this.nommon;
    }
    
    public void setNommon(String nommon) {
        this.nommon = nommon;
    }
    public String getAbrevia() {
        return this.abrevia;
    }
    
    public void setAbrevia(String abrevia) {
        this.abrevia = abrevia;
    }




}


