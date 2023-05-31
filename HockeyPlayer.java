
 /**
  * The is a class created for hockeyPlayer values.
  * Chapter 10 Object-Oriented Programming, Part 3: Inheritance, Polymorphism, and Interfaces
  * @author:
  * @version: 1.0.0
 */
	// Hocker player extends Player class
public class HockeyPlayer extends Player
{
    private int goals;
    private int assists;
	// Constructor
    public HockeyPlayer(String name, int number)
    {
        super(name, number);
        this.goals = 0;
        this.assists = 0;
    }
	// Overloaded constructor
    public HockeyPlayer(String name, int number, int goals, int assists)
    {
        super(name, number);
        this.goals = goals;
        this.assists = assists;
        setPoints(goals + assists);
    }
	// Accessor method
    public int getGoals()
    {
        return goals;
    }
	// Mutator
    public void setGoals(int goals)
    {
        this.goals = goals;
        setPoints(goals + assists);
    }
	// Accessor
    public int getAssists() {
        return assists;
    }
	// Mutator
    public void setAssists(int assists)
    {
        this.assists = assists;
        setPoints(goals + assists);
    }

	@Override
    public String toString()
    {
        return "Hockey Player - " + super.toString() + ", Points: " + getPoints();
    }
    @Override
	public boolean equals(Object obj)
	{
	    if (obj == this)
	    {
	        return true;
	    }
	    if (!(obj instanceof HockeyPlayer))
	    {
	        return false;
	    }
	    HockeyPlayer other = (HockeyPlayer) obj;
	    return super.equals(obj) && this.goals == other.goals && this.assists == other.assists;
}

}
