package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0



/**
 * TesCargosxRcId generated by hbm2java
 */
public class TesCargosxRcId  implements java.io.Serializable {


     private String codalm;
     private String numRec;
     private String tipDoc;
     private String codcon;

    public TesCargosxRcId() {
    }

    public TesCargosxRcId(String codalm, String numRec, String tipDoc, String codcon) {
       this.codalm = codalm;
       this.numRec = numRec;
       this.tipDoc = tipDoc;
       this.codcon = codcon;
    }
   
    public String getCodalm() {
        return this.codalm;
    }
    
    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
    public String getNumRec() {
        return this.numRec;
    }
    
    public void setNumRec(String numRec) {
        this.numRec = numRec;
    }
    public String getTipDoc() {
        return this.tipDoc;
    }
    
    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }
    public String getCodcon() {
        return this.codcon;
    }
    
    public void setCodcon(String codcon) {
        this.codcon = codcon;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TesCargosxRcId) ) return false;
		 TesCargosxRcId castOther = ( TesCargosxRcId ) other; 
         
		 return ( (this.getCodalm()==castOther.getCodalm()) || ( this.getCodalm()!=null && castOther.getCodalm()!=null && this.getCodalm().equals(castOther.getCodalm()) ) )
 && ( (this.getNumRec()==castOther.getNumRec()) || ( this.getNumRec()!=null && castOther.getNumRec()!=null && this.getNumRec().equals(castOther.getNumRec()) ) )
 && ( (this.getTipDoc()==castOther.getTipDoc()) || ( this.getTipDoc()!=null && castOther.getTipDoc()!=null && this.getTipDoc().equals(castOther.getTipDoc()) ) )
 && ( (this.getCodcon()==castOther.getCodcon()) || ( this.getCodcon()!=null && castOther.getCodcon()!=null && this.getCodcon().equals(castOther.getCodcon()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodalm() == null ? 0 : this.getCodalm().hashCode() );
         result = 37 * result + ( getNumRec() == null ? 0 : this.getNumRec().hashCode() );
         result = 37 * result + ( getTipDoc() == null ? 0 : this.getTipDoc().hashCode() );
         result = 37 * result + ( getCodcon() == null ? 0 : this.getCodcon().hashCode() );
         return result;
   }   


}


