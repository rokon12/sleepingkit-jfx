package com.codexplo.sleepingkit.client.factory;

import com.codexplo.sleepingkit.client.controller.LoginController;
import javafx.fxml.FXMLLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.io.IOException;

/**
 * User: Bazlur Rahman Rokon
 * Date: 10/9/13 - 5:26 AM
 */
@Configuration
public class SleepingKitAppFactory {

    @Autowired
    private Environment env;

    @Bean
    public LoginController loginController() {
        return loadController("/fxml/Login/LoginView.fxml");
    }

    private <T> T loadController(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.load(getClass().getResourceAsStream(fxmlFile));
            return (T) loader.getController();
        } catch (IOException e) {
            throw new RuntimeException(String.format("Unable to load FXML file '%s'", fxmlFile), e);
        }
    }
}
