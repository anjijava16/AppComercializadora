package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * AlmLineasId generated by hbm2java
 */
public class AlmLineasId  implements java.io.Serializable {


     private String codlinea;
     private char clase;

    public AlmLineasId() {
    }

    public AlmLineasId(String codlinea, char clase) {
       this.codlinea = codlinea;
       this.clase = clase;
    }
   
    public String getCodlinea() {
        return this.codlinea;
    }
    
    public void setCodlinea(String codlinea) {
        this.codlinea = codlinea;
    }
    public char getClase() {
        return this.clase;
    }
    
    public void setClase(char clase) {
        this.clase = clase;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AlmLineasId) ) return false;
		 AlmLineasId castOther = ( AlmLineasId ) other; 
         
		 return ( (this.getCodlinea()==castOther.getCodlinea()) || ( this.getCodlinea()!=null && castOther.getCodlinea()!=null && this.getCodlinea().equals(castOther.getCodlinea()) ) )
 && (this.getClase()==castOther.getClase());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodlinea() == null ? 0 : this.getCodlinea().hashCode() );
         result = 37 * result + this.getClase();
         return result;
   }   


}


