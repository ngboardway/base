import javax.swing.*;
import java.awt.*;

public class PowerUp extends Collectable {
    public PowerUp(int x, int y) {
        super(x, y, 50, new ImageIcon("images/powerup.png").getImage());
    }
}