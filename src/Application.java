import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Application extends JFrame {

    public static final String SEPARATOR = System.getProperty("file.separator");
    private Blob blob;
    
    public Application() {
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
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Application frame = new Application();
                frame.setVisible(true);
            }
        });
    }
    
}
