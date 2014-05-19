public abstract class Character{
  protected int dir = 0;
  protected int x,y;
  protected boolean type = false; // true if player, false if guard
  
  public void setDir(int dir_x, int dir_y){
    x = dir_x;
    y = dir_y;
  }
  
  public void setLoc(Location l){
   loc = l; 
  }
  
  public void setType(boolean b){
   type = b; 
  }
   
}
