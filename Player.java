import java.awt.*;
import javax.swing.*;  
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Player extends Character implements KeyListener{
  private JPanel display;
  
  public Player( JPanel jp ){
    display = jp;
    super.setLoc(0,0);
  }
  
  public void move(KeyEvent e){
    int key = e.getKeyCode();
    System.out.println(super.x + ", " + super.y);
    if(key == KeyEvent.VK_W){ //W key
      super.y -= 4;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    if(key == KeyEvent.VK_S){ //S key
      super.y += 4;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    if(key == KeyEvent.VK_A){ // A key
      super.x -= 4;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    if(key == KeyEvent.VK_D){ //D key
      super.x += 4;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
  }
  
  public void draw(Graphics g){
    g.fillOval(super.x, super.y, 15, 15);
    //g.setColor(Color.decode("#2DE0ED"));
    g.setColor(Color.BLUE.brighter().brighter());
  }
  
  public void keyPressed(KeyEvent e){
    move(e);
    display.repaint();
    System.out.println("pressed");
  }
  
  public void keyReleased(KeyEvent e){ }
  
  public void keyTyped(KeyEvent e){ }
}
