package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * CntPuc generated by hbm2java
 */
public class CntPuc  implements java.io.Serializable {


     private String codcue;
     private String nomCue;
     private char natCue;
     private boolean modificado;

    public CntPuc() {
    }

    public CntPuc(String codcue, String nomCue, char natCue, boolean modificado) {
       this.codcue = codcue;
       this.nomCue = nomCue;
       this.natCue = natCue;
       this.modificado = modificado;
    }
   
    public String getCodcue() {
        return this.codcue;
    }
    
    public void setCodcue(String codcue) {
        this.codcue = codcue;
    }
    public String getNomCue() {
        return this.nomCue;
    }
    
    public void setNomCue(String nomCue) {
        this.nomCue = nomCue;
    }
    public char getNatCue() {
        return this.natCue;
    }
    
    public void setNatCue(char natCue) {
        this.natCue = natCue;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }




}


