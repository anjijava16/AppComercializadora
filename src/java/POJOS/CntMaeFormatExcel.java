package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * CntMaeFormatExcel generated by hbm2java
 */
public class CntMaeFormatExcel  implements java.io.Serializable {


     private String codMod;
     private String nomMod;
     private String tipMod;
     private String filename;
     private String filesource;

    public CntMaeFormatExcel() {
    }

    public CntMaeFormatExcel(String codMod, String nomMod, String tipMod, String filename, String filesource) {
       this.codMod = codMod;
       this.nomMod = nomMod;
       this.tipMod = tipMod;
       this.filename = filename;
       this.filesource = filesource;
    }
   
    public String getCodMod() {
        return this.codMod;
    }
    
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    public String getNomMod() {
        return this.nomMod;
    }
    
    public void setNomMod(String nomMod) {
        this.nomMod = nomMod;
    }
    public String getTipMod() {
        return this.tipMod;
    }
    
    public void setTipMod(String tipMod) {
        this.tipMod = tipMod;
    }
    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getFilesource() {
        return this.filesource;
    }
    
    public void setFilesource(String filesource) {
        this.filesource = filesource;
    }




}


