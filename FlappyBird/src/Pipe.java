import java.awt.*;

public class Pipe {

    private int  posX;
    private int  posY;
    private int Width;
    private int  Height;
    private Image image;
    private int velocityX;

    boolean passed = false;

    public Pipe(int posX, int posY, int Width, int Height, Image image) {
        this.posX = posX;
        this.posY = posY;
        this.Width = Width;
        this.Height = Height;
        this.image = image;
        this.velocityX = -5;
        this.passed = false;
    }


    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        this.Width = Width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        this.Height = height;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
