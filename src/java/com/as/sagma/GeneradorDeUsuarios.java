/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.as.sagma;

import java.util.ArrayList;

/**
 *
 * paso 6 guia
 */
public class GeneradorDeUsuarios {
    
    public static ArrayList<Usuario2> generarUsuario(){
        ArrayList<Usuario2> usuarios=new ArrayList<Usuario2>();
        
        Usuario2 u1=new Usuario2(1,"juan","juangmail.com");
        Usuario2 u2=new Usuario2(2,"ana","ana@gmail.com");
        Usuario2 u3=new Usuario2(3,"pedro","pedro@gmail.com");

        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        
        return usuarios;
}
}
