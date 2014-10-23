package POJOS;
// Generated 23-oct-2014 8:25:39 by Hibernate Tools 3.6.0



/**
 * GenNotificaEventosId generated by hbm2java
 */
public class GenNotificaEventosId  implements java.io.Serializable {


     private String idProcess;
     private String email;
     private String variantKey;

    public GenNotificaEventosId() {
    }

    public GenNotificaEventosId(String idProcess, String email, String variantKey) {
       this.idProcess = idProcess;
       this.email = email;
       this.variantKey = variantKey;
    }
   
    public String getIdProcess() {
        return this.idProcess;
    }
    
    public void setIdProcess(String idProcess) {
        this.idProcess = idProcess;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getVariantKey() {
        return this.variantKey;
    }
    
    public void setVariantKey(String variantKey) {
        this.variantKey = variantKey;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GenNotificaEventosId) ) return false;
		 GenNotificaEventosId castOther = ( GenNotificaEventosId ) other; 
         
		 return ( (this.getIdProcess()==castOther.getIdProcess()) || ( this.getIdProcess()!=null && castOther.getIdProcess()!=null && this.getIdProcess().equals(castOther.getIdProcess()) ) )
 && ( (this.getEmail()==castOther.getEmail()) || ( this.getEmail()!=null && castOther.getEmail()!=null && this.getEmail().equals(castOther.getEmail()) ) )
 && ( (this.getVariantKey()==castOther.getVariantKey()) || ( this.getVariantKey()!=null && castOther.getVariantKey()!=null && this.getVariantKey().equals(castOther.getVariantKey()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdProcess() == null ? 0 : this.getIdProcess().hashCode() );
         result = 37 * result + ( getEmail() == null ? 0 : this.getEmail().hashCode() );
         result = 37 * result + ( getVariantKey() == null ? 0 : this.getVariantKey().hashCode() );
         return result;
   }   


}


