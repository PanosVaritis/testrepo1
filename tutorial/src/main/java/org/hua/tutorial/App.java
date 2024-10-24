package org.hua.tutorial;

/**
 *
 * @author panos
 */
public class App {
    public static void main (String[] args){ 

        //creation of snake alien objects 
        SnakeAlien snakeAlien = new SnakeAlien(100, "Panos");
        SnakeAlien snakeAlien1 = new SnakeAlien(100, "Dimitris");
        SnakeAlien snakeAlien2 = new SnakeAlien(100, "Thanasis");
        SnakeAlien snakeAlien3 = new SnakeAlien(100, "Aggellos");
        SnakeAlien snakeAlien4 = new SnakeAlien(0, "Iraklis");

        //creation of marshmallow man alien objects 
        MarshmallowManAlien marshmallowManAlien = new MarshmallowManAlien(100,"Dionisis");
        MarshmallowManAlien marshmallowManAlien1 = new MarshmallowManAlien(100,"Makis");
        MarshmallowManAlien marshmallowManAlien2 = new MarshmallowManAlien(100,"Thanasis");
        MarshmallowManAlien marshmallowManAlien3 = new MarshmallowManAlien(0,"Eleni");
        MarshmallowManAlien marshmallowManAlien4 = new MarshmallowManAlien(0,"Markos");
        MarshmallowManAlien marshmallowManAlien5 = new MarshmallowManAlien(0,"Eva");
        MarshmallowManAlien marshmallowManAlien6 = new MarshmallowManAlien(0,"Manos");

        //creation of ogre alien objects
        OgreAlien ogreAlien = new OgreAlien(0,"Dalia");
        OgreAlien ogreAlien1 = new OgreAlien(0,"Fotis");
        OgreAlien ogreAlien2 = new OgreAlien(0,"Theopoula");

        //creation of allien pack objects (here we create three teams of aliens. The size of the team is provided as parameter)
        AlienPack team1 = new AlienPack(4);
        AlienPack team2 = new AlienPack(6);
        AlienPack team3 = new AlienPack(5);

        //we fill the first team with aliens 
        team1.addAlien(snakeAlien, 0);
        team1.addAlien(snakeAlien1, 1);
        team1.addAlien(ogreAlien, 2);
        team1.addAlien(marshmallowManAlien, 3);

        //we fill the second team with aliens 
        team2.addAlien(snakeAlien2, 0);
        team2.addAlien(ogreAlien1, 1);
        team2.addAlien(marshmallowManAlien1, 2);
        team2.addAlien(marshmallowManAlien2, 3);
        team2.addAlien(marshmallowManAlien3, 4);
        team2.addAlien(ogreAlien2, 5);

        //we fill the third team with aliens
        team3.addAlien(snakeAlien3, 0);
        team3.addAlien(snakeAlien4, 1);
        team3.addAlien(marshmallowManAlien4, 2);
        team3.addAlien(marshmallowManAlien5, 3);
        team3.addAlien(marshmallowManAlien6, 4);
        
        //here we call the calculate damage method of the alienpack class to calculate the damage of each team
        System.out.println (team1.calculateDamage());
        System.out.println (team2.calculateDamage());
        System.out.println (team3.calculateDamage());
    }
    
}
