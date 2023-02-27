package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Controller {

    public Button ExitBT;
    public Button ResetBT;
    public Label Message;
    public Label CountryName;
    @FXML
    private Button ArgentinaBT;

    @FXML
    private Button GermanyBT;

    @FXML
    private Button LesothoBT;

    @FXML
    private Button NetherlandsBT;

    @FXML
    private Button SpainBT;

    @FXML
    private Rectangle rectangle1;

    @FXML
    private Rectangle rectangle2;

    @FXML
    private Rectangle rectangle3;

    @FXML
    void DisplayGermanyFlag(ActionEvent event) {

        rectangle1.setFill(Color.BLACK);
        rectangle2.setFill(Color.RED);
        rectangle3.setFill(Color.YELLOW);

        Message.setText("We love you, when life gets too hard to stand, it's not the end of life. MAY GOD PROTECT YOU");

        CountryName.setText("GERMANY");
    }

    public void DisplayLesothoFlag(ActionEvent event) {

        rectangle1.setFill(Color.BLUE);
        rectangle2.setFill(Color.WHITE);
        rectangle3.setFill(Color.GREEN);

        Message.setText("All Basotho love and support Ukraine with all their hearts ");

        CountryName.setText("LESOTHO");
    }

    public void DisplaySpainFlag(ActionEvent event) {

        rectangle1.setFill(Color.RED);
        rectangle2.setFill(Color.YELLOW);
        rectangle3.setFill(Color.RED);

        Message.setText("Ukraine is in our hearts");

        CountryName.setText("SPAIN");
    }

    public void DisplayArgentinaFlag(ActionEvent event) {

        rectangle1.setFill(Color.SKYBLUE);
        rectangle2.setFill(Color.WHITE);
        rectangle3.setFill(Color.SKYBLUE);

        Message.setText("God's plan to you will never be easy to understand, but it is worth it.. TRUST GOD");

        CountryName.setText("ARGENTINA");
    }

    public void DisplayNetherlandsFlag(ActionEvent event) {
        rectangle1.setFill(Color.RED);
        rectangle2.setFill(Color.WHITE);
        rectangle3.setFill(Color.BLUE);

        Message.setText("Sending love and light to Ukraine And Russia");

        CountryName.setText("NETHERLANDS");
    }


    public void CloseWindow(ActionEvent event) {

        Stage exit = (Stage) ExitBT.getScene().getWindow();
        exit.close();
    }

    public void Refresh(ActionEvent event) {
        rectangle1.setFill(Color.TRANSPARENT);
        rectangle2.setFill(Color.TRANSPARENT);
        rectangle3.setFill(Color.TRANSPARENT);
        Message.setText("");
        CountryName.setText("");
    }
}
