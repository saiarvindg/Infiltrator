public class Guard extends Character{
  
  private int startX,startY,steps, numTurns;
  
  public Guard(x,y,s){
    super.setLoc(0,0);
    startX = x;
    startY = y;
    steps = s;
    repaint();
  }
  
  public path(int startX, int startY, int d){
    super.setLoc(startX, startY);
    dis = d;
    numTurns = 0;
    if(steps == dis){
      turn();
      numTurns++;
      steps = 0;
    }
    move();
    steps++;
    repaint();
  }
  
  //make a getX() and getY() accessor method that works
  //extend the guard class for a vision cone class with the triangle's vertex at the guard's x and y
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillRect(startX - 10, startY - 10, 20, 20);
  }
}
