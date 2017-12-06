public class ClientApp
{
    public void run()
    {
        ArrayList<Room> house = buildHouse();
        System.out.print( house.get(1).getName() );
        // STOP TRACING HERE. SHOW FINAL PICTURE OF MEMORY FOR THIS POINT
    }
 
    private ArrayList<Room> buildHouse()
    {
        ArrayList<Room> underConstruction = new ArrayList<Room>();
        Room living = new Room("living room");
        Room dining = new Room("dining room");
        Room bedroom = new Room("bedroom");
        living.addDoorTo(dining);
        dining.addDoorTo(living);
        living.addDoorTo(bedroom);
        bedroom.addDoorTo(living);
        underConstruction.add(living);
        underConstruction.add(dining);
        underConstruction.add(bedroom);
        return underConstruction;
    }
}