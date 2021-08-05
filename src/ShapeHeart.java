import javax.swing.*;
import java.awt.*;

public class ShapeHeart extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        String Rank = "1";
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(0, 0, 25, 20);
        g.fillOval(20, 0, 25, 20);
        int[] a = {22, 0, 45};
        int[] b = {45, 10, 10};
        g.fillPolygon(a, b, 3);
        g.fillOval(0+225, 0+325, 25, 20);
        g.fillOval(20+225, 0+325, 25, 20);
        int[] c = {22+225, 0+225, 45+225};
        int[] d = {45+325, 10+325, 10+325};
        g.fillPolygon(c, d, 3);
        g.fillOval(0+450, 0+650, 25, 20);
        g.fillOval(20+450, 0+650, 25, 20);
        int[] e = {22+450, 0+450, 45+450};
        int[] f = {45+650, 10+650, 10+650};
        g.fillPolygon(e, f, 3);
        g.setFont(new Font("font", Font.PLAIN, 50));
        g.drawString(Rank,475,40);
        g.drawString(Rank,0,700);
    }
}
