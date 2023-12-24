package Users;

import com.example.demo2.DBConnector;
import com.example.demo2.HelloApplication;
import com.example.demo2.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Registration {
    public TextField login;
    @FXML
    private TextField name;

    @FXML
    private PasswordField password;

    @FXML
    protected void registrationButtonClick() throws IOException {
            //DBConnector.connect();
            if(DBConnector.RegisterUser(login.getText(),password.getText(),name.getText()) != null){
                login.getScene().getWindow().hide();
                entry();
            }
    }

    public void entry() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setTitle("Вход");
        stage.setScene(scene);
        stage.show();
    }



    public void backbutton(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 580, 440);
        stage.setTitle("Вход");
        stage.setScene(scene);
        stage.show();
        name.getScene().getWindow().hide();
    }
}
