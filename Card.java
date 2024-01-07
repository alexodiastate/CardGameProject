
/**
 * Class for each individual card
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    String s;
    String n;
    int v;
    
    //
    public Card(String Suit, String number, int value)
    {
        s = Suit;
        n = number;
        v = value;
    }
    
    public String getSuit(){
        return s;
    }
    public String getNumber(){
        return n;
    }
    public int getValue(){
        return v;
    }
}
