package view;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * A játék fő menűét megjelenítő objektum.
 */
public class Menu {
    public Menu(){
    }

    /**
     * A főmenő nézetének létrehozésa.
     * @param buttons A főmenüben található gombok.
     * @return A főmenü nézetét adja vissza.
     */
    public Scene menuView(Button[] buttons,float width, float height, float border, int menuwidth, int menubuttonheight, int menuheight){
        Rectangle rectangle = new Rectangle(border,border,width-2*border,height-2*border);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        Group MainGroup = new Group(rectangle);

        Rectangle rectangle1 = new Rectangle(width/2-menuwidth/2-10,menuheight,menuwidth+20,3*menubuttonheight+40);
        rectangle1.setFill(Color.WHITE);
        rectangle1.setStroke(Color.BLACK);
        MainGroup.getChildren().add(rectangle1);

        buttons[0]=new Button();
        buttons[0].setText("Start game");
        buttons[0].setLayoutX(width/2-menuwidth/2);
        buttons[0].setLayoutY(menuheight+10);
        buttons[0].setMinWidth(menuwidth);
        buttons[0].setMinHeight(menubuttonheight);
        buttons[0].setId(Integer.toString(0));
        MainGroup.getChildren().add(buttons[0]);

        buttons[1]=new Button();
        buttons[1].setText("Load game");
        buttons[1].setLayoutX(width/2-menuwidth/2);
        buttons[1].setLayoutY(menuheight+50);
        buttons[1].setMinWidth(menuwidth);
        buttons[1].setMinHeight(menubuttonheight);
        buttons[1].setId(Integer.toString(1));
        MainGroup.getChildren().add(buttons[1]);

        buttons[2]=new Button();
        buttons[2].setText("Exit");
        buttons[2].setLayoutX(width/2-menuwidth/2);
        buttons[2].setLayoutY(menuheight+90);
        buttons[2].setMinWidth(menuwidth);
        buttons[2].setMinHeight(menubuttonheight);
        buttons[2].setId(Integer.toString(2));
        MainGroup.getChildren().add(buttons[2]);

        Scene scene = new Scene(MainGroup, width,height);
        return scene;
    }
}
