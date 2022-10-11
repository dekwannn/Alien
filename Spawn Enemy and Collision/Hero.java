import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movementHero();
        shootLaser();
    }
    
    public void movementHero(){
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-3);
        }
        
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+3);
        }
        
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-3, getY());
        }
        
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+3, getY());
        }
    }
    
    int laserTimer = 0;
    public void shootLaser(){
        if(laserTimer==30){
            getWorld().addObject(new Laser(), getX()+5, getY());
            laserTimer = 0;
        } else {
            laserTimer++;
        }
    }
}
