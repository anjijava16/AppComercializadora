package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * CntMmmaeConceptos generated by hbm2java
 */
public class CntMmmaeConceptos  implements java.io.Serializable {


     private CntMmmaeConceptosId id;
     private String nomCon;
     private String forCodFue;

    public CntMmmaeConceptos() {
    }

    public CntMmmaeConceptos(CntMmmaeConceptosId id, String nomCon, String forCodFue) {
       this.id = id;
       this.nomCon = nomCon;
       this.forCodFue = forCodFue;
    }
   
    public CntMmmaeConceptosId getId() {
        return this.id;
    }
    
    public void setId(CntMmmaeConceptosId id) {
        this.id = id;
    }
    public String getNomCon() {
        return this.nomCon;
    }
    
    public void setNomCon(String nomCon) {
        this.nomCon = nomCon;
    }
    public String getForCodFue() {
        return this.forCodFue;
    }
    
    public void setForCodFue(String forCodFue) {
        this.forCodFue = forCodFue;
    }




}


