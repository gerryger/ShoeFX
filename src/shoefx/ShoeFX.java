/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoefx;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import shoefx.view.LoginDialogController;

/**
 *
 * @author user
 */
public class ShoeFX extends Application {  
   String fontName = "Comic Sans MS";
    String name,password;
    
    public Stage primaryStage;
    
    public Stage getPrimaryStage(){
        return this.primaryStage;
    }
   
    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(ShoeFX.class.getResource("view/LoginDialog.fxml"));
            AnchorPane loginAnchorPane = (AnchorPane)loader.load();
            
            LoginDialogController loginController = loader.getController();
            loginController.setStage(primaryStage);
            
            Scene scene = new Scene(loginAnchorPane);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Login");
            
            primaryStage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
       
//        GridPane root = new GridPane();
//       
//        root.setAlignment(Pos.CENTER);
//        root.setHgap(10);
//        root.setVgap(10);
//        root.setPadding(new Insets(25, 25, 25, 25));
//        root.setId("grid");
//       
//        Text sceneTitle = new Text("Welcome");
//        sceneTitle.setFont(Font.font(fontName,FontWeight.NORMAL,20));
//        root.add(sceneTitle, 0, 0, 2, 1);
//       
//        Label userName = new Label("Username:");
//        userName.setFont(Font.font(fontName,FontWeight.NORMAL,12));
//        root.add(userName, 0, 1);
//       
//        TextField userBox = new TextField();
//        userBox.setFont(Font.font(fontName,FontWeight.NORMAL, 12));
//        root.add(userBox, 1, 1);
//       
//        Label pw = new Label("Password:");
//        pw.setFont(Font.font(fontName,FontWeight.NORMAL,12));
//        root.add(pw, 0, 2);
//       
//        PasswordField pwBox = new PasswordField();
//        root.add(pwBox, 1, 2);
//       
//        Button btn = new Button("Sign In");
//        btn.setFont(Font.font(fontName,FontWeight.NORMAL,12));
//       
//        Button btnClose = new Button("Close");
//        btnClose.setFont(Font.font(fontName,FontWeight.NORMAL,12));
//       
//        Separator spt = new Separator(Orientation.HORIZONTAL);
//        root.add(spt, 1, 3);
//       
//        HBox hbBtn = new HBox(10);
//        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
//        hbBtn.getChildren().addAll(btn,btnClose);
//        root.add(hbBtn,1,4);
//       
//        final Text actionTarget = new Text();
//        actionTarget.setFont(Font.font(fontName, FontWeight.NORMAL, 12));
//        root.add(actionTarget, 1, 6);
//       
//        //root.setGridLinesVisible(true);
//        //btn.setStyle("-fx-color:lightblue;");
//        //btnClose.setStyle("-fx-color:lightblue;");
//        //spt.setStyle("-fx-background:black;");
//        //root.setStyle("-fx-background:whitesmoke;");
//       
//        btn.setOnAction((ActionEvent event) -> {
//        name = userBox.getText();
//        password = pwBox.getText();
//            if (name.equals("") && password.equals("")){
//                actionTarget.setFill(Color.FIREBRICK);
//                actionTarget.setText("Username & Password field can not empty!");
//            }else if (name.equals("")){
//                actionTarget.setFill(Color.FIREBRICK);
//                actionTarget.setText("Username field can not empty!");
//               
//            }else if (password.equals("")){
//                actionTarget.setFill(Color.FIREBRICK);
//                actionTarget.setText("Password field can not empty!");
//               
//           }else if (name.equals("admin") && password.equals("admin")){
//                try {
//                    CSSExample cssexam = new CSSExample();
//                    primaryStage.close();
//                    cssexam.start(primaryStage);
//                    cssexam.greeting = name;
//                } catch (Exception ex) {
//                    Logger.getLogger(ShoeFX.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                   
//            }else{
//                    actionTarget.setFill(Color.FIREBRICK);
//                    actionTarget.setText("Can't open CSSExample Window");
//            }
//           
//        });
//       
//        btnClose.setOnAction((ActionEvent event) -> {
//            primaryStage.close();
//        });
//       
//       
//        Scene scene = new Scene(root, 400, 400);
//        //scene.getStylesheets().add(FormFXExample.class.getResource("asset/Login.css").toExternalForm());
//        primaryStage.setTitle("Welcome FXLogin");
//        primaryStage.setScene(scene);
//        primaryStage.setX(484);
//        primaryStage.setY(256);
//        primaryStage.show();
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
