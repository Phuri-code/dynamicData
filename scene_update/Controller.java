package scene_update;

import java.net.URL;
import java.util.ResourceBundle;
import global.Global;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    void on_updateSave(ActionEvent event) throws Exception {
        var new_data = input_update.getText();
        Global.list.set(Global.selected_Index, new_data);

        var node = (Node) event.getSource();
        var stage = (Stage) node.getScene().getWindow();
        
        var view_main = getClass().getResource("../scene_main/View.fxml");
        var controller_main = new scene_main.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_main);
        loader.setController(controller_main);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void initialize() {
    //    var seleted = Global.list.get(Global.selected_Index);
    //     input_update.setText(seleted);
    }

}
