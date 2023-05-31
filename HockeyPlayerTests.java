
 /**
  * The is a test program HockeyPlayerTests expected values to actual values and modifying them.
  * Chapter 10 Object-Oriented Programming, Part 3: Inheritance, Polymorphism, and Interfaces
  * @author:
  * @version: 1.0.0
 */
public class HockeyPlayerTests
{
    public static void main(String[] args)
    {
        testConstructor1();
        testConstructor2();
        testSetName();
        testSetNumber();
        testSetGoals();
        HockeyPlayerTests test = new HockeyPlayerTests();
        test.testSetAssists();
        test.testToString();
		test.testGetPoints();

    }
	// Constructor1
    public static void testConstructor1()
    {
        HockeyPlayer player = new HockeyPlayer("Steven Spielberg", 10);
        System.out.println("Test #1 - Initialize the name.");
        System.out.println("Expected: Steven Spielberg");
        System.out.println("Actual: " + player.getName());

        System.out.println("Test #2 - Initialize the number.");
        System.out.println("Expected: 10");
        System.out.println("Actual: " + player.getNumber());

        System.out.println("Test #3 - Initialize the goals.");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + player.getGoals());

        System.out.println("Test #4 - Initialize the assists.");
        System.out.println("Expected: 0");
        System.out.println("Actual: " + player.getAssists());
    }
	// Constructor2
    public static void testConstructor2()
    {
        HockeyPlayer player = new HockeyPlayer("Steven Spielberg", 10, 5, 3);
        System.out.println("Test #1 - Initialize the name.");
        System.out.println("Expected: Steven Spielberg");
        System.out.println("Actual: " + player.getName());

        System.out.println("Test #2 - Initialize the number.");
        System.out.println("Expected: 10");
        System.out.println("Actual: " + player.getNumber());

        System.out.println("Test #3 - Initialize the goals.");
        System.out.println("Expected: 5");
        System.out.println("Actual: " + player.getGoals());

        System.out.println("Test #4 - Initialize the assists.");
        System.out.println("Expected: 3");
        System.out.println("Actual: " + player.getAssists());
    }
	//Changing player name
    public static void testSetName()
    {
        HockeyPlayer player = new HockeyPlayer("Steven Spielberg", 10);
        player.setName("James Smith");
        System.out.println("Test #1 - Updates the state of name.");
        System.out.println("Initial state: Steven Spielberg");
        System.out.println("Name: James Smith");
        System.out.println("Expected: James Smith");
        System.out.println("Actual: " + player.getName());
    }
	//Changing number
    public static void testSetNumber()
    {
        HockeyPlayer player = new HockeyPlayer("Steven Spielberg", 10);
        player.setNumber(20);
        System.out.println("Test #1 - Updates the state of number.");
        System.out.println("Initial state: 10");
        System.out.println("Number: 20");
        System.out.println("Expected: 20");
        System.out.println("Actual: " + player.getNumber());
        System.out.println("yooooooooooooooooooo");
    }
	//Setting the number of goals
    public static void testSetGoals()
    {
        HockeyPlayer player = new HockeyPlayer("Steven Spielberg", 10);
        player.setGoals(5);
        System.out.println("Test #1 - Updates the state of goals.");
        System.out.println("Initial state: 0");
        System.out.println("Goals: 5");
        System.out.println("Expected: 5");
        System.out.println("Actual: " + player.getGoals());
    }
	//Setting the number of assists
	public void testSetAssists()
	{
	    HockeyPlayer player = new HockeyPlayer("John Smith", 7, 2, 3);
	    player.setAssists(5);
	    int expected = 5;
	    int actual = player.getAssists();
	    if(expected != actual)
	    {
	        System.out.println("Test failed: setAssists() method.");
	    } else {
	        System.out.println("Test passed: setAssists() method.");
	    }

	}
	//Getting the points
	public void testGetPoints()
	{
	    HockeyPlayer player = new HockeyPlayer("Steven Spielberg", 10, 5, 3);
	    int expected = 8; // goals * 2 + assists = 5 * 2 + 3 = 13
	    int actual = player.getPoints();
	    if(expected != actual)
	    {
	        System.out.println("Test failed: getPoints() method.");
	    } else {
	        System.out.println("Test passed: getPoints() method.");
	    }
	}

	// Utilizing method as the default inherited values lack certain feautres.
	public void testToString()
	{
	    HockeyPlayer player = new HockeyPlayer("Steven Spielberg", 99, 10, 20);
	    String expected = "Hockey Player - Steven Spielberg [99], Points: 30";
	    String actual = player.toString();

	    if (expected.equals(actual))
	    {
	        System.out.println("Test passed!");
	    } else {
	        System.out.println("Test failed. Expected: " + expected + ", Actual: " + actual);
	    }


	}

	}



