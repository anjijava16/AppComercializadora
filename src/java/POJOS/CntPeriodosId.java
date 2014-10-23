package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * CntPeriodosId generated by hbm2java
 */
public class CntPeriodosId  implements java.io.Serializable {


     private String codCos;
     private int año;
     private byte mes;

    public CntPeriodosId() {
    }

    public CntPeriodosId(String codCos, int año, byte mes) {
       this.codCos = codCos;
       this.año = año;
       this.mes = mes;
    }
   
    public String getCodCos() {
        return this.codCos;
    }
    
    public void setCodCos(String codCos) {
        this.codCos = codCos;
    }
    public int getAño() {
        return this.año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }
    public byte getMes() {
        return this.mes;
    }
    
    public void setMes(byte mes) {
        this.mes = mes;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CntPeriodosId) ) return false;
		 CntPeriodosId castOther = ( CntPeriodosId ) other; 
         
		 return ( (this.getCodCos()==castOther.getCodCos()) || ( this.getCodCos()!=null && castOther.getCodCos()!=null && this.getCodCos().equals(castOther.getCodCos()) ) )
 && (this.getAño()==castOther.getAño())
 && (this.getMes()==castOther.getMes());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodCos() == null ? 0 : this.getCodCos().hashCode() );
         result = 37 * result + this.getAño();
         result = 37 * result + this.getMes();
         return result;
   }   


}


