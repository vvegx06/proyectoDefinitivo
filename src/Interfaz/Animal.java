/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 *
 */
public class Animal {

    //Atributos 
    private String nombre;
    private String especie;
    private int edad;
    private String habitat;
    
    //Constructor

    public Animal(String nombre, String especie, int edad, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.habitat = habitat;
        
        
    }
    //tostring
    @Override
    public String toString() {
        return "" + "El nombre del animal es: " + nombre + "\n"
                + "La edad del animal es: " + edad + "\n"
                + "La especie del animal es: " + especie + "\n"
                + "El habitat del animal es: " + habitat + "\n"
                + "\n" + "--------------------------------------";
    }
    //Setter, getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

   

    


}