import java.awt.*;

public class Guard extends Character{
  
  private int steps,dis,dir;
  
  
  public Guard(int sx, int sy, int d,int f){
    super.setLoc(sx,sy);
    steps = 0;
    dir = f;
    dis = d;
  //  repaint();
  }
  
  public void move(){
    if(steps == dis){
      turn();
      steps = 1;
    }
    walk();
  }
  
  public void walk(){
    if(dir == 0){
      super.y -= 4;
      steps++;
    }
    else if(dir == 1){
      super.x += 4;
      steps++;
    }
    else if(dir == 2){
      super.y += 4;
      steps++;
    }
    else if(dir == 3){
      super.x -= 4;
      steps++;
    }
   
  }
  public void turn(){
    if(dir >= 3)
      dir = 0;
    else
      dir++;
  }
  
  public void draw(Graphics g){
    g.setColor(Color.RED);
    g.fillRect(x - 10, y - 10, 20, 20);
  }
}
