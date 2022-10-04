import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy(){
        setRotation(180);
    }
    
    //POLYMORPHISM
    public Enemy(int speed){ //variabel lokal
        setRotation(180);
        this.speed = speed; //this.speed = memanggil variabel global
    }
    
    public int speed = 2; //variabel global
    public void act()
    {
        move(speed);
    }
}
