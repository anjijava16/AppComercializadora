package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * AlmSubLineas generated by hbm2java
 */
public class AlmSubLineas  implements java.io.Serializable {


     private AlmSubLineasId id;
     private String nomSub;
     private boolean modificado;

    public AlmSubLineas() {
    }

	
    public AlmSubLineas(AlmSubLineasId id, boolean modificado) {
        this.id = id;
        this.modificado = modificado;
    }
    public AlmSubLineas(AlmSubLineasId id, String nomSub, boolean modificado) {
       this.id = id;
       this.nomSub = nomSub;
       this.modificado = modificado;
    }
   
    public AlmSubLineasId getId() {
        return this.id;
    }
    
    public void setId(AlmSubLineasId id) {
        this.id = id;
    }
    public String getNomSub() {
        return this.nomSub;
    }
    
    public void setNomSub(String nomSub) {
        this.nomSub = nomSub;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }




}


