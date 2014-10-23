package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * CntTriRengId generated by hbm2java
 */
public class CntTriRengId  implements java.io.Serializable {


     private String clase;
     private String codGru;
     private String codReng;

    public CntTriRengId() {
    }

    public CntTriRengId(String clase, String codGru, String codReng) {
       this.clase = clase;
       this.codGru = codGru;
       this.codReng = codReng;
    }
   
    public String getClase() {
        return this.clase;
    }
    
    public void setClase(String clase) {
        this.clase = clase;
    }
    public String getCodGru() {
        return this.codGru;
    }
    
    public void setCodGru(String codGru) {
        this.codGru = codGru;
    }
    public String getCodReng() {
        return this.codReng;
    }
    
    public void setCodReng(String codReng) {
        this.codReng = codReng;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CntTriRengId) ) return false;
		 CntTriRengId castOther = ( CntTriRengId ) other; 
         
		 return ( (this.getClase()==castOther.getClase()) || ( this.getClase()!=null && castOther.getClase()!=null && this.getClase().equals(castOther.getClase()) ) )
 && ( (this.getCodGru()==castOther.getCodGru()) || ( this.getCodGru()!=null && castOther.getCodGru()!=null && this.getCodGru().equals(castOther.getCodGru()) ) )
 && ( (this.getCodReng()==castOther.getCodReng()) || ( this.getCodReng()!=null && castOther.getCodReng()!=null && this.getCodReng().equals(castOther.getCodReng()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getClase() == null ? 0 : this.getClase().hashCode() );
         result = 37 * result + ( getCodGru() == null ? 0 : this.getCodGru().hashCode() );
         result = 37 * result + ( getCodReng() == null ? 0 : this.getCodReng().hashCode() );
         return result;
   }   


}


