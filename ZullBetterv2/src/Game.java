import java.util.*;

/**
 * This class is the main class of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.  Users
 * can walk around some scenery. That's all. It should really be extended
 * to make it more interesting!
 * <p>
 * To play this game, create an instance of this class and call the "play"
 * method.
 * <p>
 * This main class creates and initialises all the others: it creates all
 * rooms, creates the parser and starts the game.  It also evaluates and
 * executes the commands that the parser returns.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class Game
{

    private Parser parser;
    private Player player;
    private ArrayList<Room> roomsCollection;
    private HashMap<String, Item> keyPieces;


    /**
     * Create the game and initialise its internal map.
     */
    public Game()
    {
        parser = new Parser();
        player = new Player();
        roomsCollection = new ArrayList <>();
        keyPieces = new HashMap <>();
        createRooms();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room startRoom, r1, r2, r3, r4, r5, r6, r7, r8, r9, endRoom;

        // create the rooms
        startRoom = new Room
                (
                        "in a dark room.",
                        false
                );

        r1 = new Room
                (
                        "in a strange hot room. ",
                        false
                );

        r2 = new Room
                (
                        "in a bad smelling room.",
                        false
                );

        r3 = new Room
                (
                        "in a cold room.",
                        false
                );

        r4 = new Room
                (
                        "in a a room full of blood. A monster is locked in a cage.",
                        true
                );

        r5 = new Room
                (
                        "in a completely inverted room. The decor is on the ceiling.",
                        false
                );

        r6 = new Room
                (
                        "feeling a green grass at your feet, but you cant see anything except the outlets. Better be careful ..",
                        false
                );

        r7 = new Room
                (
                        "completely disoriented, something in this room makes you dizzy",
                        false
                );

        r8 = new Room
                (
                        "in a small room, better get down!",
                        false
                );

        r9 = new Room
                (
                        "in a well-lit room, even too ...",
                        false
                );

        endRoom = new Room
                (
                        "Outside the maze. It looks like the nightmare is over! Congratulations! ",
                        true
                );

        // initialise room exits
        startRoom.setExit("north", r2);

        r1.setExit("north", r4);
        r1.setExit("east", r2);

        r2.setExit("north", r5);
        r2.setExit("south", startRoom);
        r2.setExit("east", r3);
        r2.setExit("west", r1);

        r3.setExit("north", r6);
        r3.setExit("west", r2);

        r4.setExit("south", r1);

        r5.setExit("north", r8);
        r5.setExit("south", r2);
        r5.setExit("east", r6);

        r6.setExit("north", r9);
        r6.setExit("south", r3);
        r6.setExit("west", r5);

        r7.setExit("east", r8);

        r8.setExit("south", r5);
        r8.setExit("east", r9);
        r8.setExit("west", r7);

        r9.setExit("north", endRoom);
        r9.setExit("south", r6);
        r9.setExit("west", r8);

        player.setCurrentRoom(startRoom);  // room to start game

        // add rooms on collection

        roomsCollection.add(startRoom); // 0 index
        roomsCollection.add(r1);
        roomsCollection.add(r2);
        roomsCollection.add(r3);
        roomsCollection.add(r4);
        roomsCollection.add(r5);
        roomsCollection.add(r6);
        roomsCollection.add(r7);
        roomsCollection.add(r8);
        roomsCollection.add(r9);
        roomsCollection.add(endRoom); // index = size();


        /**
         * Create all items and set on the room.
         */
        Item paper, bucket, torch, deadbody, snowball, skeleton, monster, knife, sword, shield, helmet, cup;
        Item table, chair, box, candelabrum, spider, bat, poison, lighting, snake;
        Item piece1, piece2, piece3;


        sword = new Item
                (
                        true,
                        "Devil's sword",
                        "Forged in the depths of the IFMG",
                        3.2,
                        1,
                        0
                );

        cup = new Item
                (
                        true,
                        "Cup of beer",
                        "A cup with beer.",
                        0.1,
                        1,
                        0
                );

        helmet = new Item
                (
                        true,
                        "Steel Helmet",
                        "A helmet desired by many.",
                        10.0,
                        1,
                        0
                );

        shield = new Item
                (
                        true,
                        "Cooper Shield",
                        "A light and shiny shield",
                        5.0,
                        1,
                        0
                );

        knife = new Item
                (
                        true,
                        "Knife",
                        "A bloodstained knife",
                        0.1,
                        1,
                        0
                );

        snake = new Item
                (
                        false,
                        "Snake",
                        "A big snake like anaconda.",
                        10.0,
                        1,
                        0
                );

        chair = new Item
                (
                        false,
                        "Chair",
                        "Does not match much with the table.",
                        3.6,
                        4,
                        0
                );

        torch = new Item
                (
                        false,
                        "Torch",
                        "Help to make more heat.",
                        0.7,
                        1,
                        0
                );

        bat = new Item
                (
                        false,
                        "Bat",
                        "He like a dark room",
                        1.0,
                        4,
                        0
                );

        piece1 = new Item
                (
                        true,
                        "Green Piece of Key",
                        "a piece of a strange key",
                        0.1,
                        0,
                        0
                );

        piece2 = new Item
                (
                        true,
                        "Blue Piece of Key",
                        "a piece of a strange key",
                        0.1,
                        1,
                        0
                );

        piece3 = new Item
                (
                        true,
                        "Red Piece of Key",
                        "a piece of a strange key",
                        0.1,
                        1,
                        0
                );

        paper = new Item
                (
                        false,
                        "Paper with something written",
                        "\nThey say it is impossible to find all 3 pieces of the key that allows you to open the exit door.\n" +
                                   "This maze is scary. Can you get out?",
                        0.1,
                        1,
                        0
                );

        bucket = new Item
                (
                        true,
                        "Bucket",
                        "a bucket with cold water",
                        10.0,
                        1,
                        0
                );

        deadbody = new Item
                (
                        false,
                        "Dead Body",
                        "i think he was not lucky..",
                        70.0,
                        1,
                        0
                );

        snowball = new Item
                (
                        true,
                        "SnowBall",
                        "this is really cold.",
                        0.0,
                        20,
                        0
                );

        skeleton = new Item
                (
                        false,
                        "Frozen Human Skeleton",
                        "The identity in the pocket of the pants is of a man called Aluizio.",
                        75.6,
                        1,
                        0
                );

        monster = new Item
                (
                        false,
                        "Monster",
                        "He looks angry.",
                        150.0,
                        1,
                        0
                );

        table = new Item
                (
                        false,
                        "Square Table",
                        "a square table on the room",
                        4.0,
                        1,
                        0
                );

        box = new Item
                (
                        true,
                        "Little box",
                        "a little box on the table",
                        0.3,
                        1,
                        0
                );

        candelabrum = new Item
                (
                        false,
                        "Beautiful Candelabrum",
                        "Maybe need new candle",
                        1.0,
                        1,
                        0
                );

        spider = new Item
                (
                        false,
                        "Spider",
                        "Can be poisonous",
                        0.1,
                        1,
                        0
                );

        poison = new Item
                (
                        true,
                        "Poison",
                        "It makes you totally disoriented",
                        0.4,
                        30,
                        0
                );

        lighting = new Item
                (
                        false,
                        "Lighting",
                        "something extremely illuminated.",
                        3.0,
                        10,
                        0
                );

        // set arrayList with the keyPieces
        keyPieces.put("piece1", piece1);
        keyPieces.put("piece2", piece2);
        keyPieces.put("piece3", piece3);

        //set items on room
        startRoom.setItemsOnRoom("paper", paper);
        startRoom.setItemsOnRoom("bat", bat);

        r1.setItemsOnRoom("bucket", bucket);
        r1.setItemsOnRoom("torch", torch);

        r2.setItemsOnRoom("deadbody", deadbody);
        r2.setItemsOnRoom("helmet", helmet);
        r2.setItemsOnRoom("cup", cup);
        r2.setItemsOnRoom("knife", knife);

        r3.setItemsOnRoom("skeleton", skeleton);
        r3.setItemsOnRoom("snowball", snowball);
        r3.setItemsOnRoom("sword", sword);
        r3.setItemsOnRoom("shield", shield);

        r4.setItemsOnRoom("monster", monster);

        r5.setItemsOnRoom("table", table);
        r5.setItemsOnRoom("box", box);
        r5.setItemsOnRoom("candelabrum", candelabrum);
        r5.setItemsOnRoom("chair", chair);

        r6.setItemsOnRoom("spider", spider);
        r6.setItemsOnRoom("snake", snake);

        r7.setItemsOnRoom("poison", poison);

        r9.setItemsOnRoom("lighting", lighting);
        r9.setItemsOnRoom("chair", chair);
        r9.setItemsOnRoom("table", table);

    }

    /**
     * Main play routine.  Loops until end of play.
     */
    public void play()
    {
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.

        boolean finished = false;
        while (!finished)
        {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }


    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the maze of nightmare!");
        System.out.println("Look around to know more!");
        System.out.println("Type 'help' if you need more help.");
        System.out.println();
        System.out.println(player.getCurrentRoom().getLongDescription()); // print a long description with exits
        System.out.println(player.getCurrentRoom().getAllItemsFromRoom());  // print all items from room
    }

    /**
     * Given a command, process (that is: execute) the command.
     *
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command)
    {
        boolean wantToQuit = false;

        if (command.isUnknown())
        {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help"))
        {
            printHelp();
        }
        else if (commandWord.equals("go"))
        {
            goRoom(command);
        }
        else if (commandWord.equals("look"))
        {
            player.look(command);
        }
        else if (commandWord.equals("take"))
        {
            setItemInBackpack(command);
        }
        else if (commandWord.equals("drop"))
        {
            removeItemFromBackpack(command);
        }
        else if(commandWord.equals("use"))
        {
            useItem(command);
        }
        else if(commandWord.equals("make"))
        {
            makeKey();
        }
        else if (commandWord.equals("quit"))
        {
            wantToQuit = quit(command);
        }
        // else command not recognised.
        return wantToQuit;
    }

    // implementations of user commands:


    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    private void printHelp()
    {
        System.out.printf
                (
                "\nUse these commands to try to get out of this nightmare: \n" +
                parser.listCommands() + "\n\n" +
                "You can combine a parameter with these commands: \n" +
                "- To go another room: go + exit (north, south, east, west).\n" +
                "- To look in your backpack: look + backpack.\n" +
                "- To look a item: look + item name.\n" +
                "- To look around, just use look without a parameter.\n" +
                "- To use a item: use + item name.\n" +
                "- To make a new item, just say make.\n\n"
                );

        //print all info of room again after use help.
        System.out.println(player.getCurrentRoom().getLongDescription());
        System.out.println(player.getCurrentRoom().getAllItemsFromRoom());
    }

    /**
     * Try to go to one direction. If there is an exit, enter the new
     * room, otherwise print an error message.
     */
    private void goRoom(Command command)
    {
        if (!command.hasSecondWord())
        {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = player.getCurrentRoom().getExit(direction);

        if (nextRoom == null)
        {
            System.out.println("Sorry, not possible.");
        }
        else if (nextRoom.getNeedKey())
        {
            System.out.println("The door is closed, you need use a key to open.");
        }
        else
        {
            player.setCurrentRoom(nextRoom);
            System.out.println(player.getCurrentRoom().getLongDescription());
            System.out.println(player.getCurrentRoom().getAllItemsFromRoom());
        }
    }

    /**
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     *
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command)
    {
        if (command.hasSecondWord())
        {
            System.out.println("Quit what?");
            return false;
        }
        else
        {
            return true;  // signal that we want to quit
        }
    }


    /**
     * THIS FUNCTION VERIFY THE SELECTED ITEM FIRST IN ROOM, IF TRUE
     * VERIFY THE ITEM IS CATCHABLE, IF TRUE,
     * VERIFY THE ITEM ON BACKPACK, IF THE ITEM IS ON BACKPACK, JUST CHANGE THE AMOUNT
     * IN BACKPACK AND ROOM.
     * IF NOT, CREATE A CLONE O THE ITEM, ADD ON THE BACKPACK AND SET THE AMOUNT.
     */
    public void setItemInBackpack(Command command)
    {
        String key = command.getSecondWord();
        Room currentRoom = player.getCurrentRoom();

        if (currentRoom.getItemOfRoom(key) == null)
        {
            System.out.println("Item not found");
        }
        else
        {
            if (currentRoom.getItemOfRoom(key).getItemCatchable())   // if item can catchable
            {
                try
                {
                    Scanner in = new Scanner(System.in);
                    System.out.println("Amount to take: ");
                    Integer amountToPut = in.nextInt();
                    Integer amountOnRoom = currentRoom.getItemOfRoom(key).getItemAmountOnRoom();

                    if (amountToPut < 0)
                    {
                        System.out.println("Please, enter a positive number. Try to take again");
                    }
                    else
                    {
                        if (player.getBackpackItem(key) != null)    // if have the item on room add just amount
                        {
                            Integer amountOnBackpack = player.getBackpackItem(key).getItemAmountOnBackpack();

                            if (amountToPut > 0 && amountToPut < amountOnRoom)   // add on amount just bigger than 0;
                            {
                                player.getBackpackItem(key).setItemAmountOnBackpack(amountOnBackpack + amountToPut);
                                currentRoom.getItemOfRoom(key).setItemAmountOnRoom(amountOnRoom - amountToPut);
                                System.out.println("You got " + amountToPut + " " + key);

                            }
                            else if (amountToPut.equals(amountOnRoom))  //the amount to put is equals the amount in room now
                            {
                                currentRoom.removeItemFromRoom(key);
                                player.getBackpackItem(key).setItemAmountOnBackpack(amountOnBackpack + amountToPut);
                                System.out.println("You got " + amountToPut + " " + key);
                            }
                            else if (amountToPut > amountOnRoom)   //pick up more items than have on the room
                            {

                                System.out.println("there's only " + currentRoom.getItemOfRoom(key).getItemAmountOnRoom() + " " + key + "(s)");
                            }
                        }
                        else
                        {
                            //here clone the item and set new amount.
                            if (amountToPut < amountOnRoom)
                            {
                                player.setBackpackItem(key, currentRoom.getItemOfRoom(key).cloneItem(currentRoom.getItemOfRoom(key))); // create a item on backpack if no have the same
                                player.getBackpackItem(key).setItemAmountOnBackpack(amountToPut); // set amount on backpack
                                currentRoom.getItemOfRoom(key).setItemAmountOnRoom(amountOnRoom - amountToPut); // remove amount on room
                                System.out.println("You got " + amountToPut + " " + key);
                            }
                            else if (amountToPut.equals(amountOnRoom)) //here clone the item and set the amount (but remove the item from room)
                            {
                                player.setBackpackItem(key, currentRoom.getItemOfRoom(key).cloneItem(currentRoom.getItemOfRoom(key))); // create a item on backpack if no have the same
                                player.getBackpackItem(key).setItemAmountOnBackpack(amountToPut); // set amount on backpack
                                currentRoom.removeItemFromRoom(key); // remove item from room
                                System.out.println("You got " + amountToPut + " " + key);
                            }
                            else
                            {
                                System.out.println("There's only " + currentRoom.getItemOfRoom(key).getItemAmountOnRoom() + " " + key + "(s)");
                            }
                        }
                    }
                }
                catch (InputMismatchException needANumberError)
                {
                    System.out.println("Please, enter a valid number. Try to take again");
                }
            }
            else
            {
                System.out.println("You cannot put this item in the backpack...");
            }
        }
    }

    /**
     * REMOVE A ITEM FROM THE BACKPACK AND SET THE CURRENT AMOUNT OR CALL THE FUNCTION TO REMOVE
     * ITEMS FROM THE BACKPACK AND/OR ROOM (look at setItemFromBackpack for more info)
     */
    public void removeItemFromBackpack(Command command)  // and add on room
    {
        Scanner in = new Scanner(System.in);
        String key = command.getSecondWord();

        if (player.getBackpackItem(key) == null)
        {
            System.out.println("Item not found.");
        }
        else
        {
            try
            {
                Integer amount = player.getBackpackItem(key).getItemAmountOnBackpack();
                System.out.println("Amount to drop: ");
                Integer amountToRemove = in.nextInt();

                if (amountToRemove < 0)
                {
                    System.out.println("Please, enter a positive number. Try to drop again.");
                }
                else
                {
                    if (player.getCurrentRoom().getItemOfRoom(key) != null)
                    {
                        Integer amountOnRoom = player.getCurrentRoom().getItemOfRoom(key).getItemAmountOnRoom();

                        if (amount > amountToRemove)            // have more items than tried to remove
                        {
                            player.getBackpackItem(key).setItemAmountOnBackpack(amount - amountToRemove);
                            player.getCurrentRoom().getItemOfRoom(key).setItemAmountOnRoom(amountOnRoom + amountToRemove);
                            System.out.println("You dropped " + amountToRemove + " " + key);
                        }
                        else if (amount.equals(amountToRemove))       // have the same amount
                        {
                            player.removeItemFromBackpack(key);
                            player.getCurrentRoom().getItemOfRoom(key).setItemAmountOnRoom(amountOnRoom + amountToRemove);
                            System.out.println("You dropped " + amountToRemove + " " + key);

                        }
                        else if (amount < amountToRemove)      // have fewer items than tried to remove
                        {
                            System.out.println("There's only " + player.getBackpackItem(key).getItemAmountOnBackpack() + " " + key + "(s)");
                        }
                    }
                    else      // if the item not exist on room, create a new
                    {
                        if (amountToRemove < player.getBackpackItem(key).getItemAmountOnBackpack())
                        {
                            player.getCurrentRoom().setItemsOnRoom(key, player.getBackpackItem(key).cloneItem(player.getBackpackItem(key))); // create a clone of item
                            player.getCurrentRoom().getItemOfRoom(key).setItemAmountOnRoom(amountToRemove);
                            player.getBackpackItem(key).setItemAmountOnBackpack(amount - amountToRemove);
                            System.out.println("You dropped " + amountToRemove + " " + key);
                        }
                        else if (amountToRemove.equals(player.getBackpackItem(key).getItemAmountOnBackpack())) // create a clone of item and set amount
                        {
                            player.getCurrentRoom().setItemsOnRoom(key, player.getBackpackItem(key).cloneItem(player.getBackpackItem(key)));
                            player.getCurrentRoom().getItemOfRoom(key).setItemAmountOnRoom(amountToRemove);
                            player.removeItemFromBackpack(key);
                            System.out.println("You dropped " + amountToRemove + " " + key);
                        }
                        else
                        {
                            System.out.println("There's only " + player.getBackpackItem(key).getItemAmountOnBackpack() + " " + key + "(s)");
                        }
                    }
                }
            }
            catch (InputMismatchException needNumberError)
            {
                System.out.println("Please, enter a valid number. Try to drop again.");
            }
        }
    }

    public void useItem(Command command)
    {
        String key = command.getSecondWord();

        if (!command.hasSecondWord())
        {
            System.out.println("Use what?");
        }
        else
        {
            if (player.getBackpackItem(key) == null)   // item on bp is null or not
            {
                System.out.println("The item needs to be in your backpack.");
            }
            else
            {
                if (key.equals("key"))  // if the second word is to use the key on door
                {
                    System.out.println("Enter the direction of door to use the key: ");
                    Scanner in = new Scanner(System.in);
                    String direction = in.next();

                    if (player.getCurrentRoom().getExit(direction) != null && player.getCurrentRoom().getExit(direction).getNeedKey())  // if room to go is != null
                    {                                                                                                                    // and need use a ket
                        Random random = new Random();
                        int chance = random.nextInt(11);

                        if (chance == 1) //door open, player can use Go command
                        {
                            System.out.println("<Click!>");
                            System.out.println("Its look like the door opened!");
                            player.getCurrentRoom().getExit(direction).setNeedKey(false);
                        }
                        if (chance > 1 && chance <= 5)   // door not open and player teleport if < 5
                        {
                            System.out.println("Oh no! You were teleported to another room!");
                            int idx = random.nextInt(roomsCollection.size());
                            if(getExistingRoom(idx).getNeedKey())
                            {
                                idx++;
                            }
                            else if(idx == roomsCollection.size())
                            {
                                idx--;
                            }
                            player.setCurrentRoom(getExistingRoom(idx)); //set current room to a random room, except the end room
                        }
                        else if (chance > 5 && chance < 10) // door not open and the key broken
                        {
                            System.out.println("For gods, the key magically broken and go away.. lets look again");
                            player.removeItemFromBackpack("key");
                            relocatePiecesOfKey();
                        }
                        else if (chance == 10)
                        {
                            System.out.println("You were killed by something strange, try again! ");
                            System.exit(0);
                        }
                    }
                    else
                    {
                        System.out.println("Sorry, not possible.");
                    }
                }
                else if (key.equals("bucket"))
                {
                    System.out.println("WOW! You found a piece of key in the bucket, but the bucket broken.");
                    player.setBackpackItem("piece1", keyPieces.get("piece1"));
                    player.getBackpackItem("piece1").setItemAmountOnBackpack(1);
                    player.removeItemFromBackpack(key);

                }
                else if (key.equals("box"))
                {
                    System.out.println("YEAH!! You found a piece o key in the box, but the box broken. ");
                    player.setBackpackItem("piece2", keyPieces.get("piece2"));
                    player.getBackpackItem("piece2").setItemAmountOnBackpack(1);
                    player.removeItemFromBackpack(key);
                }

                else if (key.equals("poison"))
                {
                    Random random = new Random();
                    int chance = random.nextInt(11);

                    if (chance <= 1)
                    {
                        System.out.println("You DIE. The poison is very strong for you. Try again");
                        System.exit(0);
                    }
                    else if (chance > 1 && chance <= 8)
                    {
                        Integer amountNow = player.getBackpackItem(key).getItemAmountOnBackpack();
                        //if only one poison in backpack, use and remove item
                        if (amountNow == 1)
                        {
                            player.removeItemFromBackpack(key);
                        }
                        else  // just change the amount -1
                        {
                            player.getBackpackItem(key).setItemAmountOnBackpack(amountNow-1);
                        }

                        System.out.println("the poison has further disoriented you, but maybe you want to die .. why don't you use it again?");
                    }
                    else if (chance > 8 )
                    {
                        System.out.println("AMAZING! The poison let you you see a piece of a key on the ground. Look around and get the piece");
                        System.out.println("But magically all doses of poison have disappeared");
                        player.getCurrentRoom().setItemsOnRoom("piece3", keyPieces.get("piece3"));
                        player.getCurrentRoom().getItemOfRoom("piece3").setItemAmountOnRoom(1);

                        if (player.getBackpackItem(key) != null)
                        {
                            player.removeItemFromBackpack(key);
                        }
                        if (player.getCurrentRoom().getItemOfRoom(key) != null)
                        {
                            player.getCurrentRoom().removeItemFromRoom(key);
                        }
                    }

                }
            }
        }
    }

    public Item getPieceOfKeyFromList(String key)
    {
        return keyPieces.get(key);
    }

    public Room getExistingRoom(int room)
    {
        return roomsCollection.get(room);
    }

    //relocate all pieces of key in a random room
    public void relocatePiecesOfKey()
    {
        Random random = new Random();
        Set <String> pieces = keyPieces.keySet();

        for(String piece : pieces)
        {
            int idx = random.nextInt(roomsCollection.size());

            if(getExistingRoom(idx).getNeedKey())
            {
                idx++;
            }
            else if(idx == roomsCollection.size())
            {
                idx--;
            }

            roomsCollection.get(idx).setItemsOnRoom(piece, keyPieces.get(piece));
            roomsCollection.get(idx).getItemOfRoom(piece).setItemAmountOnRoom(1);
        }
    }


    /**
     * Verify all pieces of key in backpack and make a key with all parts
     * remove the pieces from backpack
     */
    public void makeKey()
    {
        Set <String> pieces = keyPieces.keySet();
        Boolean makeKey = true;

        for (String piece : pieces)
        {
            if(!player.backpackContainsItem(piece))
            {
                  makeKey = false;
            }
        }

        if (makeKey)
        {
            Item key;
            key = new Item
                    (
                            true,
                            "Complete key.",
                            "A amazing key.",
                            0.1,
                            0,
                            1
                    );

            player.setBackpackItem("key", key);
            System.out.println("<Tic, tic, TIC..>  Amazing! the key is now complete! You can use to open closed doors!");

            // remove pieces

            for(String removePiece : pieces)
            {
                player.removeItemFromBackpack(removePiece);
            }
        }
        else
        {
            System.out.println("Maybe parts of the key are missing...");
        }
    }

}