public class Player
	{
	//instance variables
    private String name;
    private int number;
    private int points;

    // Initializing default constructor
	public Player()
	{
	    this.name = "";
	    this.number = 0;
	    this.points = 0;
    }
	//Overloaded constructor with two parameters
    public Player(String name, int number)
    {
        this.name = name;
        this.number = number;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }
	@Override
    public String toString() {
        return name + " [" + number + "]";
    }
    @Override
	public boolean equals(Object obj) {
	    if (obj == null) return false;
	    if (getClass() != obj.getClass()) return false;

	    Player other = (Player) obj;
	    return this.name.equals(other.name) && this.number == other.number;
    }

}
