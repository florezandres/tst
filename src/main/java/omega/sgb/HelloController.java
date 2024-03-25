package omega.sgb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    @FXML
    Label LabelPostQuery;
    @FXML
    TextField Usuariotxtbox;
    @FXML
    PasswordField Contraseñatxtbox;

    @FXML
    protected void onHelloButtonClick() {
        LabelPostQuery.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void IniciarSesion(ActionEvent event) throws IOException {
        String Usuario = Usuariotxtbox.getText();
        String Contraseña = Contraseñatxtbox.getText();
        /*
        SQL.login(Usuario,Contraseña);
        if (SQL.login(Usuario,Contraseña)==true)
        {
            SQL.SetValues(Cuenta.Usuario);
            String Usr = cuenta.getUsuario();
            System.out.println("usr-"+Usr);
            String TipoCuenta = cuenta.getTipoCuenta();
            System.out.println("Tipo Cuenta-"+TipoCuenta);
            toMain(event, TipoCuenta);
        }
        else if(SQL.login(Usuario,Contraseña)==false){
            LabelPostQuery.setText("Nombre de usuario y/o contraseña incorrecta");
        }
        //else if(LoginKey = false) {
        else if (Usuario.equals("")){
            LabelPostQuery.setText("Ingrese un nombre de usuario");
        }
        else if (Contraseña.equals("")){
            LabelPostQuery.setText("Ingrese su contraseña");
        }
        else {
            LabelPostQuery.setText("ERROR");
        }
         */

    }
}