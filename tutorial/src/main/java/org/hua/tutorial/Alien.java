package org.hua.tutorial;

/**
 *
 * @author panos
 */
public class Alien {
    private int health;   //0 = dead, 100 = full strength 
    private String name;  //the name of the alien

    public Alien (int health, String name){
        this.health = health;
        this.name = name;
    }


    public int getDamage (){
        return 0;
    }
    
}
