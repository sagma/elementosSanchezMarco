/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.as.sagma;

/**
 *
 * @author T107
 */
public class CuentaNominaImpl extends Cuenta implements ServicioCuenta {
    
    public String crearCuenta(){
        //Aqui va codigo que se conecta a la base de datos que crea este tipo de cuenta
        
        return "Se ha creado con exito una cuenta de Nomina";
    }
}
