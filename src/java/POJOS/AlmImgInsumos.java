package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * AlmImgInsumos generated by hbm2java
 */
public class AlmImgInsumos  implements java.io.Serializable {


     private String codins;
     private String grafico;
     private byte[] graficos;

    public AlmImgInsumos() {
    }

	
    public AlmImgInsumos(String codins) {
        this.codins = codins;
    }
    public AlmImgInsumos(String codins, String grafico, byte[] graficos) {
       this.codins = codins;
       this.grafico = grafico;
       this.graficos = graficos;
    }
   
    public String getCodins() {
        return this.codins;
    }
    
    public void setCodins(String codins) {
        this.codins = codins;
    }
    public String getGrafico() {
        return this.grafico;
    }
    
    public void setGrafico(String grafico) {
        this.grafico = grafico;
    }
    public byte[] getGraficos() {
        return this.graficos;
    }
    
    public void setGraficos(byte[] graficos) {
        this.graficos = graficos;
    }




}


