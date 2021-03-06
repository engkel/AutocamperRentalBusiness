package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static StackPane centerPane;
    public static Parent root, addCustomer, addReservation, removeCustomer, removeReservation;

    public static void setCenterPane(Parent ui) {
        if(!centerPane.getChildren().isEmpty()){
            centerPane.getChildren().set(0,ui);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        addCustomer = FXMLLoader.load(getClass().getResource("/view/add-customer.fxml"));
        addReservation = FXMLLoader.load(getClass().getResource("/view/add-reservation.fxml"));
        removeCustomer = FXMLLoader.load(getClass().getResource("/view/remove-customer.fxml"));
        removeReservation = FXMLLoader.load(getClass().getResource("/view/remove-reservation.fxml"));
        root = FXMLLoader.load(getClass().getResource("/view/background.fxml"));

        // for some reason the program works better without this
        //Application.setUserAgentStylesheet(getClass().getResource("/view/program.css").toExternalForm());

        primaryStage.setTitle("Autocamper Secretary Software");
        primaryStage.setScene(new Scene(root, 950, 800));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
