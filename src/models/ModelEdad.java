/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Zeo
 */
public class ModelEdad {
    private int anio_nacimiento = 0;
    private String mensaje = "";

    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }
    
    public String validarEdad1(){
        int edad = 2018 - anio_nacimiento;
        if (edad >= 18)
            return "Eres mayor de edad";
        else
            return "Eres menor de edad";
    }
    
    public String validarEdad2(){
        String mensaje = "";
        int edad = 2018 - anio_nacimiento;
        if(edad >= 18)
            mensaje = "Eres mayor de edad";
        else
            mensaje = "Eres menor de edad";
        return mensaje;
    }
    
    public String validarEdad3(){
        String mensaje = "";
        if ((2018 - anio_nacimiento) >= 18) 
            mensaje = "Eres mayor de edad";
        else
            mensaje = "Eres menor de edad";
        return mensaje;
    }
    
    public void validarEdad4(){
        if((2018 - anio_nacimiento) >= 18)
            mensaje = "Eres mayor de edad";
        else
            mensaje = "Eres menor de edad";
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
