/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.as.sagma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author T107
 */
public class ProbarCuentas {
    
    public static void main(String args[]){
        
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ApConfig.class);
        ServicioCuenta cuenta= ctx.getBean(ServicioCuenta.class);
        System.out.println("Bienvenido a la creacion de cuentas");
        // ServicioCuenta cuenta=new CuentaAhorroImpl();
        System.out.println(cuenta.crearCuenta());
    }
}
