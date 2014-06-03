import javax.swing.*;
import java.util.ArrayList;

public class Map extends JPanel{
  
  public ArrayList<Walls> m;
  
  public Map(){
    m = new ArrayList<Walls>();

    //Border Walls
    m.add(new Walls(0,0,50,5));
    m.add(new Walls(0,0,5,50));
    m.add(new Walls(50,0,550,25));
    m.add(new Walls(0,50,25,550));
    m.add(new Walls(25,575,525,25));
    m.add(new Walls(575,0,25,600));
       
    m.add(new Walls(200,200,200,25));
    m.add(new Walls(200,200,25,175));
    m.add(new Walls(400,200,25,200));
    m.add(new Walls(225,400,200,25));
    m.add(new Walls(25,50,25,25));
    m.add(new Walls(50,100,25,400));
    m.add(new Walls(50,500,75,25));
  }
}
