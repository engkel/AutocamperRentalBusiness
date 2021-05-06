package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.ProgramFacadeController;


/**
 * Controller for adding new reservations
 */
public class AddReservationController {
    private ProgramFacadeController pfc = ProgramFacadeController.getInstance();

    @FXML
    TextField txtfldCustomerId,txtfldAutocamperId,txtfldStartDate,txtfldEndDate,txtfldDiscountPercentage;

    public void initialize(){

    }

    public void btnHandleConfirm(Event e){
        int customerId = Integer.parseInt(txtfldCustomerId.getText());
        int autocamperId = Integer.parseInt(txtfldAutocamperId.getText());
        int discountPercentage = Integer.parseInt(txtfldDiscountPercentage.getText());
        String startDate = txtfldStartDate.getText();
        String endDate = txtfldEndDate.getText();

        pfc.createReservation(startDate,endDate,autocamperId);
    }
}
