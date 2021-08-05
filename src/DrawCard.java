import javax.swing.*;
import java.awt.*;

public class DrawCard extends JComponent{

    public static void main(String[] args) {
        String Suit = "p";
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(525, 750);
        if (Suit.equals("Heart")){
            f.add(new ShapeHeart());
        }
        else if (Suit.equals("Clubs")){
            f.add(new ShapeClubs());
        }
        else if (Suit.equals("Diamond")){
            f.add(new ShapeDiamond());
        }
        else if (Suit.equals("Spades")){
            f.add(new ShapeSpade());
        }
        else {
            f.add(new ShapeError());
        }
        f.setResizable(false);
        f.setVisible(true);
    }
}