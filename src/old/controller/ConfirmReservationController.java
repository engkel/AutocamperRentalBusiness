package old.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.ProgramFacadeController;

public class ConfirmReservationController {
    private ProgramFacadeController pl = ProgramFacadeController.getInstance();

    @FXML
    public Label autocamperId;

    /**
     * Reservation start date and end date
     */
    @FXML
    public DatePicker startDate,endDate;

    /**
     * Customer detail input fields
     */
    @FXML
    public TextField txtfldName,txtfldPhoneNumber,txtfldAddress,txtfldEmail;


    public void initialize(){

    }

    public void btnHandleConfirmReservation(Event e){
        String startDate = this.startDate.getValue().toString();
        String endDate = this.endDate.getValue().toString();
        int autocamperId = Integer.parseInt(this.autocamperId.getText());

        //pl.createReservation(startDate,endDate,autocamperId);
    }
}
