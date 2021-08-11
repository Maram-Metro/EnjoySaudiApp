
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
 * @author Mero
 */
public class LoginController implements Initializable {

    @FXML 
    private void login(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("loginuser.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    @FXML 
    private void signin(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("creatuser.fxml"));
        Scene back = new Scene(Back);
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(back);
        stage.setTitle("ENJOY");
    }
    
    @FXML 
    private void skip(MouseEvent e) throws IOException {
        Parent Back = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
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
