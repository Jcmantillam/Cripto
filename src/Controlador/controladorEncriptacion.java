/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Criptosistema.metodoCesar;

/**
 *
 * @author Camilo
 */
public class controladorEncriptacion {
    private String mensajeEncriptado;
    
    public controladorEncriptacion(int pasos, String texto,int opcion){
        metodoCesar met = new metodoCesar(pasos,texto);
        if(opcion == 1)mensajeEncriptado = met.cifrar();
        if(opcion == 2)mensajeEncriptado = met.descifrar();
    }
    
    
    public String encriptado(){
        return mensajeEncriptado;
    }
}
