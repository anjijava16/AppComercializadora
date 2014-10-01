package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * VenMaeNotasId generated by hbm2java
 */
public class VenMaeNotasId  implements java.io.Serializable {


     private String codalm;
     private String numNota;
     private String tipNota;
     private String codSec;

    public VenMaeNotasId() {
    }

    public VenMaeNotasId(String codalm, String numNota, String tipNota, String codSec) {
       this.codalm = codalm;
       this.numNota = numNota;
       this.tipNota = tipNota;
       this.codSec = codSec;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getNumNota() {
        return this.numNota;
    }
    
    public void setNumNota(String numNota) {
        this.numNota = numNota;
    }
    public String getTipNota() {
        return this.tipNota;
    }
    
    public void setTipNota(String tipNota) {
        this.tipNota = tipNota;
    }
    public String getCodSec() {
        return this.codSec;
    }
    
    public void setCodSec(String codSec) {
        this.codSec = codSec;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VenMaeNotasId) ) return false;
		 VenMaeNotasId castOther = ( VenMaeNotasId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getNumNota()==castOther.getNumNota()) || ( this.getNumNota()!=null && castOther.getNumNota()!=null && this.getNumNota().equals(castOther.getNumNota()) ) )
 && ( (this.getTipNota()==castOther.getTipNota()) || ( this.getTipNota()!=null && castOther.getTipNota()!=null && this.getTipNota().equals(castOther.getTipNota()) ) )
 && ( (this.getCodSec()==castOther.getCodSec()) || ( this.getCodSec()!=null && castOther.getCodSec()!=null && this.getCodSec().equals(castOther.getCodSec()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getNumNota() == null ? 0 : this.getNumNota().hashCode() );
         result = 37 * result + ( getTipNota() == null ? 0 : this.getTipNota().hashCode() );
         result = 37 * result + ( getCodSec() == null ? 0 : this.getCodSec().hashCode() );
         return result;
   }   


}


