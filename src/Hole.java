
public class Hole extends Obstacle {
    
    private Application application;
    
    public Hole() {
        application = new Application();
        super.spriteX = application.getMaxX();
        super.spriteSize = new int[]{100,100};
    }

    public void move() {
        super.spriteX -= super.getSpeed();
        if (spriteX > application.getMinX()) {
            
        }
    }
    
}
