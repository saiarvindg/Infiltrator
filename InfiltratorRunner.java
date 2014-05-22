import javax.swing.*;
import java.awt.*;

public class InfiltratorRunner {  
  public static void main(String[] args) { 
    JFrame f = new JFrame("InfiltratorRunner");
    f.setSize(600,600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container pane = f.getContentPane();
    f.setLayout(new BorderLayout());
    
    InfiltratorControlPanel ICP = new InfiltratorControlPanel();
    pane.add(ICP);
    
    f.setVisible(true);
  }
}
