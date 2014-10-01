package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * NomNovedadId generated by hbm2java
 */
public class NomNovedadId  implements java.io.Serializable {


     private String codCen;
     private String codEmp;
     private int año;
     private String mes;
     private String periodo;

    public NomNovedadId() {
    }

    public NomNovedadId(String codCen, String codEmp, int año, String mes, String periodo) {
       this.codCen = codCen;
       this.codEmp = codEmp;
       this.año = año;
       this.mes = mes;
       this.periodo = periodo;
    }
   
    public String getCodCen() {
        return this.codCen;
    }
    
    public void setCodCen(String codCen) {
        this.codCen = codCen;
    }
    public String getCodEmp() {
        return this.codEmp;
    }
    
    public void setCodEmp(String codEmp) {
        this.codEmp = codEmp;
    }
    public int getAño() {
        return this.año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }
    public String getMes() {
        return this.mes;
    }
    
    public void setMes(String mes) {
        this.mes = mes;
    }
    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NomNovedadId) ) return false;
		 NomNovedadId castOther = ( NomNovedadId ) other; 
         
		 return ( (this.getCodCen()==castOther.getCodCen()) || ( this.getCodCen()!=null && castOther.getCodCen()!=null && this.getCodCen().equals(castOther.getCodCen()) ) )
 && ( (this.getCodEmp()==castOther.getCodEmp()) || ( this.getCodEmp()!=null && castOther.getCodEmp()!=null && this.getCodEmp().equals(castOther.getCodEmp()) ) )
 && (this.getAño()==castOther.getAño())
 && ( (this.getMes()==castOther.getMes()) || ( this.getMes()!=null && castOther.getMes()!=null && this.getMes().equals(castOther.getMes()) ) )
 && ( (this.getPeriodo()==castOther.getPeriodo()) || ( this.getPeriodo()!=null && castOther.getPeriodo()!=null && this.getPeriodo().equals(castOther.getPeriodo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodCen() == null ? 0 : this.getCodCen().hashCode() );
         result = 37 * result + ( getCodEmp() == null ? 0 : this.getCodEmp().hashCode() );
         result = 37 * result + this.getAño();
         result = 37 * result + ( getMes() == null ? 0 : this.getMes().hashCode() );
         result = 37 * result + ( getPeriodo() == null ? 0 : this.getPeriodo().hashCode() );
         return result;
   }   


}


