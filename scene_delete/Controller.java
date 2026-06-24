import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button label_no;

    @FXML
    private Button label_yes;

    @FXML
    void on_No(ActionEvent event) {

    }

    @FXML
    void on_Yes(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert label_no != null : "fx:id=\"label_no\" was not injected: check your FXML file 'View.fxml'.";
        assert label_yes != null : "fx:id=\"label_yes\" was not injected: check your FXML file 'View.fxml'.";

    }

}
