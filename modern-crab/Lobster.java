// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * 
     */
    public Lobster()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        initDirection();
        moveAround();
        eat();
        army();
        if (isGameLost()) {
            transitionToGameOverWorld();
            Greenfoot.playSound("YouLose.wav");
        }
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor crab = getOneIntersectingObject(Crab.class);
        if (crab != null) {
            World world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("bone-break-140224.wav");
        }
    }

    /**
     * 
     */
    public void initDirection()
    {
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }

    /**
     * 
     */
    public void army()
    {
        Actor worm = getOneIntersectingObject(Worm.class);
        if (worm != null) {
            World world = getWorld();
            int xLocation = worm.getX();
            int yLocation = worm.getY();
            world.removeObject(worm);
            Actor lobster =  new  Lobster();
            world.addObject(lobster, xLocation, yLocation);
            Greenfoot.playSound("wood-frog-sequence-43115.wav");
        }
    }

    /**
     * 
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Crab.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GamOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
}
