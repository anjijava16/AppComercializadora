package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * CntTriReng generated by hbm2java
 */
public class CntTriReng  implements java.io.Serializable {


     private CntTriRengId id;
     private String nomReng;
     private int tipoCalc;
     private String formula;

    public CntTriReng() {
    }

    public CntTriReng(CntTriRengId id, String nomReng, int tipoCalc, String formula) {
       this.id = id;
       this.nomReng = nomReng;
       this.tipoCalc = tipoCalc;
       this.formula = formula;
    }
   
    public CntTriRengId getId() {
        return this.id;
    }
    
    public void setId(CntTriRengId id) {
        this.id = id;
    }
    public String getNomReng() {
        return this.nomReng;
    }
    
    public void setNomReng(String nomReng) {
        this.nomReng = nomReng;
    }
    public int getTipoCalc() {
        return this.tipoCalc;
    }
    
    public void setTipoCalc(int tipoCalc) {
        this.tipoCalc = tipoCalc;
    }
    public String getFormula() {
        return this.formula;
    }
    
    public void setFormula(String formula) {
        this.formula = formula;
    }




}


