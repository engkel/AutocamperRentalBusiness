package controller;

import javafx.event.Event;
import model.Main;

public class AutocamperListController {
    public void initialize(){

    }

    public void btnHandleReserve(Event e ){
        Main.setCenterPane(Main.confirmReservation);
    }
}
