import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.ArrayList;

public class InfiltratorControlPanel extends JPanel{
  private JLabel timerDisp = new JLabel("Time: 30");
  private JButton gameOver = new JButton();
  private Player player;
  private ArrayList<Guard> guards;
  private Target tg;
  private Timer timer;
  private Timer detectTimer;
  private int countdown = 200;
  private Map map;
  
  public InfiltratorControlPanel(){
    setLayout(new BorderLayout());
    setBackground(Color.GREEN);
    
    add(timerDisp, BorderLayout.NORTH);
    add(gameOver, BorderLayout.CENTER);
    gameOver.setVisible(false);
    gameOver.addActionListener( new playAgain() );
    
    map = new Map();
    player = new Player(this, map);
    guards = new ArrayList<Guard>();
    for(int c =1; c < 12; c++){
      int rndx = (int)(475*Math.random()) + 75;
      int rndy = (int)(400*Math.random()) + 100;
      guards.add(new Guard(rndx+c,rndy+c,5,0));
    }
    tg = new Target(275,275,50,50);
    
    
    addKeyListener(player);
    
    timer = new Timer(1000, new TimerListener());
    detectTimer = new Timer(100, new GuardDetect());
    timer.start();
    detectTimer.start();
    
    
    
    setFocusable(true);
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    player.draw(g);
    tg.draw(g);
    
    for(Guard gd : guards){
      gd.draw(g);
    }
    
    for(Walls w: map.m){
      w.draw(g);
    }
    
    
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
  
  public boolean detect(Player p, Guard grd){
    for(int i = 0; i<16; i++){
      for(int s = 0 ; s<16; s++){
        if((grd.p).intersects(p.x+i, p.y+s, 20, 20))
          return true;
      }
    }
    return false;
  }
  
  private class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
      countdown--;
      timerDisp.setText("Time: " + countdown);
      
      for(Guard gd : guards){
        gd.move();
      }
      
      
      repaint();
    }
  }
  
  private class GuardDetect implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if((player.pp).intersects(tg.x,tg.y,tg.l,tg.h)){
        
        tg.gotten = true;
      }
      
      if(gameOver(guards, countdown)){
        timer.stop();
        detectTimer.stop();
        removeKeyListener(player);
        gameOver.setVisible(true);
        gameOver.setEnabled(true);
        gameOver.setText("GAME OVER. CLICK TO PLAY AGAIN");
      }
    }
  }
  
  private class playAgain implements ActionListener{
    public void actionPerformed(ActionEvent e){
      gameOver.setText("UNDER PROGRESS. IN THE MEANWHILE, PONDER THIS QUOTE: \n SPEAK SOFTLY & CARRY A BIG STICK");
      replay();
    }
  }
  
  public void replay(){
    countdown = 200;
    gameOver.setVisible(false);
    gameOver.setEnabled(false);
    player.x = 15;
    player.y = 15;
    player.dx = 3;
    player.dy = 3;
    addKeyListener(player);
    
    timer.start();
    detectTimer.start();
  }
  
}
