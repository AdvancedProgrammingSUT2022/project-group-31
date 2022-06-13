package civ.Controller;

import civ.Main;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;


public class LoginController {
    Cursor defaultCursor;

    public void login(MouseEvent mouseEvent) {
    }

    public void register(MouseEvent mouseEvent) {
    }

    public void toBatman(MouseEvent mouseEvent) {
        Image batmanIcon = new Image("Batman.png");
        defaultCursor = Main.scene.getCursor();
        System.out.println(defaultCursor);
        Main.scene.setCursor(new ImageCursor(batmanIcon));


    }

    public void outBatman(MouseEvent mouseEvent) {
        Main.scene.setCursor(defaultCursor);

    }
}
