package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0



/**
 * VenDetaFactId generated by hbm2java
 */
public class VenDetaFactId  implements java.io.Serializable {


     private String codalm;
     private String numfac;
     private String tipfac;
     private String codres;
     private String codins;
     private String idreg;

    public VenDetaFactId() {
    }

    public VenDetaFactId(String codalm, String numfac, String tipfac, String codres, String codins, String idreg) {
       this.codalm = codalm;
       this.numfac = numfac;
       this.tipfac = tipfac;
       this.codres = codres;
       this.codins = codins;
       this.idreg = idreg;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getNumfac() {
        return this.numfac;
    }
    
    public void setNumfac(String numfac) {
        this.numfac = numfac;
    }
    public String getTipfac() {
        return this.tipfac;
    }
    
    public void setTipfac(String tipfac) {
        this.tipfac = tipfac;
    }
    public String getCodres() {
        return this.codres;
    }
    
    public void setCodres(String codres) {
        this.codres = codres;
    }
    public String getCodins() {
        return this.codins;
    }
    
    public void setCodins(String codins) {
        this.codins = codins;
    }
    public String getIdreg() {
        return this.idreg;
    }
    
    public void setIdreg(String idreg) {
        this.idreg = idreg;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VenDetaFactId) ) return false;
		 VenDetaFactId castOther = ( VenDetaFactId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getNumfac()==castOther.getNumfac()) || ( this.getNumfac()!=null && castOther.getNumfac()!=null && this.getNumfac().equals(castOther.getNumfac()) ) )
 && ( (this.getTipfac()==castOther.getTipfac()) || ( this.getTipfac()!=null && castOther.getTipfac()!=null && this.getTipfac().equals(castOther.getTipfac()) ) )
 && ( (this.getCodres()==castOther.getCodres()) || ( this.getCodres()!=null && castOther.getCodres()!=null && this.getCodres().equals(castOther.getCodres()) ) )
 && ( (this.getCodins()==castOther.getCodins()) || ( this.getCodins()!=null && castOther.getCodins()!=null && this.getCodins().equals(castOther.getCodins()) ) )
 && ( (this.getIdreg()==castOther.getIdreg()) || ( this.getIdreg()!=null && castOther.getIdreg()!=null && this.getIdreg().equals(castOther.getIdreg()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getNumfac() == null ? 0 : this.getNumfac().hashCode() );
         result = 37 * result + ( getTipfac() == null ? 0 : this.getTipfac().hashCode() );
         result = 37 * result + ( getCodres() == null ? 0 : this.getCodres().hashCode() );
         result = 37 * result + ( getCodins() == null ? 0 : this.getCodins().hashCode() );
         result = 37 * result + ( getIdreg() == null ? 0 : this.getIdreg().hashCode() );
         return result;
   }   


}


