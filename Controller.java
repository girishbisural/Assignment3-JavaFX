import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputField;
    @FXML
    private Label resultLabel;
    @FXML
    private Button submitButton;

    @FXML
    public void handleSubmit() {
        String input = inputField.getText();
        String result = Model.processInput(input);
        resultLabel.setText(result);
    }
}
