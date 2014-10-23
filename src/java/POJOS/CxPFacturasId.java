package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * CxPFacturasId generated by hbm2java
 */
public class CxPFacturasId  implements java.io.Serializable {


     private String codalm;
     private String numfac;
     private String tipFac;
     private String codpro;
     private String estado;

    public CxPFacturasId() {
    }

    public CxPFacturasId(String codalm, String numfac, String tipFac, String codpro, String estado) {
       this.codalm = codalm;
       this.numfac = numfac;
       this.tipFac = tipFac;
       this.codpro = codpro;
       this.estado = estado;
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
    public String getTipFac() {
        return this.tipFac;
    }
    
    public void setTipFac(String tipFac) {
        this.tipFac = tipFac;
    }
    public String getCodpro() {
        return this.codpro;
    }
    
    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CxPFacturasId) ) return false;
		 CxPFacturasId castOther = ( CxPFacturasId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getNumfac()==castOther.getNumfac()) || ( this.getNumfac()!=null && castOther.getNumfac()!=null && this.getNumfac().equals(castOther.getNumfac()) ) )
 && ( (this.getTipFac()==castOther.getTipFac()) || ( this.getTipFac()!=null && castOther.getTipFac()!=null && this.getTipFac().equals(castOther.getTipFac()) ) )
 && ( (this.getCodpro()==castOther.getCodpro()) || ( this.getCodpro()!=null && castOther.getCodpro()!=null && this.getCodpro().equals(castOther.getCodpro()) ) )
 && ( (this.getEstado()==castOther.getEstado()) || ( this.getEstado()!=null && castOther.getEstado()!=null && this.getEstado().equals(castOther.getEstado()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getNumfac() == null ? 0 : this.getNumfac().hashCode() );
         result = 37 * result + ( getTipFac() == null ? 0 : this.getTipFac().hashCode() );
         result = 37 * result + ( getCodpro() == null ? 0 : this.getCodpro().hashCode() );
         result = 37 * result + ( getEstado() == null ? 0 : this.getEstado().hashCode() );
         return result;
   }   


}


