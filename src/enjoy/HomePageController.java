
package enjoy;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alaa
 */
public class HomePageController implements Initializable {

    @FXML 
    private void moveTourismDestinations(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("TourismDestinations.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    @FXML 
    private void moveActivities(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("activities.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    @FXML 
    private void moveTourGuides(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("tour_guides.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    @FXML 
    private void movePlanes(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("plan.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    @FXML 
    private void back (MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("biscenjoy.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
