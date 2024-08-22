/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

public class Alimetos {
    private String animal;
    private String horario;
    private String alimentos;
    private String frecuencia;

    public Alimetos(String animal, String horario, String alimentos, String frecuencia) {
        this.animal = animal;
        this.horario = horario;
        this.alimentos = alimentos;
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "" + "Animal: " + animal + "  su horario es: " + horario + "\n"
                + "los alimentos son: " + alimentos + "\n"
                + "la frecuencia es: " + frecuencia + "\n" + "---------------------------";
    }
    
    

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String alimentos) {
        this.alimentos = alimentos;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    
}
