import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Frame {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Game Window");
        frame.setSize(1024,576);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
