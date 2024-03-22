/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;

import static java.lang.Character.toUpperCase;

/**
 *
 * @author LabSispc04
 */
public class persona {
    private String nombe;
    private int edad;
    private int cedula;
    private char sexo;
    private float peso;
    private float altura;

    public persona() {
    }

    public persona(String nombe, int edad, char sexo) {
        this.nombe = nombe;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = 123456;
        this.peso = 60;
        this.altura = (float)1.80;
    }
    
    public float calcular (float peso, float altura){
        float peso_ideal = (float)(peso / (Math.pow(altura, 2)));
        if (peso_ideal <20){
            return -1;
        }else{
            if(peso_ideal>=20 && peso_ideal <=25){
                return 0;
            }else{
                return 1;
            }
        }
    }
    public boolean mayor_edad (int edad){
        if(edad<18){
            return false;
        }else {
            return true;
        }
    }
    public char comprobarSexo(char sexo){
        if  (toUpperCase(sexo)== 'H' || toUpperCase(sexo)== 'M' ){
            return sexo;
        }else {
            System.out.println("sexo incorrecto");
            return 'H';
        }
    }
    public int generar_celdula (int cedula){
        cedula= (int)(Math.random()*10);
        return cedula;
    }

    public String getNombe() {
        return nombe;
    }

    public int getEdad() {
        return edad;
    }

    public int getCedula() {
        return cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "persona{" + "nombe=" + nombe + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    
    
}
