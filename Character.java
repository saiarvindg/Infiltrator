public abstract class Character{
  
  protected int dir = 0;
  protected int x,y;
  
  public void setDir(int d){
    dir = d/90;
  }
  
  public void setLoc(int new_x, int new_y){
    x = new_x;
    y = new_y;
  }
  
  public void move(){
    if(dir == 0)
      y -= 2;
    else if(dir == 1)
      x += 2;
    else if(dir == 2)
      y += 2;
    else if(dir == 3)
      x -= 2;
  }
  public void turn(){
    if(dir > 3)
      dir = 0;
    dir++;
  }
}
