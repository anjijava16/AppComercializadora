package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * CntDetaFormatExcelId generated by hbm2java
 */
public class CntDetaFormatExcelId  implements java.io.Serializable {


     private String codMod;
     private String codGru;
     private String codReng;

    public CntDetaFormatExcelId() {
    }

    public CntDetaFormatExcelId(String codMod, String codGru, String codReng) {
       this.codMod = codMod;
       this.codGru = codGru;
       this.codReng = codReng;
    }
   
    public String getCodMod() {
        return this.codMod;
    }
    
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    public String getCodGru() {
        return this.codGru;
    }
    
    public void setCodGru(String codGru) {
        this.codGru = codGru;
    }
    public String getCodReng() {
        return this.codReng;
    }
    
    public void setCodReng(String codReng) {
        this.codReng = codReng;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CntDetaFormatExcelId) ) return false;
		 CntDetaFormatExcelId castOther = ( CntDetaFormatExcelId ) other; 
         
		 return ( (this.getCodMod()==castOther.getCodMod()) || ( this.getCodMod()!=null && castOther.getCodMod()!=null && this.getCodMod().equals(castOther.getCodMod()) ) )
 && ( (this.getCodGru()==castOther.getCodGru()) || ( this.getCodGru()!=null && castOther.getCodGru()!=null && this.getCodGru().equals(castOther.getCodGru()) ) )
 && ( (this.getCodReng()==castOther.getCodReng()) || ( this.getCodReng()!=null && castOther.getCodReng()!=null && this.getCodReng().equals(castOther.getCodReng()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodMod() == null ? 0 : this.getCodMod().hashCode() );
         result = 37 * result + ( getCodGru() == null ? 0 : this.getCodGru().hashCode() );
         result = 37 * result + ( getCodReng() == null ? 0 : this.getCodReng().hashCode() );
         return result;
   }   


}


