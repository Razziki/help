
 /**
  * The is a test program BasketballPlayerTests expected values to actual values and modifying them.
  * Chapter 10 Object-Oriented Programming, Part 3: Inheritance, Polymorphism, and Interfaces
  * @author:
  * @version: 1.0.0
 */
public class BasketballPlayerTests {
    public static void main(String[] args)
    {
        testConstructor1();
        testConstructor2();
        testSetName();
        testSetNumber();
        testSetPoints();
        BasketballPlayerTests test = new BasketballPlayerTests();
        test.testSetAssists();
        test.testToString();
    }
    //constructor1
	public static void testConstructor1()
    {
        BasketballPlayer player = new BasketballPlayer("James Cameron", 10);
        System.out.println("Test #1 - Initialize the name.");
        System.out.println("Expected: James Cameron");
        System.out.println("Actual: " + player.getName());

        System.out.println("Test #2 - Initialize the number.");
        System.out.println("Expected: 10");
        System.out.println("Actual: " + player.getNumber());

        System.out.println("Test #3 - Initialize the points.");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + player.getPoints());

        System.out.println("Test #4 - Initialize the assists.");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + player.getAssists());


    }
    //constructor2
	public static void testConstructor2()
    {
        BasketballPlayer player = new BasketballPlayer("John Travolta", 10);
        System.out.println("Test #1 - Initialize the name.");
        System.out.println("Expected: John Travolta");
        System.out.println("Actual: " + player.getName());

        System.out.println("Test #2 - Initialize the number.");
        System.out.println("Expected: 10");
        System.out.println("Actual: " + player.getNumber());

        System.out.println("Test #3 - Initialize the points.");
        System.out.println("Expected: 5");
        System.out.println("Actual: " + player.getPoints());

        System.out.println("Test #4 - Initialize the assists.");
        System.out.println("Expected: 3");
        System.out.println("Actual: " + player.getAssists());

	}
	//Setting the player name
	public static void testSetName()
    {
        BasketballPlayer player = new BasketballPlayer("James Cameron", 10);
        player.setName("James Smith");
        System.out.println("Test #1 - Updates the state of name.");
        System.out.println("Initial state: James Cameron");
        System.out.println("Name: James Smith");
        System.out.println("Expected: James Smith");
        System.out.println("Actual: " + player.getName());
    }
    //Setting the number
	public static void testSetNumber()
    {
        BasketballPlayer player = new BasketballPlayer("James Cameron", 10);
        player.setNumber(20);
        System.out.println("Test #1 - Updates the state of number.");
        System.out.println("Initial state: 10");
        System.out.println("Number: 20");
        System.out.println("Expected: 20");
        System.out.println("Actual: " + player.getNumber());
    }
    //Setting the points updating values
  	public static void testSetPoints() {
	    BasketballPlayer player = new BasketballPlayer("James Cameron", 10);
	    player.setPoints(5);
	    System.out.println("Test #1 - Updates the state of points.");
	    System.out.println("Initial state: 0");
	    System.out.println("Points: 5");
	    System.out.println("Expected points after setPoints(5): 5");
	    System.out.println("Actual points after setPoints(5): " + player.getPoints());

	    player.setPoints(-3);
	    System.out.println("Test #1 - Does not update the state of points with a negative value.");
	    System.out.println("Initial state: 5");
	    System.out.println("Points: -3");
	    System.out.println("Expected points after setPoints(-3): 0");
	    System.out.println("Actual points after setPoints(-3): " + player.getPoints());

	    player.setPoints(15);
	    System.out.println("Test #1 - Updates the state of points to the maximum limit of 10.");
	    System.out.println("Initial state: 0");
	    System.out.println("Points: 10");
	    System.out.println("Expected points after setPoints(15): 10");
	    System.out.println("Actual points after setPoints(15): " + player.getPoints());
	}

	//Setting the number of assists
	public void testSetAssists()
	{
    BasketballPlayer player = new BasketballPlayer("James Cameron", 10);
    player.setAssists(7);
    System.out.println("Test #1 - Updates the state of assists.");
    System.out.println("Initial state: 0");
    System.out.println("Assists: 7");
    System.out.println("Expected Result: BasketballPlayer[name=James Cameron, points=0, assists=7, rebounds=0]");
    System.out.println("Actual Result: " + player.toString());
    System.out.println();
    }
	//Using toString method as inheritance is not sufficient.
	public void testToString()
	{
    BasketballPlayer player = new BasketballPlayer("James Cameron", 10);
    player.setPoints(5);
    player.setAssists(7);
   	System.out.println("Test #1 - Returns a string representation of the object.");
    System.out.println("Object: BasketballPlayer[name=James Cameron, points=5, assists=7]");
    System.out.println("Expected Result: \"Name: James Cameron, Points: 5, Assists: 7\"");
    System.out.println("Actual Result: \"" + player.toString() + "\"");
    System.out.println();
}
}