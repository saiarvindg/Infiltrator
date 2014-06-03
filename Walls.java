import javax.swing.*;
import java.awt.*;
import java.awt.Polygon;

public class Walls extends JPanel{
  
  private int x,y,l,w;
  private int [] xs;
  private int [] ys;
  public Polygon p;
  
  public Walls(int sx,int sy,int length,int width){
    x=sx;
    y=sy;
    l=length;
    w=width;
    
    xs = new int [4];
    xs[0] = sx;
    xs[1] = sx + length;
    xs[2] = sx + length;
    xs[3] = sx;
    
    ys = new int [4];
    ys[0] = sy;
    ys[1] = sy;
    ys[2] = sy + width;
    ys[3] = sy + width;
    
    p = new Polygon(xs,ys,4);
  }
  
  public boolean checker(double x, double y, double w, double h){
    if(p.contains(x, y, w, h))
      return false;
    return true;
  }
  
  public void draw(Graphics g){
    g.setColor(Color.ORANGE);
    g.fillRect(x,y,l,w);
  }
}
