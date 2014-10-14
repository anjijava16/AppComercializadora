/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import POJOS.VenDetaCart;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jhonbarranco
 */
public interface Interface_DetalCart {
   /***
    * 
    * @param session
    * @param tVentaDetalle
    * @return
    * @throws Exception 
    */
    public boolean insert(Session session, VenDetaCart tVentaDetalle) throws Exception;
    /**
     * 
     * @param session
     * @return
     * @throws Exception 
     */
    public List<VenDetaCart> getall(Session session, String numPed , String codAlm, String tipPed ) throws Exception;
    
     public List<VenDetaCart> getall2(Session session) throws Exception;
    
    /**
     * 
     * @param session
     * @param codIns
     * @return
     * @throws Exception 
     */
    public boolean ExisteCodins (Session session,String codAlm,String numPed, String tipPed,String codIns,String codTalla )  throws Exception; 
    
    /**
     * Cantida de unidades de un producto en bd
     * 
     * @param session
     * @param codAlm
     * @param numPed
     * @param tipPed
     * @param codIns
     * @param codTalla
     * @return
     * @throws Exception 
     */
    public BigDecimal cantidad (Session session,String codAlm,String numPed, String tipPed,String codIns,String codTalla )  throws Exception; 
    
    
    
    
    
    
    
    

}
