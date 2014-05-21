import javax.swing.*;
public class Guard extends Character{
  
  private int steps,d;
  
  public Guard(){
    super.setLoc(0,0);
    steps = 0;
    d = 0;
    repaint();
  }
  
  public path(int sx, int sy, int d,int f){
    super.setLoc(sx, sy);
    dis = d;
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
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillRect(startX - 10, startY - 10, 20, 20);
  }
}
