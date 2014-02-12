/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.as.sagma;

import org.springframework.stereotype.Controller;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *Esta url sera
 * http://localhost:8084/IntroduccionSpring/servicio-nomina/tipo/
 */

@Controller
@RequestMapping("/servicio-nomina")
public class ControladorNominas {
    
    @RequestMapping(value="/tipo", method=RequestMethod.GET)
    public String obtenerNomina(Model model){
      model.addAttribute("minomina", "estamos probando las nominas");
        
        return "servicioNomina";
    }
}
