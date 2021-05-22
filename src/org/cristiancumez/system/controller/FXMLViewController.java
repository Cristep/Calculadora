
package org.cristiancumez.system.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.cristiancumez.system.bean.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Noe Cumez Morales 
 * @date 23/04/2021
 * @time 10:50:07 PM
 * 
 */

public class FXMLViewController implements Initializable {

    
    private float resultado = 0;
    private float numero = 0;
    private float numero3 = 0;
    
    
    private int contadorOperadores = 0;
    private String operadorAnterior;
    private boolean ingresoNuevo = false;
    
    
    
    @FXML
    private Label num1;
    
    @FXML
    private Button btnUno;
    
    @FXML
    private Button btnDos;
    
    @FXML
    private Button btnTres;
   
    @FXML
    private Button btnCuatro;
    
    @FXML
    private Button btnCinco;
    
    @FXML
    private Button btnSeis;
    
    @FXML
    private Button btnSiete;
    
    @FXML
    private Button btnOcho;
    
    @FXML
    private Button btnNueve;
    
    @FXML
    private Button btnAC;
    @FXML
    private Button btnMasMenos;
    @FXML
    private Button btnPorcentaje;
    @FXML
    private Button btnDivision;
    @FXML
    private Button btnMultiplicacion;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btnMas;
    @FXML
    private Button btnPunto;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnCero;
    @FXML
    private Label lblProceso;
    @FXML
    private Button btnPI;
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    @FXML
    private void clickUno(ActionEvent event) {
        actualizarPantalla("1");
        
    }
    
    @FXML
    private void clickDOS(ActionEvent event) {
        actualizarPantalla("2");
       
    
    }
    
    @FXML
    private void clickTres(ActionEvent event) {
        actualizarPantalla("3");
    
    }
    
    @FXML
    private void clickCuatro(ActionEvent event) {
        actualizarPantalla("4");
    
    }
    
    @FXML
    private void clickCinco(ActionEvent event) {
        actualizarPantalla("5");
    
    }
    
    @FXML
    private void clickSeis(ActionEvent event) {
        actualizarPantalla("6");
    
    }
    
    @FXML
    private void clickSiete(ActionEvent event) {
        actualizarPantalla("7");
    
    }
    
    @FXML
    private void clickOcho(ActionEvent event) {
        actualizarPantalla("8");
    
    }
    
    @FXML
    private void clickNueve(ActionEvent event) {
        actualizarPantalla("9");
    }
    
    @FXML
    private void clickAC(ActionEvent event) {
    limpiar();
        
    
    }

    @FXML
    private void clickPorcentaje(ActionEvent event) {
        calcular("%");
    
    }

    @FXML
    private void clickDivision(ActionEvent event) {
        calcular("/");
    
    }

    @FXML
    private void clickMuktiplicacion(ActionEvent event) {
        calcular("*");
    
    }

    @FXML
    private void clickMenos(ActionEvent event) {
        calcular("-");
    
    }

    @FXML
    private void clickMas(ActionEvent event) {
        calcular("+");
       

    }

    @FXML
    private void clickPunto(ActionEvent event) {
       agregarPunto();
    }
    
    @FXML
    private void clickPi(ActionEvent event) {
        calcular("9");
        actualizacion();
    }
    
    
    
    
    @FXML
    private void clickMasMenos(ActionEvent event) {
       
       calcular("9");
       inversoAditivo();
              
       }
           
    public void agregarPunto(){
        String cadena = num1.getText();
        
        if (cadena.length() <= 0){
            num1.setText("0.");            
        } else if (!(num1.getText().contains("."))){
            actualizarPantalla(".");
        }    
                        
    }
           
    @FXML
    private void clickIgual(ActionEvent event) {
       
        calcular(this.operadorAnterior);
        num1.setText(String.valueOf(this.resultado));
       
                
    }
    
    
    @FXML
    private void clickCero(ActionEvent event) {
        actualizarPantalla("0");
    
    }
    
    public void actualizarPantalla(String digito){
       
        if(ingresoNuevo){
        
            num1.setText("");
        
        }
            num1.setText(num1.getText().concat(digito));
            ingresoNuevo = false;   
    
    }
    
    private void inversoAditivo(){
     
      num1.setText(String.valueOf(this.resultado * -1 )); 
      num1.setText(String.valueOf(this.numero3 * -1 ));  
    }
    
    private void actualizacion(){
      
       
       JOptionPane.showMessageDialog(null,"En Proximas actualizaciones :(");
                            
                            
    }
    
   
      
    public void limpiar(){
        num1.setText("");
        resultado  = 0.0f;
        numero  = 0.0f;
        contadorOperadores = 0;
        operadorAnterior = " ";
        lblProceso.setText("");
        
    }
    
    private void calcular(String operador){
        
        if(!(num1.getText().equals(""))){
        
        String strPantalla = num1.getText();
        String ttrPantalla = num1.getText();
        
        this.numero3 = Float.parseFloat(ttrPantalla);
        
        
            if(ingresoNuevo == false){
                this.numero = Float.parseFloat(strPantalla);
                contadorOperadores++;
                                      
                if(contadorOperadores == 1){
                    
                    this.resultado = numero;
                }else if (contadorOperadores >= 2){
                    Operaciones calc = null;
                    switch(this.operadorAnterior){
                        case "+":
                          
                            calc = new Suma();
                            this.resultado = calc.operar(this.resultado, this.numero);
                            this.lblProceso.setText(calc.toString());
                            break;
                           
                        case "-":
                            calc = new Resta();
                            this.resultado = calc.operar(this.resultado, this.numero);
                            this.lblProceso.setText(calc.toString());
                            break;
                    
                            
                        case "*":
                            calc = new Multiplicacion();
                            this.resultado = calc.operar(this.resultado, this.numero);
                            this.lblProceso.setText(calc.toString());
                            break;
                        
                         case "/":
                            calc = new Divicion();
                            this.resultado = calc.operar(this.resultado, this.numero);
                            this.lblProceso.setText(calc.toString());
                            break;
                            
                        
                        case "%":
                            System.out.println("Lllegamos aqui");
                            calc = new Porcentaje();
                            this.resultado = calc.operar(this.resultado, this.numero);
                            this.lblProceso.setText(calc.toString());
                            break;
                                                 
                    } 
                                               

                    num1.setText(String.valueOf(this.resultado));
                   
                  
                
                }
               
            }
            
            this.operadorAnterior = operador;
        
        }
        ingresoNuevo = true; 
             
    }

  
    
}

    