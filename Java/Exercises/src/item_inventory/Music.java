package item_inventory;

public class Music extends Item{
    private String music;

    // Construct a new book object.
    public Music(int id, String t, double p, String a){
        super(id, t, p);
        music = a;
    }

    // Return the item type. Overrides method from class Item.
    public String getItemType(){
        return "Music";
    }

    // Return a printable String representation of this item.
    // Overrides method from class Item.
    public String toString(){
        String part1, part2, out;
        part1 = super.toString();
        part2 = String.format("Music:      %s%n", music);
        out = part1 + part2;
        return out;
    }
}

