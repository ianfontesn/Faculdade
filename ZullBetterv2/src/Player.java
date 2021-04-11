import java.util.HashMap;
import java.util.Set;

public class Player
{
    private Room currentRoom;
    private HashMap <String, Item> backpack;   //player backpack to save items.

    public Player()
    {
        backpack = new HashMap <>();
    }

    public void setCurrentRoom(Room currentRoom)
    {
        this.currentRoom = currentRoom;
    }

    public void setBackpackItem(String key, Item item)
    {
        backpack.put(key, item);
    }

    public Room getCurrentRoom()
    {
        return currentRoom;
    }

    // RETURN THE AMOUNT OF A ITEM IN BACKPACK
    public Integer getAmountOnBackpack(String key)
    {
        Integer returnAmount;
        if (backpack.get(key).getItemAmountOnBackpack() != null)
        {
            returnAmount = backpack.get(key).getItemAmountOnBackpack();
        }
        else
        {
            returnAmount = 0;
        }
        return returnAmount;
    }

    public Item getBackpackItem(String key)
    {
        return backpack.get(key);
    }

    /**
     * RETURN A STRING WITH ALL ITEMS AND AMOUNTS ON BACKPACK
     */
    public String getAllItemsOnBackpack()
    {
        String returnString = "Items on Backpack:";
        Set <String> keys = backpack.keySet();
        for (String items : keys)
        {
            returnString += " " + items + "[" + backpack.get(items).getItemAmountOnBackpack() + "]";
        }
        return returnString;
    }


    public void removeItemFromBackpack(String key)
    {
        backpack.remove(key);
    }


    /**
     * RETURN A STRING WITH THE DETAILS OF GAME LIKE
     * THE ITEMS ON BACKPACK, OR ITEMS AROUND (AND THE AMOUNT OF ALL )
     * THE ITEM SPECIFY, AND THE ROOM
     */
    public void look(Command command)
    {
        String key = command.getSecondWord();
        Room currentRoom = getCurrentRoom();

        if (key != null)
        {
            if (backpack.containsKey(key))
            {
                backpack.get(key).getItemDetails();  // details case item on backpack
            }
            else if (currentRoom.getItemOfRoom(key) != null)
            {
                currentRoom.getItemOfRoom(key).getItemDetails();  // details case item on room
            }
            else if (key.equals("backpack"))
            {
                System.out.println(getAllItemsOnBackpack());  // show items on backpack
            }
            else if (backpack.get(key) == null && currentRoom.getItemOfRoom(key) == null)
            {
                System.out.println("Item not found.");
            }
        }
        else    //show itens and exits around
        {
            System.out.println(currentRoom.getLongDescription());
            System.out.println(currentRoom.getAllItemsFromRoom());
        }
    }


    public Boolean backpackContainsItem(String key)
    {
        return backpack.containsKey(key);
    }

}