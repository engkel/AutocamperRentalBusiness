package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import model.Main;
import model.ProgramFacadeController;

public class AutocamperListController {
    private ProgramFacadeController pl = ProgramFacadeController.getInstance();

    /**
     * This gridpane reference will be necessary for information about existing autocampers in the DB.
     * Plan is to query database for the autocampers, and then assign the necessary information in the gridpane, for
     * each autocamper.
     */
    @FXML
    public GridPane autocamperList;

    public void initialize(){
        // perform DB queries to obtain the available autocampers, and then assign them to the GridPane autocamperList
    }

    public void btnHandleReserve(Event e ){
        Main.setCenterPane(Main.confirmReservation);
    }
}
