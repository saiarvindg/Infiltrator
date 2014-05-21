import javax.swing.*;
public class Guard extends Character{
  
  private int steps;
  
  public Guard(){
    super.setLoc(0,0);
    steps = 0;
    repaint();
  }
  
  public path(int sx, int sy, int d){
    super.setLoc(sx, sy);
    dis = d;
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
  
  //make a getX() and getY() accessor method that works
  //extend the guard class for a vision cone class with the triangle's vertex at the guard's x and y
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillRect(startX - 10, startY - 10, 20, 20);
  }
}
