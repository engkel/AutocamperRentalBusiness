package controller;

import javafx.event.Event;
import model.Main;
import model.ProgramLogic;

public class AutocamperListController {
    private ProgramLogic pl = ProgramLogic.getInstance();

    public void initialize(){

    }

    public void btnHandleReserve(Event e ){
        Main.setCenterPane(Main.confirmReservation);
    }
}
