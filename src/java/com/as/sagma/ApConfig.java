/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.as.sagma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Esta es la IoC aqui se crean todos los beans necesarios
 * Esta es la parte logica que controla todo aqui se crean todas las configuraciones va a crear todas las configuraciones de los controles
 */

@Configuration

public class ApConfig {
    
    @Bean
    ServicioCuenta crearCuentaDeBanco(){            /** el nombre de crearCuentaDeBanco no importa xq no es utilizado **/
        
        return new CuentaNominaImpl();
        
    }
}
