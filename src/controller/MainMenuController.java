package controller;

import javafx.event.Event;
import model.Main;
import model.ProgramLogic;

public class MainMenuController {
    private ProgramLogic pl = ProgramLogic.getInstance();


    public void initialize(){

    }

    public void btnHandleFindAutocamper(Event e){
        Main.setCenterPane(Main.autocamperList);
    }
}
