import javax.swing.*;
import java.awt.*;

/**
 * Fruit. Controls the fruit object.
 *
 * @author Jon Griesen, Natalie Boardway, Nate Stern, Nick Reitz
 * @version Fall 2020
 */
public class Fruit extends Collectable {

    /**
     * Constructor to set the fruit's location, point value, and image icon that will be used.
     *
     * @param x x-axis location
     * @param y y-axis location
     */
    public Fruit(int x, int y) {
        super(x, y, 25, new ImageIcon("images/fruit.png").getImage());
    }

    /**
     * Getter for getting a rectangle object of the fruit. Overriding and reducing because the image
     * size is 50px but the fruit is smaller. Removing the white from being counted in the collision detection.
     *
     * @return a rectangle object of the fruit.
     */
    public Rectangle getBounds() {
        return new Rectangle(getX() + 10, getY() + 10, image.getWidth(null) - 13, image.getHeight(null) - 10);
    }
}
