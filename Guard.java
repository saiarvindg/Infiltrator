import java.awt.*;

public class Guard extends Character{
  
  private int steps,dir;
  
  public Guard(){
    super.setLoc(0,0);
    steps = 0;
    repaint();
  }
  
  public void path(int sx, int sy, int d,int f){
    super.setLoc(sx, sy);
    int dis = d;
    dir = f/90;
    if(steps == dis){
      turn();
      steps = 1;
    }
    move();
    steps++;
    repaint();
  }
  
  public void move(){
    if(dir == 0)
      super.y -= 2;
    else if(dir == 1)
      super.x += 2;
    else if(dir == 2)
      super.y += 2;
    else if(dir == 3)
      super.x -= 2;
  }
  public void turn(){
    if(dir > 3)
      dir = 0;
    dir++;
  }
  
  public void draw(Graphics g){
    g.setColor(Color.RED);
    g.fillRect(x - 10, y - 10, 20, 20);
  }
}
