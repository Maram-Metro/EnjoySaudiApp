
package enjoy;

import java.io.IOException;
import java.net.URL;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alaa
 */
public class TourismDestinationsController implements Initializable {

    @FXML
    private ComboBox combo;
    
    @FXML 
    private void moveHome(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    @FXML 
    private void moveRiyadh(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("Riyadh.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    @FXML 
    private void moveJeddah(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("jaddah.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    @FXML 
    private void moveTabok(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("tbok.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("Taif","Abha","Umluj","Al-Qassim","AL-Riyadh","Jeddah","Tabuk");      
       combo.setItems(list);
}
}
