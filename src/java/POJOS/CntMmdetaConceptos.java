package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * CntMmdetaConceptos generated by hbm2java
 */
public class CntMmdetaConceptos  implements java.io.Serializable {


     private CntMmdetaConceptosId id;
     private char natSum;

    public CntMmdetaConceptos() {
    }

    public CntMmdetaConceptos(CntMmdetaConceptosId id, char natSum) {
       this.id = id;
       this.natSum = natSum;
    }
   
    public CntMmdetaConceptosId getId() {
        return this.id;
    }
    
    public void setId(CntMmdetaConceptosId id) {
        this.id = id;
    }
    public char getNatSum() {
        return this.natSum;
    }
    
    public void setNatSum(char natSum) {
        this.natSum = natSum;
    }




}


