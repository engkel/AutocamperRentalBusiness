package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.ProgramFacadeController;

/**
 * Controller for removing existing reservations
 */
public class RemoveReservationController {
    private ProgramFacadeController pfc = ProgramFacadeController.getInstance();

    @FXML
    TextField txtfldCustomerId;

    public void initialize(){

    }

    public void btnHandleConfirm(Event e){

    }
}
