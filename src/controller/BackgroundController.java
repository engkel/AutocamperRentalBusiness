package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import model.Main;
import model.ProgramFacadeController;

import java.io.IOException;

public class BackgroundController {
    private ProgramFacadeController pl = ProgramFacadeController.getInstance();

    /**
     * The whole UI is based upon one borderpane
     */
    @FXML
    public BorderPane rootPane;

    /**
     * The center pane, which will be changed when the user interacts with the app.
     * Take a look at the center pane of the borderpane in the "background.fxml" to
     * get a grasp of the StackPane which is inside the center pane.
     * The reason for this, is the lack of experience and I could not make it work
     * otherwise.
     */
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
