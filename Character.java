public abstract class Character{
  protected int dir = 0;
  protected int x,y;
  
  
  public void setDir(int d){
    dir = d;
  }
  
  public void setLoc(int new_x, int new_y){
   x = new_x;
   y = new_y;
  }
  
  
   
}
