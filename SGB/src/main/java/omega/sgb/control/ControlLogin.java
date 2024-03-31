package omega.sgb.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import omega.sgb.App;
import omega.sgb.dominio.Cuenta;

import java.io.IOException;

public class ControlLogin {

    public String css = this.getClass().getResource("/gui/app.css").toExternalForm();
    //public Cuenta cuenta = new Cuenta();
    public Cuenta cuenta = new Cuenta();
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Label LabelPostQuery;
    @FXML
    TextField Usuariotxtbox;
    @FXML
    PasswordField Contraseñatxtbox;

    @FXML
    public void IniciarSesion(ActionEvent event) throws IOException {
        String Usuario = Usuariotxtbox.getText();
        String Contraseña = Contraseñatxtbox.getText();
        Boolean LoginKey = false;
    //  SQL.login(Usuario,Contraseña);
        if(Usuario.equals("a")&&Contraseña.equals("b")){
            LabelPostQuery.setText("EXITO");
        }
        else{
            LabelPostQuery.setText("Usuario y/o contraseña incorrectos");
        }
    }

    public void toPantallaCrearCuenta(ActionEvent event) throws IOException {
        App app = new App();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/omega/sgb/view/crearcuenta-view.fxml"));
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("/omega/sgb/view/nada.fxml"));
        root = loader.load();
        stage = ((Stage) ((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}
