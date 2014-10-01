/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import POJOS.VenMaeCart;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jhonbarranco
 */
public interface Interface_MaeCart {
    
    /**
     * Insertar
     * @param session
     * @param maeCart
     * @return
     * @throws Exception 
     */ 
    public boolean insert(Session session, VenMaeCart maeCart) throws Exception;
    
    /**
     * Listar Todas las maecart
     * @param session
     * @return
     * @throws Exception 
     */
    public List<VenMaeCart> Listar(Session session) throws Exception;
     
    /**
     * 
     * @param session
     * @param v
     * @return
     * @throws Exception 
     */
    public boolean getConsecutivoMae(Session session, String numPed) throws Exception;
            
    
    
    /**
     * 
     * @param session
     * @param codter
     * @return
     * @throws Exception 
     */
    public String ClienteNombre(Session session, String codter) throws Exception;
    
     public String ClienteDireccion(Session session, String codter) throws Exception;
    
    public String ClienteTelfono(Session session, String codter) throws Exception;
    
    public Date fechaVenta(Session session, String numPed )throws  Exception;
    
    
    
           
     
   
    
}
