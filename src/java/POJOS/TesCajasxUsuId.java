package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * TesCajasxUsuId generated by hbm2java
 */
public class TesCajasxUsuId  implements java.io.Serializable {


     private String codcaja;
     private String codusu;

    public TesCajasxUsuId() {
    }

    public TesCajasxUsuId(String codcaja, String codusu) {
       this.codcaja = codcaja;
       this.codusu = codusu;
    }
   
    public String getCodcaja() {
        return this.codcaja;
    }
    
    public void setCodcaja(String codcaja) {
        this.codcaja = codcaja;
    }
    public String getCodusu() {
        return this.codusu;
    }
    
    public void setCodusu(String codusu) {
        this.codusu = codusu;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TesCajasxUsuId) ) return false;
		 TesCajasxUsuId castOther = ( TesCajasxUsuId ) other; 
         
		 return ( (this.getCodcaja()==castOther.getCodcaja()) || ( this.getCodcaja()!=null && castOther.getCodcaja()!=null && this.getCodcaja().equals(castOther.getCodcaja()) ) )
 && ( (this.getCodusu()==castOther.getCodusu()) || ( this.getCodusu()!=null && castOther.getCodusu()!=null && this.getCodusu().equals(castOther.getCodusu()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodcaja() == null ? 0 : this.getCodcaja().hashCode() );
         result = 37 * result + ( getCodusu() == null ? 0 : this.getCodusu().hashCode() );
         return result;
   }   


}


