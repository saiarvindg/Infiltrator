import java.awt.*;
//import java.util.ArrayList;

public class Guard extends Character{
  
  private int steps,dis,dir;
  public Map map;
  public int gdx, gdy;
  
  public Polygon p;
  
  public Guard(int sx, int sy, int d,int f){
    super.setLoc(sx,sy);
    steps = 0;
    dir = f;
    dis = d;
    map = new Map();
    int [] xs = {x,x+20,x+20,x};
    int [] ys = {y,y,y+20, y+20};
    p = new Polygon(xs,ys,4);
    // repaint();
    gdx = 4;
    gdy = 4;
  }
  
  public void move(){
    if(steps >= dis){
      turn();
      steps = 1;
    }
    
    /* for(Walls w: map.m){
     if(w.checker(x - 10, y - 10, 20, 20)) {
     walk();
     return;
     }
     }*/
    
    for(Walls w: map.m){
      if(p.intersects(w.x, w.y, w.l, w.h)){
        //gdx *= -1;
       // gdy *= -1;
        break;
      }
      else
        walk();
      break;
    }
  }
  
  public void walk(){
    if(dir == 0){
      super.y -= gdy;
      steps++;
    }
    else if(dir == 1){
      super.x += gdx;
      steps++;
    }
    else if(dir == 2){
      super.y += gdy;
      steps++;
    }
    else if(dir == 3){
      super.x -= gdx;
      steps++;
    }
    
  }
  public void turn(){
    if(dir >= 3)
      dir = 0;
    else
      dir++;
  }
  
  public void draw(Graphics g){
    g.setColor(Color.RED);
    g.fillRect(x - 10, y - 10, 20, 20);
  }
}
