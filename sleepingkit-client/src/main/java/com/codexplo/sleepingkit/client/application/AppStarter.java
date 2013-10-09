package com.codexplo.sleepingkit.client.application;

import com.codexplo.sleepingkit.client.controller.LoginController;
import com.codexplo.sleepingkit.client.factory.SleepingKitAppFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: Bazlur Rahman Rokon
 * Date: 10/9/13 - 3:42 AM
 */
public class AppStarter extends Application {
    private static Logger logger = LoggerFactory.getLogger(AppStarter.class);


    @Override
    public void start(Stage stage) throws Exception {
        buildScene(stage);
    }


    private void buildScene(Stage stage) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SleepingKitAppFactory.class);

        LoginController loginController = context.getBean(LoginController.class);

        Scene scene = new Scene(loginController.getRoot());
        scene.getStylesheets().add("/fxml/Login/LoginView.css");
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        stage.setTitle("Sleeping Kit Login");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
