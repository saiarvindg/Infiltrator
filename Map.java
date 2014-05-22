import javax.swing.*;
import java.awt.*;

public class Map extends JPanel{
  
  private ArrayList<walls> map;
  
  public Map(){
    map = new ArrayList<walls>();
  }
  map.add(new walls(200,200,400,200));
  map.add(new walls(200,200,200,400));
  for(walls w: map)
    w.draw();
}
