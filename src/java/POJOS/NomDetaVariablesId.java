package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * NomDetaVariablesId generated by hbm2java
 */
public class NomDetaVariablesId  implements java.io.Serializable {


     private String codVar;
     private String codEmp;

    public NomDetaVariablesId() {
    }

    public NomDetaVariablesId(String codVar, String codEmp) {
       this.codVar = codVar;
       this.codEmp = codEmp;
    }
   
    public String getCodVar() {
        return this.codVar;
    }
    
    public void setCodVar(String codVar) {
        this.codVar = codVar;
    }
    public String getCodEmp() {
        return this.codEmp;
    }
    
    public void setCodEmp(String codEmp) {
        this.codEmp = codEmp;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NomDetaVariablesId) ) return false;
		 NomDetaVariablesId castOther = ( NomDetaVariablesId ) other; 
         
		 return ( (this.getCodVar()==castOther.getCodVar()) || ( this.getCodVar()!=null && castOther.getCodVar()!=null && this.getCodVar().equals(castOther.getCodVar()) ) )
 && ( (this.getCodEmp()==castOther.getCodEmp()) || ( this.getCodEmp()!=null && castOther.getCodEmp()!=null && this.getCodEmp().equals(castOther.getCodEmp()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodVar() == null ? 0 : this.getCodVar().hashCode() );
         result = 37 * result + ( getCodEmp() == null ? 0 : this.getCodEmp().hashCode() );
         return result;
   }   


}


