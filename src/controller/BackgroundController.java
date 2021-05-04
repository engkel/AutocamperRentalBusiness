package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import model.Main;

import java.io.IOException;

public class BackgroundController {
    @FXML
    public BorderPane rootPane;

    @FXML
    public StackPane centerPane;

    public void initialize() throws IOException {
        Main.centerPane = centerPane;
        Main.mainMenu = FXMLLoader.load(getClass().getResource("/view/main-menu.fxml"));
        Main.autocamperList = FXMLLoader.load(getClass().getResource("/view/autocamper-list.fxml"));
        Main.confirmReservation = FXMLLoader.load(getClass().getResource("/view/confirm-reservation.fxml"));

        Main.centerPane.getChildren().add(Main.mainMenu);
    }

    public void btnHandleMain(Event e){
        Main.setCenterPane(Main.mainMenu);
    }

    public void btnHandleLogIn(Event e){
        
    }

    public void btnHandleRegister(Event e){

    }

    public void btnHandleSupport(Event e){

    }
}
