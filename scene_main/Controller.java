package scene_main;


import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listview;

    @FXML
    private Label status;

    @FXML
    void on_create(ActionEvent event) throws Exception {

        var stage = (Stage) status.getScene().getWindow();
        
        var view_create = getClass().getResource("../scene_create/View.fxml");
        var controller_cerate = new scene_create.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_create);
        loader.setController(controller_cerate);

        var scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void on_delete(ActionEvent event) {

    }

    @FXML
    void on_read(ActionEvent event) throws Exception{
        var stage = (Stage) status.getScene().getWindow();
        var file_chooser = new FileChooser();
        var selected = file_chooser.showOpenDialog(stage);

        var data = new ArrayList<String>();
        // var selected = new file(selected.toURI());
        

        for (var line: Files.readAllLines(selected.toPath())){
            data.add(line);
        }
        listview.getItems().addAll(data);

        // for(var item: data){
        //     System.out.println(item);
        // }
        
        
    }

    @FXML
    void on_update(ActionEvent event) {

    }

    @FXML
    void initialize() {
        // var data = new ArrayList<String>();
        // data.add("Apple");
        // data.add("Banana");
        // data.add("Orange");

        // listview.getItems().addAll(data);

    }

}
