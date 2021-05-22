/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristiancumez.system.bean;

/**
 *
 * @author Cristian Noe Cumez Morales 
 * @date 23/04/2021
 * @time 10:50:07 PM
 * 
 */

public abstract class Operaciones {
    
    private float num1;
    private float num2;
    private float resultado;
    private char operador;
    
    
    public Operaciones(){
    
    }

   

    public Operaciones(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
        
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }
    
    
    public abstract float operar(float num1, float num2);
    
    @Override
    public String toString(){
        return " " + this.num1+ " " + this.operador + " " + this.num2 + " = " + this.resultado;
    
    
    }

  
    
}
