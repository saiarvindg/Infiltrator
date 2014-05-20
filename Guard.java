public class Guard extends Character{
  public Guard{
    super.setLoc(0,0);
  }
  public path(int startX, int startY, int steps){
    super.setLoc(startX, startY);
    for(int t = 0; t < 4; t++){
      for(int s = 0; s < steps; s++){
        super.move();
      }
      turn();
    }
    path(startX, startY, steps);
  }
}
