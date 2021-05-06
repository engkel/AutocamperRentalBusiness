package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import model.Main;
import model.ProgramFacadeController;

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

    public void initialize(){
        Main.centerPane = centerPane;
        Main.centerPane.getChildren().add(Main.addReservation);
    }

    public void btnHandleAddReservation(Event e){
        Main.setCenterPane(Main.addReservation);
    }

    public void btnHandleRemoveReservation(Event e){
        Main.setCenterPane(Main.removeReservation);
    }

    public void btnHandleAddCustomer(Event e){
        Main.setCenterPane(Main.addCustomer);
    }

    public void btnHandleRemoveCustomer(Event e){
        Main.setCenterPane(Main.removeCustomer);
    }

}
