
 /**
  * The is a class created for basketballplayer values.
  * Chapter 10 Object-Oriented Programming, Part 3: Inheritance, Polymorphism, and Interfaces
  * @author:
  * @version: 1.0.0
 */
public class BasketballPlayer extends Player
{
    private int freeThrows; // number of free throws made by the player
    private int fieldGoals; // number of field goals made by the player
    private int threePointers; // number of three pointers made by the player
    private int assists; // number of assists made by the player

    // constructor that sets the name, number, and initializes all stats to 0
    public BasketballPlayer(String name, int number)
    {
        super(name, number); // calls the constructor of the parent class Player with the name and number parameters
        this.freeThrows = 0;
        this.fieldGoals = 0;
        this.threePointers = 0;
        setPoints(0); // initializes the player's points to 0
    }

    // getter method for free throws
    public int getFreeThrows()
    {
        return freeThrows;
    }

    // setter method for free throws that updates the points based on the new value of free throws
    public void setFreeThrows(int freeThrows)
    {
        this.freeThrows = freeThrows;
        // updates the player's points based on the new value of free throws, field goals, and three pointers
        setPoints((freeThrows * 1) + (fieldGoals * 2) + (threePointers * 3));
    }

    // getter method for field goals
    public int getFieldGoals()
    {
        return fieldGoals;
    }

    // setter method for field goals that updates the points based on the new value of field goals
    public void setFieldGoals(int fieldGoals)
    {
        this.fieldGoals = fieldGoals;
        // updates the player's points based on the new value of free throws, field goals, and three pointers
        setPoints((freeThrows * 1) + (fieldGoals * 2) + (threePointers * 3));
    }

    // getter method for three pointers
    public int getThreePointers()
    {
        return threePointers;
    }

    // setter method for three pointers that updates the points based on the new value of three pointers
    public void setThreePointers(int threePointers)
    {
        this.threePointers = threePointers;
        // updates the player's points based on the new value of free throws, field goals, and three pointers
        setPoints((freeThrows * 1) + (fieldGoals * 2) + (threePointers * 3));
    }

    // getter method for points, which is inherited from the parent class Player
    public int getPoints() {
        return super.getPoints();
    }

    // setter method for points, which is inherited from the parent class Player
    public void setPoints(int points)
    {
        super.setPoints(points);
    }

    // getter method for assists
    public int getAssists()
    {
        return assists;
    }

    // setter method for assists
    public void setAssists(int assists)
    {
        this.assists = assists;
    }

    // overrides the toString method of the parent class Player to include the player's points and a label indicating that this is a basketball player
    @Override
    public String toString()
    {
        return "Basketball Player - " + super.toString() + ", Points: " + getPoints();
    }
}
