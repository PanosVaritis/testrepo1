package org.hua.tutorial;

/**
 *
 * @author panos
 */
public class OgreAlien extends Alien {
    
    public OgreAlien (int health, String name) {
        super(health, name);
    } 
    
    @Override
    public int getDamage(){
        return 6;
    }
    
}
