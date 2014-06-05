import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Player extends Character implements KeyListener{
  private JPanel display;
  public int pdx,pdy;
  private Map mp;
  
  public Player( JPanel jp, Map pm ){
    display = jp;
    pdx = 3;
    pdy = 3;
    super.setLoc(15,15);
    mp = pm;
  }
  
  public void move(KeyEvent e){
    int key = e.getKeyCode();
    System.out.println(super.x + ", " + super.y);
    if(key == KeyEvent.VK_W){
      super.y -= pdy;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    if(key == KeyEvent.VK_S){
      super.y += pdy;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    if(key == KeyEvent.VK_A){
      super.x -= pdx;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    if(key == KeyEvent.VK_D){
      super.x += pdx;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    
    for(Walls w: mp.m){
      if(display.contains(w.x, w.y, w.l, w.h)){
        //gdx *= -1;
       // gdy *= -1;
        break;
      }
      else
        walk();
      break;
    }
    
  }
  
  public void draw(Graphics g){
    g.setColor(Color.BLUE.brighter().brighter());
    g.fillOval(super.x, super.y, 15, 15);

  }
  
  public void keyPressed(KeyEvent e){
    move(e);
    display.repaint();
    System.out.println("pressed");
  }
  
  public void keyReleased(KeyEvent e){ }
  
  public void keyTyped(KeyEvent e){ }
}
