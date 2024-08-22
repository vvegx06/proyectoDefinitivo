/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author gaort
 */
public class Habitat {

    private String nombre;
    private String tipoAmbiente;
    private int capacidad;

    public Habitat(String nombre, String tipoAmbiente, int capacidad) {
        this.nombre = nombre;
        this.tipoAmbiente = tipoAmbiente;
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString() {
        return "" + "El nombre del habitat es: " + nombre + "\n"
                + "Su ambiente es: " + tipoAmbiente + "\n"
                + "Con capacidad de: " + capacidad + "\n"
                + "\n" + "--------------------------";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
   

}
