package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.ProgramFacadeController;

/**
 * Controller for adding new customers
 */
public class AddCustomerController {
    private ProgramFacadeController pfc = ProgramFacadeController.getInstance();

    @FXML
    TextField txtfldFullName,txtfldPhoneNumber,txtfldAddress,txtfldEmail;

    public void initialize(){

    }

    public void btnHandleConfirm(Event e){

    }
}
