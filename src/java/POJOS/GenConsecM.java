package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0



/**
 * GenConsecM generated by hbm2java
 */
public class GenConsecM  implements java.io.Serializable {


     private GenConsecMId id;
     private Integer consecutivo;

    public GenConsecM() {
    }

	
    public GenConsecM(GenConsecMId id) {
        this.id = id;
    }
    public GenConsecM(GenConsecMId id, Integer consecutivo) {
       this.id = id;
       this.consecutivo = consecutivo;
    }
   
    public GenConsecMId getId() {
        return this.id;
    }
    
    public void setId(GenConsecMId id) {
        this.id = id;
    }
    public Integer getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }




}


