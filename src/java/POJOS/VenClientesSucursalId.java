package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * VenClientesSucursalId generated by hbm2java
 */
public class VenClientesSucursalId  implements java.io.Serializable {


     private String codCli;
     private String codSuc;

    public VenClientesSucursalId() {
    }

    public VenClientesSucursalId(String codCli, String codSuc) {
       this.codCli = codCli;
       this.codSuc = codSuc;
    }
   
    public String getCodCli() {
        return this.codCli;
    }
    
    public void setCodCli(String codCli) {
        this.codCli = codCli;
    }
    public String getCodSuc() {
        return this.codSuc;
    }
    
    public void setCodSuc(String codSuc) {
        this.codSuc = codSuc;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VenClientesSucursalId) ) return false;
		 VenClientesSucursalId castOther = ( VenClientesSucursalId ) other; 
         
		 return ( (this.getCodCli()==castOther.getCodCli()) || ( this.getCodCli()!=null && castOther.getCodCli()!=null && this.getCodCli().equals(castOther.getCodCli()) ) )
 && ( (this.getCodSuc()==castOther.getCodSuc()) || ( this.getCodSuc()!=null && castOther.getCodSuc()!=null && this.getCodSuc().equals(castOther.getCodSuc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodCli() == null ? 0 : this.getCodCli().hashCode() );
         result = 37 * result + ( getCodSuc() == null ? 0 : this.getCodSuc().hashCode() );
         return result;
   }   


}


