
import java.util.HashMap;


/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 *
 * A "Room" represents one location in the scenery of the game.  It is
 * connected to other rooms via exits.  The exits are labelled north,
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class Room
{

    private String description;
    private HashMap<String, Room> exits = new HashMap();

    /**
     * Create a room described "description". Initially, it has no exits.
     * "description" is something like "a kitchen" or "an open court yard".
     *
     * @param description The room's description.
     */
    public Room(String description)
    {
        this.description = description;
    }

    /**
     * Define the exits of this room. Every direction either leads to another
     * room or is null (no exit there).
     *
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west, Room up, Room down)
    {
        if (north != null)
        {
            exits.put("north", north);
        }
        if (east != null)
        {
            exits.put("east", east);
        }
        if (south != null)
        {
            exits.put("south", south);
        }
        if (west != null)
        {
            exits.put("west", west);
        }
        if (up != null)
        {
            exits.put("up", up);
        }
        if (down != null)
        {
            exits.put("down", down);
        }
    }

    public Room getExit(String direction)
    {
        if (direction.equals("north"))
        {
            return exits.get(direction);
        }
        if (direction.equals("east"))
        {
            return exits.get(direction);
        }
        if (direction.equals("south"))
        {
            return exits.get(direction);
        }
        if (direction.equals("west"))
        {
            return exits.get(direction);
        }
        if (direction.equals("up"))
        {
            return exits.get(direction);
        }
        if (direction.equals("down"))
        {
            return exits.get(direction);
        }

        return null;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    public String getExitString()
    {
        String returnstring = "";
        if (this.getExit("north") != null)
        {
            returnstring += "north ";
        }
        if (this.getExit("east") != null)
        {
            returnstring += "east ";
        }
        if (this.getExit("south") != null)
        {
            returnstring += "south ";
        }
        if (this.getExit("west") != null)
        {
            returnstring += "west ";
        }
        if (this.getExit("up") != null)
        {
            returnstring += "up ";
        }
        if (this.getExit("down") != null)
        {
            returnstring += "down ";
        }
        return returnstring;
    }

}
