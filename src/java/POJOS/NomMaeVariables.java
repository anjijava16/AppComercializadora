package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * NomMaeVariables generated by hbm2java
 */
public class NomMaeVariables  implements java.io.Serializable {


     private String codVar;
     private String keyVar;
     private String nomVar;
     private char tipVar;
     private String descrip;
     private int STipo;
     private int tipValPer;

    public NomMaeVariables() {
    }

    public NomMaeVariables(String codVar, String keyVar, String nomVar, char tipVar, String descrip, int STipo, int tipValPer) {
       this.codVar = codVar;
       this.keyVar = keyVar;
       this.nomVar = nomVar;
       this.tipVar = tipVar;
       this.descrip = descrip;
       this.STipo = STipo;
       this.tipValPer = tipValPer;
    }
   
    public String getCodVar() {
        return this.codVar;
    }
    
    public void setCodVar(String codVar) {
        this.codVar = codVar;
    }
    public String getKeyVar() {
        return this.keyVar;
    }
    
    public void setKeyVar(String keyVar) {
        this.keyVar = keyVar;
    }
    public String getNomVar() {
        return this.nomVar;
    }
    
    public void setNomVar(String nomVar) {
        this.nomVar = nomVar;
    }
    public char getTipVar() {
        return this.tipVar;
    }
    
    public void setTipVar(char tipVar) {
        this.tipVar = tipVar;
    }
    public String getDescrip() {
        return this.descrip;
    }
    
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    public int getSTipo() {
        return this.STipo;
    }
    
    public void setSTipo(int STipo) {
        this.STipo = STipo;
    }
    public int getTipValPer() {
        return this.tipValPer;
    }
    
    public void setTipValPer(int tipValPer) {
        this.tipValPer = tipValPer;
    }




}


