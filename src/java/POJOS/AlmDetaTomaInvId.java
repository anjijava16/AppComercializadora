package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * AlmDetaTomaInvId generated by hbm2java
 */
public class AlmDetaTomaInvId  implements java.io.Serializable {


     private String codToma;
     private String codalm;
     private String codins;
     private String codtalla;

    public AlmDetaTomaInvId() {
    }

    public AlmDetaTomaInvId(String codToma, String codalm, String codins, String codtalla) {
       this.codToma = codToma;
       this.codalm = codalm;
       this.codins = codins;
       this.codtalla = codtalla;
    }
   
    public String getCodToma() {
        return this.codToma;
    }
    
    public void setCodToma(String codToma) {
        this.codToma = codToma;
    }
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getCodins() {
        return this.codins;
    }
    
    public void setCodins(String codins) {
        this.codins = codins;
    }
    public String getCodtalla() {
        return this.codtalla;
    }
    
    public void setCodtalla(String codtalla) {
        this.codtalla = codtalla;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AlmDetaTomaInvId) ) return false;
		 AlmDetaTomaInvId castOther = ( AlmDetaTomaInvId ) other; 
         
		 return ( (this.getCodToma()==castOther.getCodToma()) || ( this.getCodToma()!=null && castOther.getCodToma()!=null && this.getCodToma().equals(castOther.getCodToma()) ) )
 && ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getCodins()==castOther.getCodins()) || ( this.getCodins()!=null && castOther.getCodins()!=null && this.getCodins().equals(castOther.getCodins()) ) )
 && ( (this.getCodtalla()==castOther.getCodtalla()) || ( this.getCodtalla()!=null && castOther.getCodtalla()!=null && this.getCodtalla().equals(castOther.getCodtalla()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodToma() == null ? 0 : this.getCodToma().hashCode() );
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getCodins() == null ? 0 : this.getCodins().hashCode() );
         result = 37 * result + ( getCodtalla() == null ? 0 : this.getCodtalla().hashCode() );
         return result;
   }   


}


