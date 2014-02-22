/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.as.sagma;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author T107
 */

@Controller
@RequestMapping("/servicios-rest")

public class ControladorServicios {
 
    @RequestMapping(value="/hola",method=RequestMethod.GET,
            headers={"Accept=text/html"}                /** da la salida como texto o html **/
            public @ResponseBody
    )
}
