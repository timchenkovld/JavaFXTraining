package com.example.javafxtraining;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class Controller {
    private String ua;
    private String usa;

    @FXML
    private ComboBox<String> myComboBox;

    public Controller() {
        this.ua = "UA";
        this.usa = "USA";
    }

    @FXML
    public void initialize() {
        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.addAll(ua, usa);
        myComboBox.setItems(observableList);
        myComboBox.setCellFactory(c -> new ComboBoxCell());
        myComboBox.setButtonCell(new ComboBoxCell());
        myComboBox.getSelectionModel().selectFirst();
        myComboBox.setOnAction(event1 -> System.out.println(myComboBox.getValue()));
    }
}
