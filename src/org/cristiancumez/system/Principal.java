
package org.cristiancumez.system;

import java.awt.Dimension;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import org.cristiancumez.system.bean.Suma;


/**
 *
 * @author Cristian Noe Cumez Morales 
 * @date 23/04/2021
 * @time 10:50:07 PM
 * 
 */

public class Principal extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
      
    
    }
    

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/FXMLView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);        
        stage.setResizable(false);
        stage.setTitle("Calculadora - Cristian Cumez");                
        stage.show();
       
        
        
        
      
         
    }
   
   
    
}
