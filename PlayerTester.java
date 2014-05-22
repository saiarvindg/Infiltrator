import java.awt.*;
import javax.swing.*;

public class PlayerTester {
  
  public static void main(String[] args) { 
    JFrame f = new JFrame();
    f.setTitle("Player Tester");
    f.setSize(500,500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container pane = f.getContentPane();
    pane.setLayout( new BorderLayout() );
    
    CtrlPanel ctrl = new CtrlPanel();
    
    pane.add(ctrl, BorderLayout.CENTER);
    
    f.pack();
    f.setVisible(true);
  }
  
}
