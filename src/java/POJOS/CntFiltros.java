package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * CntFiltros generated by hbm2java
 */
public class CntFiltros  implements java.io.Serializable {


     private String idProcess;
     private String filtro;

    public CntFiltros() {
    }

    public CntFiltros(String idProcess, String filtro) {
       this.idProcess = idProcess;
       this.filtro = filtro;
    }
   
    public String getIdProcess() {
        return this.idProcess;
    }
    
    public void setIdProcess(String idProcess) {
        this.idProcess = idProcess;
    }
    public String getFiltro() {
        return this.filtro;
    }
    
    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }




}


