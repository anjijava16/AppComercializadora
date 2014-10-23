package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * NomDetaPrestamoId generated by hbm2java
 */
public class NomDetaPrestamoId  implements java.io.Serializable {


     private String codAlm;
     private String numPre;
     private String codemp;
     private Date fecCuo;

    public NomDetaPrestamoId() {
    }

    public NomDetaPrestamoId(String codAlm, String numPre, String codemp, Date fecCuo) {
       this.codAlm = codAlm;
       this.numPre = numPre;
       this.codemp = codemp;
       this.fecCuo = fecCuo;
    }
   
    public String getCodAlm() {
        return this.codAlm;
    }
    
    public void setCodAlm(String codAlm) {
        this.codAlm = codAlm;
    }
    public String getNumPre() {
        return this.numPre;
    }
    
    public void setNumPre(String numPre) {
        this.numPre = numPre;
    }
    public String getCodemp() {
        return this.codemp;
    }
    
    public void setCodemp(String codemp) {
        this.codemp = codemp;
    }
    public Date getFecCuo() {
        return this.fecCuo;
    }
    
    public void setFecCuo(Date fecCuo) {
        this.fecCuo = fecCuo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NomDetaPrestamoId) ) return false;
		 NomDetaPrestamoId castOther = ( NomDetaPrestamoId ) other; 
         
		 return ( (this.getCodAlm()==castOther.getCodAlm()) || ( this.getCodAlm()!=null && castOther.getCodAlm()!=null && this.getCodAlm().equals(castOther.getCodAlm()) ) )
 && ( (this.getNumPre()==castOther.getNumPre()) || ( this.getNumPre()!=null && castOther.getNumPre()!=null && this.getNumPre().equals(castOther.getNumPre()) ) )
 && ( (this.getCodemp()==castOther.getCodemp()) || ( this.getCodemp()!=null && castOther.getCodemp()!=null && this.getCodemp().equals(castOther.getCodemp()) ) )
 && ( (this.getFecCuo()==castOther.getFecCuo()) || ( this.getFecCuo()!=null && castOther.getFecCuo()!=null && this.getFecCuo().equals(castOther.getFecCuo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodAlm() == null ? 0 : this.getCodAlm().hashCode() );
         result = 37 * result + ( getNumPre() == null ? 0 : this.getNumPre().hashCode() );
         result = 37 * result + ( getCodemp() == null ? 0 : this.getCodemp().hashCode() );
         result = 37 * result + ( getFecCuo() == null ? 0 : this.getFecCuo().hashCode() );
         return result;
   }   


}


