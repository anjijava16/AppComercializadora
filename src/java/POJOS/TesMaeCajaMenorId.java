package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0



/**
 * TesMaeCajaMenorId generated by hbm2java
 */
public class TesMaeCajaMenorId  implements java.io.Serializable {


     private String codAlm;
     private String codCaja;
     private String tipRem;
     private String numRem;

    public TesMaeCajaMenorId() {
    }

    public TesMaeCajaMenorId(String codAlm, String codCaja, String tipRem, String numRem) {
       this.codAlm = codAlm;
       this.codCaja = codCaja;
       this.tipRem = tipRem;
       this.numRem = numRem;
    }
   
    public String getCodAlm() {
        return this.codAlm;
    }
    
    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }
    public String getCodCaja() {
        return this.codCaja;
    }
    
    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }
    public String getTipRem() {
        return this.tipRem;
    }
    
    public void setTipRem(String tipRem) {
        this.tipRem = tipRem;
    }
    public String getNumRem() {
        return this.numRem;
    }
    
    public void setNumRem(String numRem) {
        this.numRem = numRem;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TesMaeCajaMenorId) ) return false;
		 TesMaeCajaMenorId castOther = ( TesMaeCajaMenorId ) other; 
         
		 return ( (this.getCodAlm()==castOther.getCodAlm()) || ( this.getCodAlm()!=null && castOther.getCodAlm()!=null && this.getCodAlm().equals(castOther.getCodAlm()) ) )
 && ( (this.getCodCaja()==castOther.getCodCaja()) || ( this.getCodCaja()!=null && castOther.getCodCaja()!=null && this.getCodCaja().equals(castOther.getCodCaja()) ) )
 && ( (this.getTipRem()==castOther.getTipRem()) || ( this.getTipRem()!=null && castOther.getTipRem()!=null && this.getTipRem().equals(castOther.getTipRem()) ) )
 && ( (this.getNumRem()==castOther.getNumRem()) || ( this.getNumRem()!=null && castOther.getNumRem()!=null && this.getNumRem().equals(castOther.getNumRem()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodAlm() == null ? 0 : this.getCodAlm().hashCode() );
         result = 37 * result + ( getCodCaja() == null ? 0 : this.getCodCaja().hashCode() );
         result = 37 * result + ( getTipRem() == null ? 0 : this.getTipRem().hashCode() );
         result = 37 * result + ( getNumRem() == null ? 0 : this.getNumRem().hashCode() );
         return result;
   }   


}


