import javax.swing.*;
import java.awt.*;

public class ShapeClubs extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        String Rank = "1";
        super.paintComponent(g);
        g.fillOval(0,15,25,25);
        g.fillOval(25,15,25,25);
        g.fillOval(12,0,26,26);
        int[] a = {15,35,25};
        int[] b = {50,50,25};
        g.fillPolygon(a,b,3);
        g.fillOval(225,340,25,25);
        g.fillOval(250,340,25,25);
        g.fillOval(237,325,26,26);
        int[] c = {15+225,35+225,25+225};
        int[] d = {50+325,50+325,25+325};
        g.fillPolygon(c,d,3);
        g.fillOval(0+450,15+650,25,25);
        g.fillOval(25+450,15+650,25,25);
        g.fillOval(12+450,650,26,26);
        int[] e = {15+450,35+450,25+450};
        int[] f = {50+650,50+650,25+650};
        g.fillPolygon(e,f,3);
        g.setFont(new Font("font", Font.PLAIN, 50));
        g.drawString(Rank,475,40);
        g.drawString(Rank,0,700);
    }
}
