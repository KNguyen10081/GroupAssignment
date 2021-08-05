import javax.swing.*;
import java.awt.*;

public class ShapeSpade extends JComponent{
    @Override
    protected void paintComponent(Graphics g) {
        int x1 = 225;
        int x2 = 450;
        int y1 = 325;
        int y2 =650;
        super.paintComponent(g);
        g.fillOval(0,15,25,15);
        g.fillOval(25,15,25,15);
        int[] a = {15,35,25};
        int[] b = {40,40,20};
        g.fillPolygon(a,b,3);
        int[] c = {0,25,50};
        int[] d = {22,0,22};
        g.fillPolygon(c,d,3);
        g.fillOval(0+x1,15+y1,25,15);
        g.fillOval(25+x1,15+y1,25,15);
        int[] a1 = {15+x1,35+x1,25+x1};
        int[] b1 = {40+y1,40+y1,20+y1};
        g.fillPolygon(a1,b1,3);
        int[] c1 = {0+x1,25+x1,50+x1};
        int[] d1 = {22+y1,0+y1,22+y1};
        g.fillPolygon(c1,d1,3);
        g.fillOval(0+x2,15+y2,25,15);
        g.fillOval(25+x2,15+y2,25,15);
        int[] a2 = {15+x2,35+x2,25+x2};
        int[] b2 = {40+y2,40+y2,20+y2};
        g.fillPolygon(a2,b2,3);
        int[] c2 = {0+x2,25+x2,50+x2};
        int[] d2 = {22+y2,0+y2,22+y2};
        g.fillPolygon(c2,d2,3);
    }
}
