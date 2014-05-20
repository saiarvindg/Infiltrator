public class Player extends Character{
  int x,y;
  
  public Player{
    super.setLoc(0,0);
    super.setDir(0);
  }
  
  public void move(KeyEvent e){
    int key = e.getKeyCode();
    
    if(key == 87){  //W key
      y -= 4;
    }
    if(key == 83){   //S key
      y += 4;
    }
    if(key == 65){   // A key
      x -= 4;
    }
    if(key == 68){  //D key
      x += 4;
    }
  }
  
}
