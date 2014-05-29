import javax.swing.*;
import java.util.ArrayList;

public class Map extends JPanel{
  
  public
    ArrayList<walls> m;
  
  public Map(){
    m = new ArrayList<walls>();
    m.add(new walls(200,200,400,100));
    m.add(new walls(200,200,100,400));
  }
}
