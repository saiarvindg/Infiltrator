import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Player extends Character implements KeyListener{
  
  public Player(){
    super.setLoc(0,0);
  }
  
  public void move(KeyEvent e){
    int key = e.getKeyCode();
    System.out.println(super.x + ", " + super.y);
    if(key == KeyEvent.VK_W){ //W key
      super.y -= 4;
      super.setLoc(super.x,super.y);
      repaint();
    }
    if(key == KeyEvent.VK_S){ //S key
      super.y += 4;
      super.setLoc(super.x,super.y);
      repaint();
    }
    if(key == KeyEvent.VK_A){ // A key
      super.x -= 4;
      super.setLoc(super.x,super.y);
      repaint();
    }
    if(key == KeyEvent.VK_D){ //D key
      super.x += 4;
      super.setLoc(super.x,super.y);
      repaint();
    }
    repaint();
  }
  
  public void draw(Graphics g){
    g.fillOval(super.x, super.y, 15, 15);
    g.setColor(Color.BLUE);
  }
  
  public void keyPressed(KeyEvent e){
    move(e);
    repaint();
    System.out.println("pressed");
  }
  
  public void keyReleased(KeyEvent e){ }
  
  public void keyTyped(KeyEvent e){ }
}
