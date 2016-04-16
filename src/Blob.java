import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.Image;
import java.io.File;

public class Blob {
    private Image sprite;
    private ImageIcon icon;
    private int[] location;

    public Blob() {
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
}
