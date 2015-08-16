/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Criptosistema;

/**
 *
 * @author Camilo
 */ 
public class metodoCesar {
    private int desplazamiento;
    private String mensaje;
    static final  char [] alfabeto = {'a','b','c','d','e','f','g','h',
    'i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x',
    'y','z','¬'};
    
    public metodoCesar(int desp, String texto){
        desplazamiento = desp;
        mensaje = texto.toLowerCase();//Para evitar problemas por mayúsculas
    }
    
    public String cifrar(){//Método para cifrar el mensaje que se ve en pantalla
        String cifrado = "";
        //Se realiza el desplazamiento a lo largo del alfabeto.
        for(int i=0; i<mensaje.length(); i++){
            for(int j=0; j<alfabeto.length; j++){
                if(mensaje.charAt(i) == alfabeto[j]){
                    if(j+desplazamiento < alfabeto.length) {
                        cifrado += alfabeto[j+desplazamiento];
                    }else{
                        cifrado += alfabeto[desplazamiento-(alfabeto.length-j)];
                    }
                }
            }
        }
        return cifrado;
    }
    
    public String descifrar(){
        String descifrado = "";
        for(int i=0; i<mensaje.length(); i++){
            for(int j=0; j<alfabeto.length; j++){
                if(mensaje.charAt(i)==alfabeto[j]){
                    if(j-desplazamiento>=0){
                        descifrado += alfabeto[j-desplazamiento];
                    }else{
                        descifrado += alfabeto[alfabeto.length-(desplazamiento-j)];
                    }
                }
            }
        }
        return descifrado;
    }
    
}
