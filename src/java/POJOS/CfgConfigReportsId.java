package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0



/**
 * CfgConfigReportsId generated by hbm2java
 */
public class CfgConfigReportsId  implements java.io.Serializable {


     private String idProcess;
     private String codalm;

    public CfgConfigReportsId() {
    }

    public CfgConfigReportsId(String idProcess, String codalm) {
       this.idProcess = idProcess;
       this.codalm = codalm;
    }
   
    public String getIdProcess() {
        return this.idProcess;
    }
    
    public void setIdProcess(String idProcess) {
        this.idProcess = idProcess;
    }
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CfgConfigReportsId) ) return false;
		 CfgConfigReportsId castOther = ( CfgConfigReportsId ) other; 
         
		 return ( (this.getIdProcess()==castOther.getIdProcess()) || ( this.getIdProcess()!=null && castOther.getIdProcess()!=null && this.getIdProcess().equals(castOther.getIdProcess()) ) )
 && ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdProcess() == null ? 0 : this.getIdProcess().hashCode() );
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         return result;
   }   


}


