import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Application extends JFrame {
    public Application() {
        init();
    }
    public void init() {
        setSize(1024,576);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
