import javax.swing.*;
import java.awt.*;

public class ShapeDiamond extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        String Rank = "1";
        super.paintComponent(g);
        g.setColor(Color.RED);
        int[] a = {0,25,50,25};
        int[] b = {25,0,25,50};
        g.fillPolygon(a,b,4);
        int[] c = {450,475,500,475};
        int [] d = {675,650,675,700};
        g.fillPolygon(c,d,4);
        int[] e = {225,250,275,250};
        int [] f = {350,325,350,375};
        g.fillPolygon(e,f,4);
        g.setFont(new Font("font", Font.PLAIN, 50));
        g.drawString(Rank,475,40);
        g.drawString(Rank,0,700);

    }

    }
