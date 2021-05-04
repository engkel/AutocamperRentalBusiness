import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    Pane menuPane = new Pane();
    Scene mainScene = new Scene(menuPane, 600, 400);

    public static void main(String[] args) {
	  launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Autocamper Secretary Software");
        stage.setScene(mainScene);
        stage.show();
    }
}
