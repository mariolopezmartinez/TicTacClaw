package edu.baylor.ecs;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static edu.baylor.ecs.singlePlayer.getWinner;


public class winBoxController extends MasterWindow implements Initializable{

    @FXML
    private Label winnerLabel;

    @FXML
    private ImageView image;

    @FXML
    private Button backHomeButton,exitButton;

    private Image confetti = new Image("/confetti.png");


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        getWindow().setMinWidth(450);
        getWindow().setMaxWidth(550);

        getWindow().setMinHeight(450);
        getWindow().setMaxHeight(550);

        getWindow().setWidth(500);
        getWindow().setHeight(500);

        if(getWinner())
            winnerLabel.setText("Looks like O won!");
        else
            winnerLabel.setText("Looks like X won!");

        image.setImage(confetti);
    }

    public void backToHome(ActionEvent event) throws IOException{
        this.connectToHome();
        setWindow((Stage)((Node)event.getSource()).getScene().getWindow());
        getWindow().setScene(getCurrentScene());
        getWindow().show();
    }

    public void closeProgram(ActionEvent event){
        super.closeProgram(getWindow());
    }
}