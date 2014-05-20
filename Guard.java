public class Guard extends Character{
  
  private int startX,startY,steps;
  
  public Guard(x,y,s){
    super.setLoc(0,0);
    startX = x;
    startY = y;
    steps = s;
    repaint();
  }
  
  public path(int startX, int startY, int dis){
    super.setLoc(startX, startY);
    if(steps == dis){
      turn();
      steps = 0;
    }
    move();
    steps++;
    repaint();
  }
  
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.setColor(Color.RED);
    g.fillOval(startX - 10, startY - 10, 20, 20);
  }
}
