import javax.swing.*;
import java.awt.*;
import java.awt.Polygon;

public class Walls extends JPanel{
  
  public int x,y,l,h;
  private int [] xs;
  private int [] ys;
  public Polygon p;
  
  public Walls(int sx,int sy,int length,int height){
    x=sx;
    y=sy;
    l=length;
    h=height;
    
    xs = new int [4];
    xs[0] = sx;
    xs[1] = sx + length;
    xs[2] = sx + length;
    xs[3] = sx;
    
    ys = new int [4];
    ys[0] = sy;
    ys[1] = sy;
    ys[2] = sy + height;
    ys[3] = sy + height;
    
    p = new Polygon(xs,ys,4);
  }
  
 /* public boolean checker(double x, double y, double w, double h){
    if(p.intersects(x, y, w, h))
      return false;
    return true;
  }*/
  
  public void draw(Graphics g){
    g.setColor(Color.ORANGE);
    g.fillRect(x,y,l,h);
  }
}
