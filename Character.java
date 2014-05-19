public abstract class Character{
  protected int dir = 0;
  protected int x,y;
  
  
  public void setDir(int d){
    dir = d;
  }
  
  public void setLoc(int dir_x, int dir_y){
   x = dir_x;
   y = dir_y;
  }
  
  public void setType(boolean b){
   type = b; 
  }
   
}
