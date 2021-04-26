import javax.swing.*;
import java.awt.*;
public class Primer_2  extends JComponent{
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 200,200);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Black Oval");
        Primer_2 draw = new Primer_2();
        draw.setSize(400,400);
        frame.add(draw);
        frame.pack();
        frame.setVisible(true);
    }
}
