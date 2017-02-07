/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg18;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Buzon {
    private ArrayList <Correo> elBuzon;

    public Buzon() {
        elBuzon = new ArrayList <Correo> ();
    }
    
    public int numCorreos(){
        return elBuzon.size();
    }
    
    public void mostrarNCorreos(){
        System.out.println(numCorreos());
    }
    
    public void añadeCorreo(Correo c){
        elBuzon.add(c);
    }
    
    public int porLeer(){
        int cont = 0, i = 0, sinL = 0;
        do{
            
            if(elBuzon.get(i).isLeido()==true){
                cont++;
            }
            if(elBuzon.get(i).isLeido()==false){
                cont=0;
            }
            if(cont==0){
                sinL++;
            }
            i++;
        }while(i<numCorreos());
        return sinL;
    }
    
    public void mostrarSinL(){
        if(porLeer()!=0){
            System.out.println("Quedan " + porLeer() + " correos por leer.");
        }
        else{
            System.out.println("Todos los correos leídos.");
        }
    }
    
    public void primeroNoLeido(){
        int cont = 0;
        boolean sinL = false;
        
        do{
            if(elBuzon.get(cont).isLeido()){
                sinL=true;
            }
            cont++;
        }while(sinL!=true|cont<numCorreos());
        System.out.println(elBuzon.get(cont));
    }
    
    public void mostrar(int k){
        System.out.println(elBuzon.get(k-1));
    }
    
    public void eliminar(int k){
        elBuzon.remove(k-1);
    }
}
