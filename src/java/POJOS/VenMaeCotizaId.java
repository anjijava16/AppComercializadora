package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * VenMaeCotizaId generated by hbm2java
 */
public class VenMaeCotizaId  implements java.io.Serializable {


     private String codalm;
     private String numcot;

    public VenMaeCotizaId() {
    }

    public VenMaeCotizaId(String codalm, String numcot) {
       this.codalm = codalm;
       this.numcot = numcot;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getNumcot() {
        return this.numcot;
    }
    
    public void setNumcot(String numcot) {
        this.numcot = numcot;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VenMaeCotizaId) ) return false;
		 VenMaeCotizaId castOther = ( VenMaeCotizaId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getNumcot()==castOther.getNumcot()) || ( this.getNumcot()!=null && castOther.getNumcot()!=null && this.getNumcot().equals(castOther.getNumcot()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getNumcot() == null ? 0 : this.getNumcot().hashCode() );
         return result;
   }   


}


