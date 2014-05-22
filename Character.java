import javax.swing.*;

public abstract class Character extends JPanel{
  protected int x,y;
  
  public void setLoc(int new_x, int new_y){
    x = new_x;
    y = new_y;
  }
}
