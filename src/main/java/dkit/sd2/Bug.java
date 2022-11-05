package dkit.sd2;

/**
 * - uses enum Direction as datatype of direction instance variable.
 * - uses static Counter to give each new Bug a unique sequential ID
 */
public class Bug
{
    private String id;          // unique id code e.g. "B1"
    private int position;       // range:  negative...0...positive
    private Direction direction;        // an Enum (Enumeration)
    private static int counter = 0;     //class variable to maintain count

    public Bug(int initialPosition)
    {
        this.id =  "B" + counter;
        this.position = initialPosition;
        this.direction = Direction.RIGHT; // default initial direction
        counter++;
    }

    public int getPosition()
    {
        return this.position;
    }

    public String getId()
    {
        return id;
    }

    public void turn()
    {
        if (this.direction == Direction.RIGHT)
        {
            this.direction = Direction.LEFT;
        }
        else
        {
            this.direction = Direction.RIGHT;
        }
    }

    /**
     * Move Bug object one place along line in direction it's facing.
     * If RIGHT then add 1, if LEFT then subtract 1
     */
    public void move()
    {
        if (this.direction == Direction.RIGHT)
        {
            this.position += 1;
        }
        else
        {
            this.position -= 1;
        }
    }

    public Direction getDirection()
    {
        return this.direction;
    }

    @Override
    public String toString()
    {
        return "Bug{" +
                "id=" + id +
                ", position=" + position +
                ", direction=" + direction +
                '}';
    }
}

