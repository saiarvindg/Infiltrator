import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Character{
  int x,y;
  
  
  public Player{
    super.setLoc(0,0);
    super.setDir(0);
    KeyListener kl = new KeyStuff();
    addKeyListener(kl);
  }
  
  public void move(KeyEvent e){
    int key = e.getKeyCode();
    
    if(key == KeyEvent.VK_W){  //W key
      y -= 4;
      super.setLoc(x,y);
    }
    if(key == KeyEvent.VK_S){   //S key
      y += 4;
      super.setLoc(x,y);
    }
    if(key == KeyEvent.VK_A){   // A key
      x -= 4;
      super.setLoc(x,y);
    }
    if(key == KeyEvent.VK_D){  //D key
      x += 4;
      super.setLoc(x,y);
    }
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    
  }
  
  private class KeyStuff implements KeyListener{
    public void keyPressed(KeyEvent e){
      int btn = 
    }
  }
  
  
}
