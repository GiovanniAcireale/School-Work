package assignment7;

public class Simulator 
{
    public static void main(String[] args) 
    {
        System.out.println("Creating a maple tree, tulip, and rose tree...");
        MapleTree mapleTree = new MapleTree();
        Tulip tulip = new Tulip();
        Rose rose = new Rose();
        System.out.println("Entering a loop to simulate 3 years");
        for (int i = 0; i < 3; i++) 
        {
            mapleTree.doSpring();
            tulip.doSpring();
            rose.doSpring();
            
            mapleTree.doSummer();
            tulip.doSummer();
            rose.doSummer();
            
            mapleTree.doFall();
            tulip.doFall();
            rose.doFall();
            
            mapleTree.doWinter();
            tulip.doWinter();
            rose.doWinter();
        }
    }
}
