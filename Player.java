import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Player extends Character implements KeyListener{
  private JPanel display;
  
  public Player( JPanel jp ){
    display = jp;
    super.setLoc(15,15);
  }
  
  public void move(KeyEvent e){
    int key = e.getKeyCode();
    System.out.println(super.x + ", " + super.y);
    if(key == KeyEvent.VK_W){
      super.y -= 4;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    if(key == KeyEvent.VK_S){
      super.y += 4;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    if(key == KeyEvent.VK_A){
      super.x -= 4;
      super.setLoc(super.x,super.y);
      display.repaint();
    }
    if(key == KeyEvent.VK_D){
      super.x += 4;
      super.setLoc(super.x,super.y);
      display.repaint();
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
