package chapter_20;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem7 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TitlePage.fxml"));
        Scene scene = new Scene(root, 1280, 720);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void hangman() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Apple", "Oranges", "Hangman", "Pig", "Goat", "Cheese", "Bruh"));



    }
}


