/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class ShoeFXMain extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        
        initRootLayout();
        
        showMainChart();
    }
    
    public void initRootLayout(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("view/MainDialog.fxml"));
            rootLayout = (BorderPane)loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            
            primaryStage.show();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void showMainChart(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("view/test.fxml"));
            AnchorPane anchorPane = (AnchorPane)loader.load();
            
            rootLayout.setCenter(anchorPane);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
