// public class DollarsToPounds {
    
// }

import javafx.application.Application ; // 1
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane; //2
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Vbox ; //3
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.stage.Stage;

  public class DollarsToPounds extends Application { // Application

      final static double EXCHANGE_RATE = 0.81;

      public void start (Stage stage) { // 5 6

      Label valueLbl = new Label(____7_____);

      Label poundsLbl = new Label();

      TextField dollarsTxt = new TextField(); // 7 8

      Button exchngeBtn = new Button();

      exchangeBtn.setText(event)); // 10 11 12

      _______13______(____14_____ { // 13 14
         String dollarsStr = ______15______.toString();
         try {
              double dollars = Double.parseDouble(dollarsStr);
              double pounds = ____16_____(dollars);
              poundsLbl.setText(String.format("%.2f", pounds));
             } catch (NumberFormatException e) {
                    Alert a = new ____18____(___19_____); // 17
                    alert.setTitle("Error"); // // 20
                     a.setHeaderText("Invalid Dollar Amount");
                     a.setContentText("Please only use digits.");
                     a.showAndWait();
            }
        });

        Vbox input = new Vbox(); // 21 22 i dont know
        input.setAlignment(Pos.CENTER);
        input.getChildren().addAll(valueLbl, dollarsTxt);

        _____25_____ root = new ____26____(); // 25 26
        root.setAlignment(Pos.CENTER);
        root.setSpacing(8);
        root.getChildren().addAll(input, exchangeBtn, poundsLbl);

        Scene scene = new Scene(root, 400, 400);
        Stage.setTitle("Dollars to Pounds");
        stage.setScene(scene);
        stage.show();

    }

    private double exchange(double dollars) {
       return dollars* EXCHANGE_RATE;
    }
}

