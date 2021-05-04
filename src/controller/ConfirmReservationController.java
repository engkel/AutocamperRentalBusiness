package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import model.Reservation;

public class ConfirmReservationController {
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

        if(Reservation.checkAvailability(startDate,endDate,autocamperId))
        {
            Reservation.addReservation(startDate,endDate,autocamperId);
        }
    }
}
