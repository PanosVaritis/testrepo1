package org.hua.tutorial;

/**
 *
 * @author panos
 */
public class SnakeAlien extends Alien{
    public SnakeAlien (int health, String name){
        super(health, name);
    }
    
    @Override
    public int getDamage(){
        return 10;
    }
}
