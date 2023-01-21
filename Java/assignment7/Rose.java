package assignment7;

public class Rose extends Plant 
{
    private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 1;
    
    private void grow() 
    {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
    }
    
    @Override
    public void doSpring() 
    {
        grow();
        addYearToAge();
        System.out.println("Spring: The rose tree is starting to grow leaves and new branches");
        System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }
    
    @Override
    public void doSummer() 
    {
        grow();
        System.out.println("Summer: The rose tree is continuing to grow");
        System.out.println("\tCurrentAge: " + getAge() + " " + "Current Height: " + getHeight());
    }
    
    @Override
    public void doFall() 
    {
        System.out.println("Fall:   The rose tree has stopped growing and is losing its leaves");
        System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }
    
    @Override
    public void doWinter() 
    {
        System.out.println("Winter: The rose tree is dormant");
        System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }
    
}