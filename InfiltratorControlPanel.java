import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.ArrayList;

public class InfiltratorControlPanel extends JPanel{
  private JLabel timerDisp = new JLabel("Time: 20");
  private JLabel gameOver = new JLabel();
  private Player player;
  private ArrayList<Guard> guards;
  private Timer timer;
  private int countdown = 20;
  
  public InfiltratorControlPanel(){
    setLayout(new BorderLayout());
    setBackground(Color.YELLOW);
    
    add(timerDisp, BorderLayout.NORTH);
    add(gameOver, BorderLayout.CENTER);
    guards = new ArrayList<Guard>();
    
    player = new Player(this);
    
    for(int c =1; c < 6; c++){
      guards.add(new Guard(100*c,100*c,5,0));
    }
    
    addKeyListener(player);
    
    timer = new Timer(1000, new TimerListener());
    timer.start();
    
    setFocusable(true);
    //setFocus(true);
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    player.draw(g);
    //repaint();
    for(Guard gd : guards){
      gd.draw(g); 
    }
  }
  
  public boolean detected(Player p, ArrayList<Guard> gds){
    for(Guard gd : gds){
      if(p.x == gd.x - 4 || p.y == gd.y - 4 ){
        System.out.println("HIT DETECTED");
        return true;
      }
    }
    
    return false;
  }
  
  private class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
      countdown--;
      timerDisp.setText("Time: " + countdown);
      //guard.move();
      for(Guard gd : guards){
        gd.move(); 
      }
      /*
      if(detected(player, guards)){
        timer.stop();
        gameOver.setText("GAME OVER");
      }
      */
      repaint();
    }
  }
}
