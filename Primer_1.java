import javax.swing.*;
import java.awt.*;
public class Primer_1 extends Canvas{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Black Oval");
        Canvas canvas = new Primer_1();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 200,200);
    }
}
