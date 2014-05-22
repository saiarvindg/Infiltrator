import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CtrlPanel extends JPanel{
  private JLabel timerDisp = new JLabel("Placeholder for Timer");
  
  public CtrlPanel(){
   setLayout(new BorderLayout());
   setBackground(Color.ORANGE); 
   
   add(timerDisp, BorderLayout.NORTH);
   
   Character p1 = new Player();
   Guard g1 = new Guard();
   g1.path(10,10,5,0);
   
   add(p1. BorderLayout.WEST);
   add(g1. BorderLayout.EAST);
  }
  
  
}
