/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg18;

/**
 *
 * @author Diego
 */
public class Correo {
    private boolean leido;
    private int numC;
    private String nombre;

    public Correo() {
        leido = false;
    }

    public Correo(int numC, String nombre, boolean leido) {
        this.numC = numC;
        this.nombre = nombre;
        this.leido = leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLeido() {
        return leido;
    }

    public int getNumC() {
        return numC;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Correo{" + "leido=" + leido + ", numC=" + numC + ", nombre=" + nombre + '}';
    }
    
}
