public class Item
{

    private String name;
    private String description;
    private Double weight;
    private Boolean catchable;
    private Integer amountOnRoom;
    private Integer amountOnBackpack;

    public Item(Boolean catchable, String name, String description, Double weight, Integer amountOnRoom, int amountOnBackpack)
    {
        setItemCatchable(catchable);
        setItemName(name);
        setItemDescription(description);
        setItemWeight(weight);
        setItemAmountOnRoom(amountOnRoom);
        setItemAmountOnBackpack(amountOnBackpack);
            }

    /*
        SETTERS
    */


    public void setItemName(String name)
    {
        this.name = name;
    }

    public void setItemDescription(String description)
    {
        this.description = description;
    }

    public void setItemWeight(Double weight)
    {
        this.weight = weight;
    }

    public void setItemCatchable(Boolean catchable)
    {
        this.catchable = catchable;
    }

    public void setItemAmountOnRoom(Integer amountOnRoom)
    {
        this.amountOnRoom = amountOnRoom;
    }

    public void setItemAmountOnBackpack(Integer amountToPut)
    {
        amountOnBackpack = amountToPut;
    }

    public String getItemName()
    {
        return name;
    }

    public String getItemDescription()
    {
        return description;
    }

    public Double getItemWeight()
    {
        return weight;
    }

    public Boolean getItemCatchable()
    {
        return catchable;
    }

    public Integer getItemAmountOnRoom()

    //null treatment to use in calculations.
    // Null item handling is in the game class, with pick and drop methods
    {
        Integer returnAmountOnRoom;
        if (amountOnRoom == null)
        {
            returnAmountOnRoom = 0;
        }
        else
        {
            returnAmountOnRoom = amountOnRoom;
        }
        return returnAmountOnRoom;
    }

    //null treatment to use in calculations.
    // Null item handling is in the game class, with pick and drop methods
    public Integer getItemAmountOnBackpack()
    {
        Integer returnAmountOnBackpack;
        if (amountOnBackpack == null)
        {
            returnAmountOnBackpack = 0;
        }
        else
        {
            returnAmountOnBackpack = amountOnBackpack;
        }
        return returnAmountOnBackpack;
    }

    public void getItemDetails()
    {
        System.out.println("name: " + getItemName());
        System.out.println("Description: " + getItemDescription());
        System.out.println("Weight: " + getItemWeight() + "Kg");
    }

    // CREATE A NEW INSTANCE OF THE ITEM WITH THE SAME STATUS.
    //WITH THIS, YOU CAN CREATE A CLONE OF THE OBJECT STATUS TO HAVE THE SAME ITEM
    //IN DIFFERENT ROOMS, WITH DIFFERENT AMOUNT
    public Item cloneItem(Item item)
    {

        Item newItem;
        newItem = new Item
                (
                        item.getItemCatchable(),
                        item.getItemName(),
                        item.getItemDescription(),
                        item.getItemWeight(),
                        item.getItemAmountOnRoom(),
                        item.getItemAmountOnBackpack()

                );
        return newItem;
    }
}
