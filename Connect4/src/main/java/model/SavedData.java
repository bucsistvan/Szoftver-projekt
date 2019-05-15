package model;

/**
 * Azokat az adatokat tartalmazza, melyek lementünk a játék mentése folyamán.
 */
public class SavedData {
    private boolean player;
    private float width;
    private float height;
    private float border;
    private float top;
    private int menuwidth;
    private int menubuttonheight;
    private int menuheight;
    private int[][] CirclesColor;

    public SavedData(){
        CirclesColor=new int[7][6];
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBorder() {
        return border;
    }

    public void setBorder(float border) {
        this.border = border;
    }

    public float getTop() {
        return top;
    }

    public void setTop(float top) {
        this.top = top;
    }

    public boolean isPlayer() {
        return player;
    }

    public void setPlayer(boolean player) {
        this.player = player;
    }

    public int[][] getCirclesColor() {
        return CirclesColor;
    }

    public void setCirclesColor(int[][] circlesColor) {
        CirclesColor = circlesColor;
    }

    public int getMenuwidth() {
        return menuwidth;
    }

    public void setMenuwidth(int menuwidth) {
        this.menuwidth = menuwidth;
    }

    public int getMenubuttonheight() {
        return menubuttonheight;
    }

    public void setMenubuttonheight(int menubuttonheight) {
        this.menubuttonheight = menubuttonheight;
    }

    public int getMenuheight() {
        return menuheight;
    }

    public void setMenuheight(int menuheight) {
        this.menuheight = menuheight;
    }
}
