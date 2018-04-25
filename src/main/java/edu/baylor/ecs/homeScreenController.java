package edu.baylor.ecs;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class homeScreenController extends MasterWindow implements Initializable{

    @FXML
    private Button coopButton,howToPlayButton,settingButton,exitButton;



    public homeScreenController(){
        System.out.println("Created home");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        defaultInit();
    }

    public void coopAction(ActionEvent event) throws IOException {
        System.out.println("User press Co-op");

        this.connectToSingle();
        setWindow((Stage)((Node)event.getSource()).getScene().getWindow());
        getWindow().setScene(getCurrentScene());
        getWindow().show();
    }

    public void howToPlayAction(ActionEvent event) throws IOException {
        System.out.println("User press Multiplayer");

        this.connectHowToPlay();
        setWindow((Stage)((Node)event.getSource()).getScene().getWindow());
        getWindow().setScene(getCurrentScene());
        getWindow().show();
    }

    public void settingAction(ActionEvent event) throws IOException {
        System.out.println("User press Settings");

        this.connectToSetting();
        setWindow((Stage)((Node)event.getSource()).getScene().getWindow());
        getWindow().setScene(getCurrentScene());
        getWindow().show();
    }

    public void closeProgram(ActionEvent event){
        super.closeProgram(getWindow());
    }

}
