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
  
  public abstract void move(){  } //Remove move method so sub-class can redfine it
  
  public void turn(){
    if(dir > 3)
      dir = 0;
    dir++;
  }
}
