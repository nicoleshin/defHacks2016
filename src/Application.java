import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Application extends JFrame {

    public static final String SEPARATOR = System.getProperty("file.separator");
    private Blob blob;
    
    private int max_xcoor;
    private int max_ycoor;
    private int min_xcoor;
    private int min_ycoor;

    long startTime;
    
    public Application() {
        max_xcoor = 1024;
        max_ycoor = 768;
        min_xcoor = 0;
        max_ycoor = 0;
        startTime = System.currentTimeMillis();
        setScreen();
        blob = new Blob();
        blob.setSprite("img/circle.jpg");
    }

    public void setScreen() {
        setSize(max_xcoor, max_ycoor);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public int getTimeSeconds() {
        long currTime = System.currentTimeMillis();
        return (int) (currTime - startTime) * 1000;
    }

    public int getMaxX() {
        return max_xcoor;
    }

    public int getMaxY() {
        return max_ycoor;
    }

    public int getMinX() {
        return min_xcoor;
    }

    public int getMinY() {
        return min_ycoor;
    }
}
