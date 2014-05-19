public abstract class Character{
  protected int dir = 0;
  protected Location loc;
  protected boolean type = false; // true if player, false if guard
  
  public void setDir(int d){
    dir = d;
  }
  
  public void setLoc(Location l){
   loc = l; 
  }
  
  public void type(boolean b){
   type = b; 
  }
   
}
