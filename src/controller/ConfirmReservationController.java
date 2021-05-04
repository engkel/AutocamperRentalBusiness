package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import model.ProgramLogic;

public class ConfirmReservationController {
    private ProgramLogic pl = ProgramLogic.getInstance();

    @FXML
    public Label autocamperId;
    @FXML
    public DatePicker startDate,endDate;

    public void initialize(){

    }

    public void btnHandleConfirmReservation(Event e){
        long startDate = this.startDate.getValue().toEpochDay();
        long endDate = this.endDate.getValue().toEpochDay();
        int autocamperId = Integer.parseInt(this.autocamperId.getText());

        pl.createReservation(startDate,endDate,autocamperId);
    }
}
