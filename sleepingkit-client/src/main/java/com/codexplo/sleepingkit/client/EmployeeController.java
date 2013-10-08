package com.codexplo.sleepingkit.client;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * User: Bazlur Rahman Rokon
 * Date: 10/8/13 - 11:11 AM
 */
public class EmployeeController {
    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @FXML
    private Parent employeeRoot;
    @FXML
    private TextField firstNameField;

    public Parent getEmployeeRoot() {
        return employeeRoot;
    }

    public void clear() {

    }

}
