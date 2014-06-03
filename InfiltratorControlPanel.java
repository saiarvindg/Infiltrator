import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.ArrayList;

public class InfiltratorControlPanel extends JPanel{
  private JLabel timerDisp = new JLabel("Time: 2000");
  private JButton gameOver = new JButton();
  private Player player;
  private ArrayList<Guard> guards;
  private Timer timer;
  private int countdown = 2000;
  private Map map;
  
  public InfiltratorControlPanel(){
    setLayout(new BorderLayout());
    setBackground(Color.GREEN);
    
    add(timerDisp, BorderLayout.NORTH);
    add(gameOver, BorderLayout.CENTER);
    gameOver.setVisible(false);
    gameOver.addActionListener( new playAgain() );
    
    player = new Player(this);
    guards = new ArrayList<Guard>();
    //for(int c =1; c < 6; c++){
      guards.add(new Guard(100,100,5,0));
    //}
    
    addKeyListener(player);
    
    timer = new Timer(1000, new TimerListener());
    timer.start();
    
    map = new Map();
    
    setFocusable(true);
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    player.draw(g);

    for(Guard gd : guards){
      gd.draw(g);
    }
    
    for(Walls w: map.m){
     w.draw(g);
    }
    
  }
  
  public boolean detect(Player p, Guard grd){
    if((p.x >= grd.x - 4 && p.x <= grd.x + 4) || (p.y >= grd.y -4 && p.y <= grd.y + 4)){
      return true;
    }
    return false;
  }
  
  public boolean gameOver(ArrayList<Guard> gds, int tm){
    for(Guard gd : gds){
      if(detect(player, gd)){
        return true;
      }
    }
    if(tm == 0){
      return true;
    }
    return false;
  }
  
  private class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
      countdown--;
      timerDisp.setText("Time: " + countdown);
      
      for(Guard gd : guards){
        gd.move();
        repaint();
      }
      
      if(gameOver(guards, countdown)){
        timer.stop();
        removeKeyListener(player);
        gameOver.setVisible(true);
        gameOver.setEnabled(true);
        gameOver.setText("GAME OVER. CLICK TO PLAY AGAIN");
      }
      
      repaint();
    }
  }
  
  private class playAgain implements ActionListener{
    public void actionPerformed(ActionEvent e){
      gameOver.setText("UNDER PROGRESS. IN THE MEANWHILE, PONDER THIS QUOTE: \n SPEAK SOFTLY & CARRY A BIG STICK");
    }
  }
}
