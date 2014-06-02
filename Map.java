import javax.swing.*;
import java.util.ArrayList;

public class Map extends JPanel{
  
  public ArrayList<walls> m;
  
  public Map(){
    m = new ArrayList<walls>();

    //Border Walls
    m.add(new walls(0,0,50,5));
    m.add(new walls(0,0,5,50));
    m.add(new walls(50,0,550,25));
    m.add(new walls(0,50,25,550));
    m.add(new walls(25,575,575,25));
    m.add(new walls(575,0,25,600));
       
    m.add(new walls(200,200,200,25));
    m.add(new walls(200,200,25,175));
    m.add(new walls(400,200,25,200));
    m.add(new walls(225,400,200,25));
    m.add(new walls(25,50,25,25));
  }
}
