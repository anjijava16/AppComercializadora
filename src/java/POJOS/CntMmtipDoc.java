package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0



/**
 * CntMmtipDoc generated by hbm2java
 */
public class CntMmtipDoc  implements java.io.Serializable {


     private String codDoc;
     private String nomDoc;
     private boolean dv;
     private int minLength;

    public CntMmtipDoc() {
    }

    public CntMmtipDoc(String codDoc, String nomDoc, boolean dv, int minLength) {
       this.codDoc = codDoc;
       this.nomDoc = nomDoc;
       this.dv = dv;
       this.minLength = minLength;
    }
   
    public String getCodDoc() {
        return this.codDoc;
    }
    
    public void setCodDoc(String codDoc) {
        this.codDoc = codDoc;
    }
    public String getNomDoc() {
        return this.nomDoc;
    }
    
    public void setNomDoc(String nomDoc) {
        this.nomDoc = nomDoc;
    }
    public boolean isDv() {
        return this.dv;
    }
    
    public void setDv(boolean dv) {
        this.dv = dv;
    }
    public int getMinLength() {
        return this.minLength;
    }
    
    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }




}


