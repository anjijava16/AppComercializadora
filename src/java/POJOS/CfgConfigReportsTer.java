package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * CfgConfigReportsTer generated by hbm2java
 */
public class CfgConfigReportsTer  implements java.io.Serializable {


     private CfgConfigReportsTerId id;
     private String reportname;
     private boolean modificado;

    public CfgConfigReportsTer() {
    }

    public CfgConfigReportsTer(CfgConfigReportsTerId id, String reportname, boolean modificado) {
       this.id = id;
       this.reportname = reportname;
       this.modificado = modificado;
    }
   
    public CfgConfigReportsTerId getId() {
        return this.id;
    }
    
    public void setId(CfgConfigReportsTerId id) {
        this.id = id;
    }
    public String getReportname() {
        return this.reportname;
    }
    
    public void setReportname(String reportname) {
        this.reportname = reportname;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }




}


