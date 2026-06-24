package scene_delete;

import java.net.URL;
import java.util.ResourceBundle;

import global.Global;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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
    void on_No(ActionEvent event) throws Exception{

        var node = (Node) event.getSource();
        var stage = (Stage) node.getScene().getWindow();

        var view_No = getClass().getResource("../scene_main/View.fxml");
        var controller_No = new scene_main.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_No);
        loader.setController(controller_No);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void on_Yes(ActionEvent event) throws Exception {
        
        Global.list.remove(Global.selected_Index);

        var node = (Node) event.getSource();
        var stage = (Stage) node.getScene().getWindow();
        
        var view_Yes = getClass().getResource("../scene_main/View.fxml");
        var controller_Yes = new scene_main.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_Yes);
        loader.setController(controller_Yes);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void initialize() {
       
    }

}
