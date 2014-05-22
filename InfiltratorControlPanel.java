import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InfiltratorControlPanel extends JPanel{
  private JLabel timerDisp = new JLabel("Placeholder for Timer");
  private Player player;
  private Guard guard;
  private javax.swing.Timer timer;
  
  public InfiltratorControlPanel(){
   setLayout(new BorderLayout());
   setBackground(Color.ORANGE);
   
   add(timerDisp, BorderLayout.NORTH);
   
   player = new Player();
   guard = new Guard();
   guard.path(100,100,50,5);
   
   timer = new javax.swing.Timer(1000, new TimerListener());
   timer.start();
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    player.draw(g);
    guard.draw(g);
  }
  
  private class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
      guard.move();
      repaint();
    }
  }
}
