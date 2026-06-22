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
    private Label label_status;

    @FXML
    private ListView<?> listview;

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
        assert label_status != null : "fx:id=\"label_status\" was not injected: check your FXML file 'View.fxml'.";
        assert listview != null : "fx:id=\"listview\" was not injected: check your FXML file 'View.fxml'.";

    }

}
