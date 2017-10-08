import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class mainWindow extends JFrame {
    private JPanel panel1;
    private JButton buttonCButton;
    private JButton buttonDButton;
    private JButton buttonBButton;
    private JButton buttonAButton;

    Icon imgC = new ImageIcon("images/pen.png");


    public mainWindow() {
        setContentPane(panel1);
        buttonCButton.setIcon(imgC);
        pack();
        setVisible(true);
    }


}
