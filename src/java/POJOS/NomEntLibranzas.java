package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0



/**
 * NomEntLibranzas generated by hbm2java
 */
public class NomEntLibranzas  implements java.io.Serializable {


     private String codLib;
     private String codTer;
     private String codCue;

    public NomEntLibranzas() {
    }

    public NomEntLibranzas(String codLib, String codTer, String codCue) {
       this.codLib = codLib;
       this.codTer = codTer;
       this.codCue = codCue;
    }
   
    public String getCodLib() {
        return this.codLib;
    }
    
    public void setCodLib(String codLib) {
        this.codLib = codLib;
    }
    public String getCodTer() {
        return this.codTer;
    }
    
    public void setCodTer(String codTer) {
        this.codTer = codTer;
    }
    public String getCodCue() {
        return this.codCue;
    }
    
    public void setCodCue(String codCue) {
        this.codCue = codCue;
    }




}


