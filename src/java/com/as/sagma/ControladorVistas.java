/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.as.sagma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author T107
 */


@Controller
@RequestMapping(value="/empresaX")                  /**Crea en la url una especie de subcarpeta**/

public class ControladorVistas {

    @Autowired ServicioCuenta cuenta;               /**Se declara para poder utilizarlo en cualquiera de los RequestMapping**/
    
@RequestMapping(value="/nominas")                   /**este RequestMapping crea una especie de pagina que va a ocultar la extencion**/
public String accesoANominas(Model model){             /** este metodo nunca se utiliza **/
    model.addAttribute("cualquiernombre", cuenta.crearCuenta());         /**toma el valor declarado anteriormente del Autowired y lo nombramos como cuenta**/
    return "algodon";                       /**Retorna el archivo algodon.jsp**/
}    
    
    
@RequestMapping(value="/administracion")
public String accesoAdministracion(){         /** este metodo nunca se utiliza **/
    
    return "administracion";  
}

}
