package view;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * A játék fő színét megjelenítő objektum.
 */
public class MainGame {
    public MainGame(){
    }

    /**
     * Előaáálítja a játék fő színét.
     * @param buttons A játék tetején megjelenő gombok.
     * @param circles A játékban szereplő körök, melyekből 4 egyszinüt kell egymás mellé elhelyezni.
     * @param width A képernyő szélessége.
     * @param height A képernyő magassága.
     * @param border A képernyő kerete.
     * @param top A gombok által elfogalat magasság.
     * @return A játék színénak visszaadása.
     */
    public Scene mainGameView(Button[] buttons, Circle[][] circles,float width, float height, float border, float top) {
        Rectangle rectangle = new Rectangle(border, border + top, width - 2 * border, height - 2 * border - top);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        Group MainGroup = new Group(rectangle);

        float circleRadius = (width - 2 * border) / 14;
        for (int i = 0; i < 7; i++) {
            buttons[i] = new Button(Integer.toString(i));
            buttons[i].setLayoutX(border + circleRadius * 2 * (i));
            buttons[i].setLayoutY(top);
            buttons[i].setMinWidth(circleRadius * 2);
            buttons[i].setMinHeight(border);
            buttons[i].setId(Integer.toString(i));
            for (int j = 0; j < 6; j++) {
                circles[i][j] = new Circle(border + circleRadius + circleRadius * 2 * i, border + circleRadius + circleRadius * 2 * j + top, circleRadius);
                circles[i][j].setFill(Color.WHITE);
                MainGroup.getChildren().addAll(circles[i][j]);
            }
        }
        MainGroup.getChildren().addAll(buttons);


        Scene scene = new Scene(MainGroup, width, height);
        return scene;
    }

    /**
     * Azt a színt állítja elő, mely megmutatja, hogy melyik játékos nyert.
     * @param label1 Tartalmazza, hogy melyik játékos nyerte a játékot.
     * @param label2 Tartalmazza, hogy a játékoznak mit kell tenni, ha vissza akar jutnai a főmenübe.
     * @param width A képernyő szélessége.
     * @param height A képernyő magassága.
     * @param border A képernyő kerete.
     * @return A győztes nevét bemutató szín.
     */
    public Scene winnerView(Label label1, Label label2, float width, float height, float border){

        Rectangle rectangle = new Rectangle(border, border, width - 2 * border, height - 2 * border);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        Group MainGroup = new Group(rectangle);

        label1.setLayoutX(width/2-60);
        label1.setLayoutY(height/2-40);
        MainGroup.getChildren().add(label1);

        label2.setLayoutX(width/2-100);
        label2.setLayoutY(height/2-20);
        MainGroup.getChildren().add(label2);

        Scene scene = new Scene(MainGroup, width, height);
        return scene;
    }
}
