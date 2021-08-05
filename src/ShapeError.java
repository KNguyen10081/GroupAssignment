import javax.swing.*;
import java.awt.*;

public class ShapeError extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawLine(50,50,450,650);
        g.drawLine(450,50,50,650);
    }
}
