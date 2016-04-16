import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;


public class Obstacle {
    private Image sprite;
    private ImageIcon icon;
    private double speed;

    private int[] spriteSize;
    private int[] spriteLocation;

    private Application application;
    
    public Obstacle() {
        application = new Application();
    }
    
    public double getSpeed() {
        return speed;
    }

    public Image getSprite() {
        return sprite;
    }
    
    public void setSprite(String pic) {
        pic = pic.replace("/", Application.SEPARATOR);
        if (new File(pic).exists()) {
            icon = new ImageIcon(pic);
            sprite = icon.getImage();
            icon = null;
        } else {
            System.out.println("Where that image at");
        }
    }

    public void setSpeed(int s) {
        this.setSpeed(s + (int) application.getTimeSeconds() / 5);
    }

    public void drawEntity(Graphics g) {
        g.drawImage(sprite, spriteLocation[0], spriteLocation[1], spriteSize[0], spriteSize[1], null);
    }

}
