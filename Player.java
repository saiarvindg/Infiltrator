public class Player extends Character{
  int x,y;
  
  public Player{
    super.setLoc(0,0);
    super.setDir(0);
  }
  
  public void move(KeyEvent e){
    int key = e.getKeyCode();
    
    if(key == KeyEvent.VK_W){  //W key
      y -= 4;
    }
    if(key == KeyEvent.VK_S){   //S key
      y += 4;
    }
    if(key == KeyEvent.VK_A){   // A key
      x -= 4;
    }
    if(key == KeyEvent.VK_D){  //D key
      x += 4;
    }
  }
  
}
