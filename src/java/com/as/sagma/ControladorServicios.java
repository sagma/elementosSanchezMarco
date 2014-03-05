/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.as.sagma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author T107
 */

@Controller
@RequestMapping("/servicios-rest")

public class ControladorServicios {
 
    @RequestMapping(value="/hola",method=RequestMethod.GET,
            headers={"Accept=text/json"} )               /** da la salida como texto o html **/
            public @ResponseBody String enviarMensaje(){
                String mensajito="Hola mundo desde Rest";
                return mensajito;
            }
            
            @RequestMapping(value="/usuarios-json", method=RequestMethod.GET,
                    headers={"Accept=application/json"})
            public @ResponseBody String buscarUsuarios()throws Exception{
                Map<String, ArrayList<Usuario>> singletonMap=Collections.singletonMap("Usuarios", GenerarUsuarios.obtenerUsuario());
             
                ObjectMapper mapper=new ObjectMapper();
                return mapper.writeValueAsString(singletonMap);
                
            }
            
            
            
            
            //** paso7 guia **/
          
            @RequestMapping(value="/servicio-usuarios", method=RequestMethod.GET,
                    headers={"Accept=application/json"})
            public @ResponseBody String generarUsuario()throws Exception{
                Map<String, ArrayList<Usuario2>> singletonMap=Collections.singletonMap("Usuarios", GeneradorDeUsuarios.generarUsuario());
             
                ObjectMapper mapper=new ObjectMapper();
                return mapper.writeValueAsString(singletonMap);
                
            }
}



