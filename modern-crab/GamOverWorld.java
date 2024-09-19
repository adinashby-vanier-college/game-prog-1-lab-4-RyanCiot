// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GamOverWorld extends World
{

    /**
     * Constructor for objects of class GamOverWorld.
     */
    public GamOverWorld()
    {
        super(560, 560, 1);
        showTextWithBigRedFont("You Lose! ", 180, 200);
    }

    /**
     * 
     */
    public void showTextWithBigRedFont(String messages, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(messages, x, y);
    }
}
