package controller;

import javafx.event.Event;
import model.Main;

public class MainMenuController {
    public void initialize(){

    }

    public void btnHandleFindAutocamper(Event e){
        Main.setCenterPane(Main.autocamperList);
    }
}
