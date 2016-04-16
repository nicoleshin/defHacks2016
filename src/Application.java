import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Application extends JFrame {

    public static final String SEPARATOR = System.getProperty("file.separator");
    private Blob blob;
    
    long startTime;
    
    public Application() {
        startTime = System.currentTimeMillis();
        setScreen();
        blob = new Blob();
        blob.setSprite("img/circle.jpg");
    }

    public void setScreen() {
        setSize(1024,768);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public int getTimeSeconds() {
        long currTime = System.currentTimeMillis();
        return (int) (currTime - startTime) * 1000;
    }

}
