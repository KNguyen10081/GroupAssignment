import javax.swing.*;
import java.awt.*;

public class CardDesign extends JFrame {
    private JPanel Cardback;
    private JTextPane kTextPane;
    private JTextPane kTextPane1;
public static void main(String[] args){
    EventQueue.invokeLater(new Runnable() {
@Override
public void run(){
JFrame f = new JFrame();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(500,700);
f.setResizable(false);
f.setVisible(true);

}
});
}}