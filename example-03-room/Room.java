public class Room
{
    private String name;
    private ArrayList<Door> doors = new ArrayList<Door>();

    public Room(String n) 
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public void addDoorTo(Room adjacent)
    {
        doors.add( new Door(adjacent) );
    }
}