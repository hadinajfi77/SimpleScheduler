/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsimpleplanner;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author hadin
 */
public class JavaFXSimplePlanner extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("TabbedLayout.fxml"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("tabbeddlayout.css").toExternalForm());
        primaryStage.setTitle("Teyhu Simple Planner");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
