import javax.swing.*;
import java.awt.*;

public class InfiltratorRunner {
    
  public static void main(String[] args) {
    JFrame f = new JFrame("InfiltratorRunner");
    f.setSize(605,625);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container pane = f.getContentPane();
    f.setLayout(new BorderLayout());
    f.setResizable(false);
    
    InfiltratorControlPanel ICP = new InfiltratorControlPanel();
    pane.add(ICP);

    f.setVisible(true);
  }
 
}
