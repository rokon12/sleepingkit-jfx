package com.codexplo.sleepingkit.client;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * User: Bazlur Rahman Rokon
 * Date: 10/8/13 - 12:02 PM
 */
public class SleepingKitCalculatorController implements Initializable {

    @FXML
    private Parent sleepingkitRoot;
    @FXML
    private ComboBox<Integer> hour;
    @FXML
    private ComboBox minute;
    @FXML
    private ComboBox ampm;

    public Parent getRoot() {
        return sleepingkitRoot;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Integer> hours = new ArrayList<Integer>();
        for (int i = 1; i <= 12; i++) hours.add(i);
        ObservableList<Integer> observableHoursList = FXCollections.observableList(hours);
        hour.setItems(observableHoursList);

        List<Integer> minutes = new ArrayList<Integer>();
        for (int i = 0; i <= 59; i += 5) minutes.add(i);
        ObservableList<Integer> observableMinuteList = FXCollections.observableList(minutes);
        minute.setItems(observableMinuteList);

        List<String> ampms = new ArrayList<String>() {{
            add("AM");
            add("PM");
        }};
        ObservableList<String> observableAmPmList = FXCollections.observableList(ampms);
        ampm.setItems(observableAmPmList);

    }

    public void calculate() {

    }
}
