package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * CxPMaeCompraId generated by hbm2java
 */
public class CxPMaeCompraId  implements java.io.Serializable {


     private String codalm;
     private String numcom;

    public CxPMaeCompraId() {
    }

    public CxPMaeCompraId(String codalm, String numcom) {
       this.codalm = codalm;
       this.numcom = numcom;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getNumcom() {
        return this.numcom;
    }
    
    public void setNumcom(String numcom) {
        this.numcom = numcom;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CxPMaeCompraId) ) return false;
		 CxPMaeCompraId castOther = ( CxPMaeCompraId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getNumcom()==castOther.getNumcom()) || ( this.getNumcom()!=null && castOther.getNumcom()!=null && this.getNumcom().equals(castOther.getNumcom()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getNumcom() == null ? 0 : this.getNumcom().hashCode() );
         return result;
   }   


}


