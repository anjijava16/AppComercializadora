package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * NomCtasxSeccion generated by hbm2java
 */
public class NomCtasxSeccion  implements java.io.Serializable {


     private NomCtasxSeccionId id;
     private String codCue;

    public NomCtasxSeccion() {
    }

    public NomCtasxSeccion(NomCtasxSeccionId id, String codCue) {
       this.id = id;
       this.codCue = codCue;
    }
   
    public NomCtasxSeccionId getId() {
        return this.id;
    }
    
    public void setId(NomCtasxSeccionId id) {
        this.id = id;
    }
    public String getCodCue() {
        return this.codCue;
    }
    
    public void setCodCue(String codCue) {
        this.codCue = codCue;
    }




}


