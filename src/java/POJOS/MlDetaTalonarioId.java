package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * MlDetaTalonarioId generated by hbm2java
 */
public class MlDetaTalonarioId  implements java.io.Serializable {


     private String codTal;
     private String numRecF;

    public MlDetaTalonarioId() {
    }

    public MlDetaTalonarioId(String codTal, String numRecF) {
       this.codTal = codTal;
       this.numRecF = numRecF;
    }
   
    public String getCodTal() {
        return this.codTal;
    }
    
    public void setCodTal(String codTal) {
        this.codTal = codTal;
    }
    public String getNumRecF() {
        return this.numRecF;
    }
    
    public void setNumRecF(String numRecF) {
        this.numRecF = numRecF;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MlDetaTalonarioId) ) return false;
		 MlDetaTalonarioId castOther = ( MlDetaTalonarioId ) other; 
         
		 return ( (this.getCodTal()==castOther.getCodTal()) || ( this.getCodTal()!=null && castOther.getCodTal()!=null && this.getCodTal().equals(castOther.getCodTal()) ) )
 && ( (this.getNumRecF()==castOther.getNumRecF()) || ( this.getNumRecF()!=null && castOther.getNumRecF()!=null && this.getNumRecF().equals(castOther.getNumRecF()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodTal() == null ? 0 : this.getCodTal().hashCode() );
         result = 37 * result + ( getNumRecF() == null ? 0 : this.getNumRecF().hashCode() );
         return result;
   }   


}


