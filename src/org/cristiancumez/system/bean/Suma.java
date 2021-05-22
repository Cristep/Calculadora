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

public class Suma extends Operaciones {
    
    @Override
    public float operar(float num1, float num2){
        this.setNum1(num1);
        this.setNum2(num2);
        this.setOperador('+');
        this.setResultado(this.getNum1() + this.getNum2());
        return this.getResultado();
    
    
    }

  
       
}
