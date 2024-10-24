package org.hua.tutorial;

/**
 *
 * @author panos
 */
public class AlienPack {
     private Alien[] aliens;
    
    public AlienPack (int n){
        aliens = new Alien[n];
    }

    public void addAlien (Alien newAlien, int i){
        aliens[i] = newAlien;
    }

    public Alien[] getAliens(){
        return aliens;
    }

    public int calculateDamage(){
        int damage = 0;

        for (int i = 0;i < aliens.length;i++){
            damage += aliens[i].getDamage();
        }
        return damage;
    }
    
    public void printName (){
        System.out.println ("My name is panos!!!");
    }
    
}
