package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * CntComprobantesId generated by hbm2java
 */
public class CntComprobantesId  implements java.io.Serializable {


     private String codCen;
     private String numDoc;
     private String tipDoc;
     private String codCue;
     private String codter;
     private String codres;
     private String codCos;
     private String otrCodCue;
     private String numrad;
     private String idreg;
     private String idregDe;

    public CntComprobantesId() {
    }

    public CntComprobantesId(String codCen, String numDoc, String tipDoc, String codCue, String codter, String codres, String codCos, String otrCodCue, String numrad, String idreg, String idregDe) {
       this.codCen = codCen;
       this.numDoc = numDoc;
       this.tipDoc = tipDoc;
       this.codCue = codCue;
       this.codter = codter;
       this.codres = codres;
       this.codCos = codCos;
       this.otrCodCue = otrCodCue;
       this.numrad = numrad;
       this.idreg = idreg;
       this.idregDe = idregDe;
    }
   
    public String getCodCen() {
        return this.codCen;
    }
    
    public void setCodCen(String codCen) {
        this.codCen = codCen;
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
    public String getCodCue() {
        return this.codCue;
    }
    
    public void setCodCue(String codCue) {
        this.codCue = codCue;
    }
    public String getCodter() {
        return this.codter;
    }
    
    public void setCodter(String codter) {
        this.codter = codter;
    }
    public String getCodres() {
        return this.codres;
    }
    
    public void setCodres(String codres) {
        this.codres = codres;
    }
    public String getCodCos() {
        return this.codCos;
    }
    
    public void setCodCos(String codCos) {
        this.codCos = codCos;
    }
    public String getOtrCodCue() {
        return this.otrCodCue;
    }
    
    public void setOtrCodCue(String otrCodCue) {
        this.otrCodCue = otrCodCue;
    }
    public String getNumrad() {
        return this.numrad;
    }
    
    public void setNumrad(String numrad) {
        this.numrad = numrad;
    }
    public String getIdreg() {
        return this.idreg;
    }
    
    public void setIdreg(String idreg) {
        this.idreg = idreg;
    }
    public String getIdregDe() {
        return this.idregDe;
    }
    
    public void setIdregDe(String idregDe) {
        this.idregDe = idregDe;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CntComprobantesId) ) return false;
		 CntComprobantesId castOther = ( CntComprobantesId ) other; 
         
		 return ( (this.getCodCen()==castOther.getCodCen()) || ( this.getCodCen()!=null && castOther.getCodCen()!=null && this.getCodCen().equals(castOther.getCodCen()) ) )
 && ( (this.getNumDoc()==castOther.getNumDoc()) || ( this.getNumDoc()!=null && castOther.getNumDoc()!=null && this.getNumDoc().equals(castOther.getNumDoc()) ) )
 && ( (this.getTipDoc()==castOther.getTipDoc()) || ( this.getTipDoc()!=null && castOther.getTipDoc()!=null && this.getTipDoc().equals(castOther.getTipDoc()) ) )
 && ( (this.getCodCue()==castOther.getCodCue()) || ( this.getCodCue()!=null && castOther.getCodCue()!=null && this.getCodCue().equals(castOther.getCodCue()) ) )
 && ( (this.getCodter()==castOther.getCodter()) || ( this.getCodter()!=null && castOther.getCodter()!=null && this.getCodter().equals(castOther.getCodter()) ) )
 && ( (this.getCodres()==castOther.getCodres()) || ( this.getCodres()!=null && castOther.getCodres()!=null && this.getCodres().equals(castOther.getCodres()) ) )
 && ( (this.getCodCos()==castOther.getCodCos()) || ( this.getCodCos()!=null && castOther.getCodCos()!=null && this.getCodCos().equals(castOther.getCodCos()) ) )
 && ( (this.getOtrCodCue()==castOther.getOtrCodCue()) || ( this.getOtrCodCue()!=null && castOther.getOtrCodCue()!=null && this.getOtrCodCue().equals(castOther.getOtrCodCue()) ) )
 && ( (this.getNumrad()==castOther.getNumrad()) || ( this.getNumrad()!=null && castOther.getNumrad()!=null && this.getNumrad().equals(castOther.getNumrad()) ) )
 && ( (this.getIdreg()==castOther.getIdreg()) || ( this.getIdreg()!=null && castOther.getIdreg()!=null && this.getIdreg().equals(castOther.getIdreg()) ) )
 && ( (this.getIdregDe()==castOther.getIdregDe()) || ( this.getIdregDe()!=null && castOther.getIdregDe()!=null && this.getIdregDe().equals(castOther.getIdregDe()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodCen() == null ? 0 : this.getCodCen().hashCode() );
         result = 37 * result + ( getNumDoc() == null ? 0 : this.getNumDoc().hashCode() );
         result = 37 * result + ( getTipDoc() == null ? 0 : this.getTipDoc().hashCode() );
         result = 37 * result + ( getCodCue() == null ? 0 : this.getCodCue().hashCode() );
         result = 37 * result + ( getCodter() == null ? 0 : this.getCodter().hashCode() );
         result = 37 * result + ( getCodres() == null ? 0 : this.getCodres().hashCode() );
         result = 37 * result + ( getCodCos() == null ? 0 : this.getCodCos().hashCode() );
         result = 37 * result + ( getOtrCodCue() == null ? 0 : this.getOtrCodCue().hashCode() );
         result = 37 * result + ( getNumrad() == null ? 0 : this.getNumrad().hashCode() );
         result = 37 * result + ( getIdreg() == null ? 0 : this.getIdreg().hashCode() );
         result = 37 * result + ( getIdregDe() == null ? 0 : this.getIdregDe().hashCode() );
         return result;
   }   


}


