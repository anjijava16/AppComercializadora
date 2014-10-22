package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0


import java.io.Serializable;

/**
 * GenConsecSId generated by hbm2java
 */
public class GenConsecSId  implements java.io.Serializable {


     private String codalm;
     private Serializable codcon;

    public GenConsecSId() {
    }

    public GenConsecSId(String codalm, Serializable codcon) {
       this.codalm = codalm;
       this.codcon = codcon;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public Serializable getCodcon() {
        return this.codcon;
    }
    
    public void setCodcon(Serializable codcon) {
        this.codcon = codcon;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GenConsecSId) ) return false;
		 GenConsecSId castOther = ( GenConsecSId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getCodcon()==castOther.getCodcon()) || ( this.getCodcon()!=null && castOther.getCodcon()!=null && this.getCodcon().equals(castOther.getCodcon()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getCodcon() == null ? 0 : this.getCodcon().hashCode() );
         return result;
   }   


}


