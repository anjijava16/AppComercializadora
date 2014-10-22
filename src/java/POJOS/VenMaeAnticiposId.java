package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0



/**
 * VenMaeAnticiposId generated by hbm2java
 */
public class VenMaeAnticiposId  implements java.io.Serializable {


     private String codalm;
     private String codter;

    public VenMaeAnticiposId() {
    }

    public VenMaeAnticiposId(String codalm, String codter) {
       this.codalm = codalm;
       this.codter = codter;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getCodter() {
        return this.codter;
    }
    
    public void setCodter(String codter) {
        this.codter = codter;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VenMaeAnticiposId) ) return false;
		 VenMaeAnticiposId castOther = ( VenMaeAnticiposId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getCodter()==castOther.getCodter()) || ( this.getCodter()!=null && castOther.getCodter()!=null && this.getCodter().equals(castOther.getCodter()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getCodter() == null ? 0 : this.getCodter().hashCode() );
         return result;
   }   


}


