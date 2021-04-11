
import java.util.Set;
import java.util.HashMap;


/**
 * Class Room - a room in an adventure game.
 * <p>
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 * <p>
 * A "Room" represents one location in the scenery of the game.  It is
 * connected to other rooms via exits.  For each existing exit, the room
 * stores a reference to the neighboring room.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Room
{
    private String description;
    private HashMap <String, Room> exits;        // stores exits of this room.
    private HashMap <String, Item> itemsOnRoom;   // items on the act
    private Boolean needKey;


    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     *
     * @param description The room's description.
     */
    public Room(String description, Boolean needKey)
    {
        this.description = description;
        exits = new HashMap <>();
        itemsOnRoom = new HashMap <>();
        this.needKey = needKey;
    }

    public void setNeedKey(Boolean needKey)
    {
        this.needKey = needKey;
    }

    public Boolean getNeedKey()
    {
        return needKey;
    }

    /**
     * Define an exit from this room.
     *
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * Return a description of the room in the form:
     * You are in the kitchen.
     * Exits: north west
     *
     * @return A long description of this room
     */
    public String getLongDescription()
    {

        return "You are " + description + ".\n" + getExitString();
    }

    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     *
     * @return Details of the room's exits.
     */
    private String getExitString()
    {

        String returnString = "Exits:";
        Set <String> keys = exits.keySet();
        for (String exit : keys)
        {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     *
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction)
    {

        return exits.get(direction);
    }

    /**
     * Create a new item on the room
     */
    public void setItemsOnRoom(String itemKey, Item item)
    {
        itemsOnRoom.put(itemKey, item);
    }

    /**
     * Remove a item from the room if not null
     */
    public void removeItemFromRoom(String key)
    {
        if (getItemOfRoom(key) == null)
        {
            System.out.println("Item not found.");
        }
        else
        {
            itemsOnRoom.remove(key);
        }
    }

    /**
     * Return the item on room using a key parameter.
     * Return null if the item not exist.
     */
    public Item getItemOfRoom(String key)
    {
        return itemsOnRoom.get(key);
    }

    /**
     * Return all itens in the room.
     */
    public String getAllItemsFromRoom()
    {
        String returnString = "Items around:";
        Set <String> keys = itemsOnRoom.keySet();

        for (String items : keys)
        {
            returnString += (" " + items + "[" + getItemOfRoom(items).getItemAmountOnRoom() + "]");
        }
        return returnString;
    }


}

