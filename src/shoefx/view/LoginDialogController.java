/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoefx.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import shoefx.CSSExample;
import shoefx.ShoeFX;

/**
 *
 * @author user
 */
public class LoginDialogController {
    @FXML
    private TextField txtUsername;
    
    @FXML
    private PasswordField txtPassword;
    
    @FXML
    private Button btnLogin;
    
    private ShoeFX shoeFx;
    private boolean loginOK = false;
    private Stage dialogStage;
    
    public void setShoeFX(ShoeFX shoeFX){
        this.shoeFx = shoeFX;
    }
    
    public void setStage(Stage dialogStage){
        this.dialogStage = dialogStage;
    }
    
    @FXML
    private void initialize(){
        
    }
    
    @FXML
    private void onClickBtnLogin(){
//        if(shoeFx.primaryStage != null){
//            System.out.print("Stage : "+this.dialogStage.getTitle());
//        }else{
//            System.out.print("Stage : NULL");
//        }
        if(txtUsername.getText().equals("admin") && txtPassword.getText().equals("admin")){
            try {
                this.dialogStage.close();
                CSSExample cssexam = new CSSExample();
                    dialogStage.close();
                    cssexam.start(dialogStage);
                    //cssexam.greeting = "Gerry";
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(getClass().getResource("view/test.fxml"));
//                Parent root1 = (Parent) fxmlLoader.load();
//                Stage stage = new Stage();
//                stage.setScene(new Scene(root1));  
//                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
        }
    }
}
