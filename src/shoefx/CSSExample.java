/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoefx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
/**
 *
 * @author arief
 */
public class CSSExample extends Application{
String nameFont = "Comic Sans MS",greeting;
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Memanggil class lain,
        //agar class tersebut dapat diberikan perintah tertentu
        ShoeFX formfx = new ShoeFX();
       
        //Menghentikan penampilan window form login awal
        formfx.stop();
       
        //Membuat komponen Text
        final Text txtTarget = new Text();
        txtTarget.setId("teks");
       
        Button cetak = new Button("Print");
        cetak.setFont(Font.font(nameFont));
        cetak.setOnAction((ActionEvent event) -> {
           
        //Mengisi komponen Text dengan tulisan "CSS Example Window"
        txtTarget.setText("HELLO "+greeting.toUpperCase()+" !");
        txtTarget.setFont(Font.font(nameFont,FontWeight.NORMAL,32));
           
        //Memberikan warna pada huruf atau tulisan yang ada pada komponen teks
        txtTarget.setFill(Color.FIREBRICK);
        });
       
        Button balik = new Button("Back");
        balik.setFont(Font.font(nameFont));
        balik.setOnAction((ActionEvent event) -> {
            //Menghentikan penampilan window CSS Example
            primaryStage.close();
           
            //Menampilkan form login awal
            formfx.start(primaryStage);
        });
       
        //Membuat Button dengan teks "close"
        Button cls = new Button("Close");
       
        //Menetapkan huruf yang dipakai pada teks button.
        cls.setFont(Font.font(nameFont));
       
        //Membuat Aksi untuk Button
        cls.setOnAction((ActionEvent event)->{
            //Menutup window
           primaryStage.close();
        });
       
        //Membuat Horizontal Box dengan jarak antar komponen sebesar 10
        HBox hbox = new HBox(10);
       
        //Memosisikan HBox di bagian bawah-tengah
        hbox.setAlignment(Pos.BOTTOM_CENTER);
       
        //Mengisi HBox dengan komponen lain, berupa Button
        //Bisa juga menggunakan hbox.getChildren().addAll(nama komponen-komponen)
        hbox.getChildren().add(cetak);
        hbox.getChildren().add(balik);
        hbox.getChildren().add(cls);
       
        //Membuat layout StackPane
        StackPane pane = new StackPane();
       
        //Untuk amannya ketika edit interface dengan CSS
        //lebih baik menggunakan ID untuk setiap komponen
        pane.setId("layout"); //ID untuk komponen layout StackPane
       
        //Menambahkan komponen Text dan Horizontal Box pada layout StackPane
        //bisa juga menggunakan pane.getChildren().addAll(nama komponen-komponen)
        pane.getChildren().addAll(txtTarget);
        pane.getChildren().add(hbox);
       
        //Menempatkan layout pada windo ukuran x=300,y=250
        Scene scene = new Scene(pane, 300, 250);
        //scene.getStylesheets().add(CSSExample.class.getResource("asset/Login.css").toExternalForm());
        primaryStage.setTitle("CSS Example");
        primaryStage.setScene(scene);
       
        primaryStage.setX(484);
        primaryStage.setY(256);
        primaryStage.show();
    }
   
}