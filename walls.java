import javax.swing.*;
import java.awt.*;

public class walls extends JPanel{
  
  private int x,y,l,w;
  
  public walls(int sx,int sy,int length,int width){
    x=sx;
    y=sy;
    l=length;
    w=width;
  }
  public void draw(Graphics g){
    g.setColor(Color.BLACK);
    g.fillRect(x,y,l,w);
  }
}
