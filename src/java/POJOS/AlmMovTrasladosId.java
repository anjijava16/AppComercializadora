package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * AlmMovTrasladosId generated by hbm2java
 */
public class AlmMovTrasladosId  implements java.io.Serializable {


     private String codAlmOri;
     private String docKarOri;
     private String tipKarOri;
     private String codAlmDes;

    public AlmMovTrasladosId() {
    }

    public AlmMovTrasladosId(String codAlmOri, String docKarOri, String tipKarOri, String codAlmDes) {
       this.codAlmOri = codAlmOri;
       this.docKarOri = docKarOri;
       this.tipKarOri = tipKarOri;
       this.codAlmDes = codAlmDes;
    }
   
    public String getCodAlmOri() {
        return this.codAlmOri;
    }
    
    public void setCodAlmOri(String codAlmOri) {
        this.codAlmOri = codAlmOri;
    }
    public String getDocKarOri() {
        return this.docKarOri;
    }
    
    public void setDocKarOri(String docKarOri) {
        this.docKarOri = docKarOri;
    }
    public String getTipKarOri() {
        return this.tipKarOri;
    }
    
    public void setTipKarOri(String tipKarOri) {
        this.tipKarOri = tipKarOri;
    }
    public String getCodAlmDes() {
        return this.codAlmDes;
    }
    
    public void setCodAlmDes(String codAlmDes) {
        this.codAlmDes = codAlmDes;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AlmMovTrasladosId) ) return false;
		 AlmMovTrasladosId castOther = ( AlmMovTrasladosId ) other; 
         
		 return ( (this.getCodAlmOri()==castOther.getCodAlmOri()) || ( this.getCodAlmOri()!=null && castOther.getCodAlmOri()!=null && this.getCodAlmOri().equals(castOther.getCodAlmOri()) ) )
 && ( (this.getDocKarOri()==castOther.getDocKarOri()) || ( this.getDocKarOri()!=null && castOther.getDocKarOri()!=null && this.getDocKarOri().equals(castOther.getDocKarOri()) ) )
 && ( (this.getTipKarOri()==castOther.getTipKarOri()) || ( this.getTipKarOri()!=null && castOther.getTipKarOri()!=null && this.getTipKarOri().equals(castOther.getTipKarOri()) ) )
 && ( (this.getCodAlmDes()==castOther.getCodAlmDes()) || ( this.getCodAlmDes()!=null && castOther.getCodAlmDes()!=null && this.getCodAlmDes().equals(castOther.getCodAlmDes()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodAlmOri() == null ? 0 : this.getCodAlmOri().hashCode() );
         result = 37 * result + ( getDocKarOri() == null ? 0 : this.getDocKarOri().hashCode() );
         result = 37 * result + ( getTipKarOri() == null ? 0 : this.getTipKarOri().hashCode() );
         result = 37 * result + ( getCodAlmDes() == null ? 0 : this.getCodAlmDes().hashCode() );
         return result;
   }   


}

