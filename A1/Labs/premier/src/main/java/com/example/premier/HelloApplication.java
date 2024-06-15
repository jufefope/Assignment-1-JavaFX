package com.example.premier;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Main application class to launch the JavaFX application.
 */
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML layout file for the main view
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-view.fxml"));
        // Create a new scene with the loaded FXML layout and set the dimensions
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        // Load the CSS file for styling the application
        scene.getStylesheets().add(HelloApplication.class.getResource("styles.css").toExternalForm());

        // Set a unique icon for the application window
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("/com/example/premier/football.png")));

        // Set the title of the application window
        stage.setTitle("Premier League Statistics");
        // Set the scene for the application window
        stage.setScene(scene);
        // Display the application window
        stage.show();
    }

    // Main method to launch the JavaFX application
    public static void main(String[] args) {
        launch();
    }
}
