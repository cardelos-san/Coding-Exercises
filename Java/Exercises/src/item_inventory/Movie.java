package item_inventory;

public class Movie extends Item{
    private String movieStar;

    // Construct a new book object.
    public Movie(int id, String t, double p, String a){
        super(id, t, p);
        movieStar = a;
    }

    // Return the item type. Overrides method from class Item.
    public String getItemType(){
        return "Movie";
    }

    // Return a printable String representation of this item.
    // Overrides method from class Item.
    public String toString(){
        String part1, part2, out;
        part1 = super.toString();
        part2 = String.format("Movie Star:  %s%n", movieStar);
        out = part1 + part2;
        return out;
    }
}

