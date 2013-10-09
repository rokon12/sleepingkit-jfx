package com.codexplo.sleepingkit.client.controller;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: Bazlur Rahman Rokon
 * Date: 10/9/13 - 4:45 AM
 */
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    @FXML
    private Parent root;
    @FXML
    private TextField userNameField;
    @FXML
    private TextField passwodField;
    @FXML
    private Label userNameLabel;
    @FXML
    private Label passwordLabel;

    public Parent getRoot() {
        return root;
    }


    public void signIn() {
        log.debug("signIn()");
        if (!hasError()) {

        }
    }

    private boolean hasError() {
        log.debug("hasError()");
        boolean hasError = false;
        if (userNameField.getText().isEmpty()) {
            userNameField.setPromptText("User Name is required");
            userNameLabel.setTextFill(Color.RED);
            hasError = true;
        } else {
            userNameLabel.setTextFill(Color.BLACK);
        }

        if (passwodField.getText().isEmpty()) {
            passwodField.setPromptText("Password is Required");
            passwordLabel.setTextFill(Color.RED);
            hasError = true;
        } else {
            passwordLabel.setTextFill(Color.BLACK);
        }

        return hasError;
    }

    @FXML
    void initialize() {
        log.debug("initialize()");
        assert root != null : "fx:id=\"root\" was not injected: check your FXML file 'LoginView.fxml'.";
    }
}
