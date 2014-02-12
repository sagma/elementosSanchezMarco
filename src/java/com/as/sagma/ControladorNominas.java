/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.as.sagma;

import org.springframework.stereotype.Controller;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *Esta url sera
 * http://localhost:8084/IntroduccionSpring/servicio-nomina/tipo/
 */

@Controller
@RequestMapping("/servicio-nomina")
public class ControladorNominas {
    
    @RequestMapping(value="/tipo/{tipo}", method=RequestMethod.GET)     /** /tipo/{las llaves permiten un tipo de valor en la url (como uri)**/
    public String obtenerNomina(@PathVariable String tipo,Model model){
      model.addAttribute("minomina", "Tu estas interesado en un tipo de cuenta "+tipo);
        
        return "servicioNomina";
    }
}
