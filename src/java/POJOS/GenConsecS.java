package POJOS;
// Generated 19-sep-2014 10:35:39 by Hibernate Tools 3.6.0



/**
 * GenConsecS generated by hbm2java
 */
public class GenConsecS  implements java.io.Serializable {


     private GenConsecSId id;
     private Integer consecutivo;

    public GenConsecS() {
    }

	
    public GenConsecS(GenConsecSId id) {
        this.id = id;
    }
    public GenConsecS(GenConsecSId id, Integer consecutivo) {
       this.id = id;
       this.consecutivo = consecutivo;
    }
   
    public GenConsecSId getId() {
        return this.id;
    }
    
    public void setId(GenConsecSId id) {
        this.id = id;
    }
    public Integer getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }




}


