package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * NomPagosId generated by hbm2java
 */
public class NomPagosId  implements java.io.Serializable {


     private String codEmp;
     private String numDoc;
     private String tipDoc;
     private int año;
     private byte mes;
     private byte PIni;
     private byte PFin;

    public NomPagosId() {
    }

    public NomPagosId(String codEmp, String numDoc, String tipDoc, int año, byte mes, byte PIni, byte PFin) {
       this.codEmp = codEmp;
       this.numDoc = numDoc;
       this.tipDoc = tipDoc;
      this.año = año;
       this.mes = mes;
       this.PIni = PIni;
       this.PFin = PFin;
    }
   
    public String getCodEmp() {
        return this.codEmp;
    }
    
    public void setCodEmp(String codEmp) {
        this.codEmp = codEmp;
    }
    public String getNumDoc() {
        return this.numDoc;
    }
    
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    public String getTipDoc() {
        return this.tipDoc;
    }
    
    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
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
    public byte getPIni() {
        return this.PIni;
    }
    
    public void setPIni(byte PIni) {
        this.PIni = PIni;
    }
    public byte getPFin() {
        return this.PFin;
    }
    
    public void setPFin(byte PFin) {
        this.PFin = PFin;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NomPagosId) ) return false;
		 NomPagosId castOther = ( NomPagosId ) other; 
         
		 return ( (this.getCodEmp()==castOther.getCodEmp()) || ( this.getCodEmp()!=null && castOther.getCodEmp()!=null && this.getCodEmp().equals(castOther.getCodEmp()) ) )
 && ( (this.getNumDoc()==castOther.getNumDoc()) || ( this.getNumDoc()!=null && castOther.getNumDoc()!=null && this.getNumDoc().equals(castOther.getNumDoc()) ) )
 && ( (this.getTipDoc()==castOther.getTipDoc()) || ( this.getTipDoc()!=null && castOther.getTipDoc()!=null && this.getTipDoc().equals(castOther.getTipDoc()) ) )
 && (this.getAño()==castOther.getAño())
 && (this.getMes()==castOther.getMes())
 && (this.getPIni()==castOther.getPIni())
 && (this.getPFin()==castOther.getPFin());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodEmp() == null ? 0 : this.getCodEmp().hashCode() );
         result = 37 * result + ( getNumDoc() == null ? 0 : this.getNumDoc().hashCode() );
         result = 37 * result + ( getTipDoc() == null ? 0 : this.getTipDoc().hashCode() );
         result = 37 * result + this.getAño();
         result = 37 * result + this.getMes();
         result = 37 * result + this.getPIni();
         result = 37 * result + this.getPFin();
         return result;
   }   


}


