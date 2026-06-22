package scene_main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<?> listview;

    @FXML
    private Label status;

    @FXML
    void on_create(ActionEvent event) {

    }

    @FXML
    void on_delete(ActionEvent event) {

    }

    @FXML
    void on_read(ActionEvent event) {

    }

    @FXML
    void on_update(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert listview != null : "fx:id=\"listview\" was not injected: check your FXML file 'View.fxml'.";
        assert status != null : "fx:id=\"status\" was not injected: check your FXML file 'View.fxml'.";

    }

}
