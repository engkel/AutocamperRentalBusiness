package controller;

import javafx.event.Event;
import model.Main;
import model.ProgramFacadeController;

public class AutocamperListController {
    private ProgramFacadeController pl = ProgramFacadeController.getInstance();

    public void initialize(){

    }

    public void btnHandleReserve(Event e ){
        Main.setCenterPane(Main.confirmReservation);
    }
}
