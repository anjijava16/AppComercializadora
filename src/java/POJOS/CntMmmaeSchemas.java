package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * CntMmmaeSchemas generated by hbm2java
 */
public class CntMmmaeSchemas  implements java.io.Serializable {


     private String codSchema;
     private String codFor;
     private String nomSchema;
     private String filtro;

    public CntMmmaeSchemas() {
    }

    public CntMmmaeSchemas(String codSchema, String codFor, String nomSchema, String filtro) {
       this.codSchema = codSchema;
       this.codFor = codFor;
       this.nomSchema = nomSchema;
       this.filtro = filtro;
    }
   
    public String getCodSchema() {
        return this.codSchema;
    }
    
    public void setCodSchema(String codSchema) {
        this.codSchema = codSchema;
    }
    public String getCodFor() {
        return this.codFor;
    }
    
    public void setCodFor(String codFor) {
        this.codFor = codFor;
    }
    public String getNomSchema() {
        return this.nomSchema;
    }
    
    public void setNomSchema(String nomSchema) {
        this.nomSchema = nomSchema;
    }
    public String getFiltro() {
        return this.filtro;
    }
    
    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }




}


