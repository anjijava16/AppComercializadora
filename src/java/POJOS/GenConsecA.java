package POJOS;
// Generated 21-oct-2014 16:02:55 by Hibernate Tools 3.6.0



/**
 * GenConsecA generated by hbm2java
 */
public class GenConsecA  implements java.io.Serializable {


     private GenConsecAId id;
     private Integer consecutivo;

    public GenConsecA() {
    }

	
    public GenConsecA(GenConsecAId id) {
        this.id = id;
    }
    public GenConsecA(GenConsecAId id, Integer consecutivo) {
       this.id = id;
       this.consecutivo = consecutivo;
    }
   
    public GenConsecAId getId() {
        return this.id;
    }
    
    public void setId(GenConsecAId id) {
        this.id = id;
    }
    public Integer getConsecutivo() {
        return this.consecutivo;
    }
    
    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }




}


