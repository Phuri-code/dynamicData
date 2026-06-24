package scene_update;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField input_update;

    @FXML
    private Button saveUpdate;

    @FXML
    void on_updateSave(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert input_update != null : "fx:id=\"input_update\" was not injected: check your FXML file 'View.fxml'.";
        assert saveUpdate != null : "fx:id=\"saveUpdate\" was not injected: check your FXML file 'View.fxml'.";

    }

}
