package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * AlmInsUnidades generated by hbm2java
 */
public class AlmInsUnidades  implements java.io.Serializable {


     private String undins;
     private String nomuni;
     private boolean modificado;
     private int codreg;

    public AlmInsUnidades() {
    }

    public AlmInsUnidades(String undins, String nomuni, boolean modificado, int codreg) {
       this.undins = undins;
       this.nomuni = nomuni;
       this.modificado = modificado;
       this.codreg = codreg;
    }
   
    public String getUndins() {
        return this.undins;
    }
    
    public void setUndins(String undins) {
        this.undins = undins;
    }
    public String getNomuni() {
        return this.nomuni;
    }
    
    public void setNomuni(String nomuni) {
        this.nomuni = nomuni;
    }
    public boolean isModificado() {
        return this.modificado;
    }
    
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }
    public int getCodreg() {
        return this.codreg;
    }
    
    public void setCodreg(int codreg) {
        this.codreg = codreg;
    }




}


