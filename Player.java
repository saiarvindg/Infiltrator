import java.awt.*;
import javax.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public class Player extends Character implements KeyListener{
  
    
  public Player{
    super.setLoc(0,0);
    KeyListener kl = new KeyListener();
    addKeyListener(kl);
  }
  
  public void move(KeyEvent e){
    int key = e.getKeyCode();
    
    if(key == KeyEvent.VK_W){  //W key
      super.y -= 4;
      super.setLoc(super.x,super.y);
    }
    if(key == KeyEvent.VK_S){   //S key
      super.y += 4;
      super.setLoc(super.x,super.y);
    }
    if(key == KeyEvent.VK_A){   // A key
      super.x -= 4;
      super.setLoc(super.x,super.y);
    }
    if(key == KeyEvent.VK_D){  //D key
      super.x += 4;
      super.setLoc(super.x,super.y);
    }
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.fillOval
    
  }
  
  public void keyPressed(KeyEvent e){
    move(e);
  }  
}
