import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Polygon;


public class Player extends Character implements KeyListener{
  
  private JPanel display;
  public int dx,dy;
  private int [] xs;
  private int [] ys;
  public Polygon pp;
  private Map map;
  
  
  public Player( JPanel jp, Map mp ){
    
    display = jp;
    super.setLoc(15,15);
    
    dx = 4;
    dy = 4;
    
    xs = new int []{x - 5, x + 25, x + 25, x - 5};
    ys = new int []{y - 5, y - 5, y + 25, y + 25};
    
    pp = new Polygon(xs, ys, 4);
    
    map = new Map();
    
  }
  
  public void move(KeyEvent e){
    int key = e.getKeyCode();
    //System.out.println(super.x + ", " + super.y);
    if(key == KeyEvent.VK_W && check()){
      //System.out.println(check());
      super.y -= dy;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    else if(key == KeyEvent.VK_S && check()){
      //System.out.println(check());
      super.y += dy;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    else if(key == KeyEvent.VK_A && check()){
      //System.out.println(check());
      super.x -= dx;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    else if(key == KeyEvent.VK_D && check()){
     // System.out.println(check());
      super.x += dx;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
  }
  
  public boolean check(){
    for(Walls w: map.m){
      //System.out.println(map.m.size());
      if(pp.intersects(w.x, w.y, w.l, w.h)){
        System.out.println("here");
        return false;
      }
    }
    return true;
  }
  
  public void draw(Graphics g){
    g.setColor(Color.BLUE.brighter().brighter());
    g.fillOval(super.x, super.y, 15, 15);
    
  }
  
  public void keyPressed(KeyEvent e){
    move(e);
    display.repaint();
    //System.out.println("pressed");
  }
  
  public void keyReleased(KeyEvent e){ }
  
  public void keyTyped(KeyEvent e){ }
}
