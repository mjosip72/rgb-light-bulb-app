package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Objects;

public class AppLauncher extends Application {

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) throws Exception {

        Font.loadFont(AppLauncher.class.getResourceAsStream("/main/Roboto-Regular.ttf"), 16);

        FXMLLoader loader = new FXMLLoader(AppLauncher.class.getResource("/main/app.fxml"));
        loader.setController(App.instance);
        Scene scene = loader.load();

        stage.setScene(scene);
        stage.setTitle(App.TITLE);
        stage.setOnCloseRequest(e -> App.instance.onClose());

        Image icon = new Image(Objects.requireNonNull(AppLauncher.class.getResourceAsStream("/main/icon.png")));
        stage.getIcons().add(icon);

        stage.show();

    }
}
