/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.as.sagma;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GenerarUsuarios {
    public static ArrayList<Usuario> obtenerUsuario(){
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        Usuario u1=new Usuario("juan perez","56 66 788",42000);
        Usuario u2=new Usuario("maco sanchez","34 55 67 3",58000);
        Usuario u3=new Usuario("janet sanchez","34 55 67 3",1400);
        Usuario u4=new Usuario("angelica garcia","34 55 67 3",12400);
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        
        return usuarios;
               
    }
    
}
